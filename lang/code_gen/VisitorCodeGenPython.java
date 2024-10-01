package lang.code_gen;

import lang.ast.*;
import lang.interpreter.Visitor;
import lang.semantic.FuncTypes;
import lang.semantic.LocalEnv;
import lang.semantic.SType;
import lang.semantic.TyEnv;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class VisitorCodeGenPython extends Visitor {

	private STGroup groupTemplate;
	private ST type, stmt, expr, var;
	private ST template;
	private List<ST> funcs, params, datas, dcls;
	private TyEnv<LocalEnv<SType>> env;
	private String fileName;

	public VisitorCodeGenPython(String fileName, TyEnv<LocalEnv<SType>> env) {
		groupTemplate = new STGroupFile("./lang/code_gen/templates/python.stg");
		this.fileName = fileName;
		this.env = env;

	}

	@Override
	public void visit(Program p) {
		template = groupTemplate.getInstanceOf("program");
		datas = new ArrayList<ST>();
		for (Data d : p.getDatas()) {
			d.accept(this);
		}
		template.add("datas", datas);

		funcs = new ArrayList<ST>();
		for (Function func : p.getFunction()) {
			func.accept(this);
		}

		template.add("funcs", funcs);

		try {
			PrintStream ps = new PrintStream("lang/code_gen/gen_files/" + "generated.py");
			ps.println(template.render());

			System.out.println("File converted Path=lang/code_gen/gen_files/" + "generated.py");
		} catch (Exception e) {
			System.out.println("Erro to convert Lang to Python");
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void visit(Data d) {
		ST data = groupTemplate.getInstanceOf("data");

		data.add("name", d.getId());
		dcls = new ArrayList<ST>();

		for (DataDeclaration dcl : d.getDeclarations()) {

			ST decl = groupTemplate.getInstanceOf("decl");

			decl.add("id", dcl.getId());
			dcls.add(decl);
		}
		data.add("decl", dcls);
		datas.add(data);
	}

	@Override
	public void visit(Function f) {
		ST func = groupTemplate.getInstanceOf("func");
		func.add("name", f.getID());

		if (f.getParams() != null && f.getParams().getTypes().size() > 0) {
			System.out.println(f.getParams().toString());
			Params param = f.getParams();

			List<String> idsTypes = param.getIDs();
			param.accept(this);

			ST paramsF = groupTemplate.getInstanceOf("separatedValues");

			for (int index = 0; index < idsTypes.size(); index++) {
				ST paramST = groupTemplate.getInstanceOf("param");
				String paramID = idsTypes.get(index);
				paramST.add("id", paramID);

				paramsF.add("value", paramST);
			}

			func.add("params", paramsF);

		}

		if (f.getCommands() != null) {
			for (Command command : f.getCommands()) {
				command.accept(this);

				func.add("cmds", stmt);
				stmt = null;
			}
		}
		System.out.println("FIM");

		funcs.add(func);

	}

	@Override
	public void visit(Params p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(DataDeclaration dd) {

	}

	@Override
	public void visit(IntType it) {
		type = groupTemplate.getInstanceOf("int_type");

	}

	@Override
	public void visit(BoolType bt) {
		type = groupTemplate.getInstanceOf("boolean_type");

	}

	@Override
	public void visit(CharType ct) {
		type = groupTemplate.getInstanceOf("char_type");

	}

	@Override
	public void visit(FloatType ft) {
		type = groupTemplate.getInstanceOf("float_type");

	}

	@Override
	public void visit(ArrayType at) {
		ST arrayType = groupTemplate.getInstanceOf("array");
		at.getType().accept(this); 
		System.out.println("to "+ at.getType().toString());
		System.out.println(type.render());
		arrayType.add("type", type);
		type = arrayType;

	}

	@Override
	public void visit(NameType at) {
		type = groupTemplate.getInstanceOf("data_type");
		type.add("data", at.getName());

	}

	@Override
	public void visit(Command cm) {
		cm.accept(this);

	}

	@Override
	public void visit(CommandList cl) {
		for (Command command : cl.getCommands()) {
			command.accept(this);
		}

	}

	@Override
	public void visit(IfCommand ifc) {
		ST cmd = groupTemplate.getInstanceOf("cmd");
		ST ifCmd = groupTemplate.getInstanceOf("if");
		ifc.getExp().accept(this);
		ifCmd.add("test", expr);

		if (ifc.getCmd() instanceof CommandList) {
			CommandList cmdList = (CommandList) ifc.getCmd();
			for (Command command : cmdList.getCommands()) {
				command.accept(this);
				System.out.println("if");
				System.out.println(stmt.render());
				ifCmd.add("cmds", stmt);
			}
		} else {
			ifc.getCmd().accept(this);
			ifCmd.add("cmds", stmt);
		}
		System.out.println("if");
		System.out.println(ifCmd.render());
		cmd.add("stmt", ifCmd);
		stmt = cmd;

	}

	@Override
	public void visit(IfElseCommand ifElsec) {
		// COLOCAR NO RELATORIO QUE O VISITOR ESTAVA RECONHECHENDO O MESMO COMANDO PARA
		// O IF E ELSE
		ST cmd = groupTemplate.getInstanceOf("cmd");
		ST ifCmd = groupTemplate.getInstanceOf("if");
		ifElsec.getExp().accept(this);

		ifCmd.add("test", expr);

		if (ifElsec.getCmd() instanceof CommandList) {
			CommandList cmdList = (CommandList) ifElsec.getCmd();
			for (Command command : cmdList.getCommands()) {
				command.accept(this);

				ifCmd.add("cmds", stmt);
			}
		} else {
			ifElsec.getCmd().accept(this);
			ifCmd.add("cmds", stmt);
		}

		if (ifElsec.getElsCmd() instanceof CommandList) {

			CommandList cmdList = (CommandList) ifElsec.getElsCmd();
			for (Command command : cmdList.getCommands()) {
				command.accept(this);
				ifCmd.add("elseCmds", stmt);
			}
		} else {

			System.out.println(ifElsec.getElsCmd().toString());
			ifElsec.getElsCmd().accept(this);
			ifCmd.add("elseCmds", stmt);

		}

		cmd.add("stmt", ifCmd);
		stmt = cmd;

	}

	@Override
	public void visit(IterateCommand iteratec) {

		ST cmd = groupTemplate.getInstanceOf("cmd");
		ST iterate = groupTemplate.getInstanceOf("iterate");
		iteratec.getExp().accept(this);
		iterate.add("numLoop", expr);

		if (iteratec.getCommand() instanceof CommandList) {
			CommandList cmdList = (CommandList) iteratec.getCommand();
			for (Command command : cmdList.getCommands()) {
				command.accept(this);
				iterate.add("cmds", stmt);
			}
		} else {
			iteratec.getCommand().accept(this);
			iterate.add("cmds", stmt);
		}

		cmd.add("stmt", iterate);
		stmt = cmd;
	}

	@Override
	public void visit(ReadCommand readc) {
		ST cmd = groupTemplate.getInstanceOf("cmd");
		ST assign = groupTemplate.getInstanceOf("assign");
		readc.getLValue().accept(this);
		ST var = expr;
		assign.add("var", var);
		assign.add("exp", "input()");

		cmd.add("stmt", assign);

		stmt = cmd;

	}

	@Override
	public void visit(PrintCommand printc) {
		ST cmd = groupTemplate.getInstanceOf("cmd");
		ST print = groupTemplate.getInstanceOf("print");
		printc.getExp().accept(this);
		print.add("exp", expr);

		cmd.add("stmt", print);

		stmt = cmd;

	}

	@Override
	public void visit(ReturnCommand returnc) {
		System.out.println("ReturnMultCommand");
		ST cmd = groupTemplate.getInstanceOf("cmd");
		ST returnST = groupTemplate.getInstanceOf("separatedValues");

		returnc.getExp().accept(this);

		returnST.add("value", expr);

		cmd.add("stmt", "return " + returnST.render());

		stmt = cmd;

	}

	@Override
	public void visit(ReturnMultCommand returnMultc) {

		ST cmd = groupTemplate.getInstanceOf("cmd");
		ST returnST = groupTemplate.getInstanceOf("separatedValues");

		for (Exp exp : returnMultc.getExps()) {

			exp.accept(this);
			returnST.add("value", expr);
		}

		cmd.add("stmt", "return " + returnST.render());

		stmt = cmd;

	}

	@Override
	public void visit(AssignCommand assignc) {

		ST cmd = groupTemplate.getInstanceOf("cmd");
		stmt = groupTemplate.getInstanceOf("assign");

		LValue lvalue = assignc.getLValue();
		lvalue.accept(this);

		// Atribuição para variáveis simples
		if (lvalue instanceof IDLValue) {
			stmt.add("var", expr);
			assignc.getLExp().accept(this);

			stmt.add("exp", expr);

			cmd.add("stmt", cmd);
		} else if (lvalue instanceof DotLValue) {
			stmt.add("var", expr);
			assignc.getLExp().accept(this);

			stmt.add("exp", expr);

			cmd.add("stmt", cmd);

		} else if (lvalue instanceof ArrayAccess) {
			stmt.add("var", expr);
			assignc.getLExp().accept(this);

			stmt.add("exp", expr);

			cmd.add("stmt", cmd);
		}

	}

	@Override
	public void visit(FunctionCall fc) {
		ST cmd = groupTemplate.getInstanceOf("cmd");
		ST funcCall = groupTemplate.getInstanceOf("functionCall");
		String ID = fc.getID();

		funcCall.add("functionName", ID);

		FunCallParams paramsFcall = fc.getFunCallParams();

		if (paramsFcall.getExps() != null) {
			ST params = groupTemplate.getInstanceOf("separatedValues");
			for (Exp exp : paramsFcall.getExps()) {
				exp.accept(this);
				params.add("value", expr);
			}
			funcCall.add("params", params);
		}

		List<LValue> lvalues = fc.getLvalues();

		if (lvalues != null && lvalues.size() > 0) {
			// Verifica se a função tem valores de retorno
			ST returnST = groupTemplate.getInstanceOf("separatedValues");

			for (int i = 0; i < lvalues.size(); i++) {
				LValue l = lvalues.get(i);

				l.accept(this);
				returnST.add("value", expr);

			}
			funcCall.add("return", returnST);
		}

		cmd.add("stmt", funcCall);

		stmt = cmd;

	}

	@Override
	public void visit(AndExp andexp) {
		ST exp = groupTemplate.getInstanceOf("exp");

		andexp.getLeft().accept(this);
		exp.add("left", expr);
		exp.add("oper", "&&");
		andexp.getRight().accept(this);
		exp.add("right", expr);

		expr = exp;

	}

	@Override
	public void visit(LesserThanExp lesseThan) {
		ST exp = groupTemplate.getInstanceOf("exp");

		lesseThan.getLeft().accept(this);
		exp.add("left", expr);
		exp.add("oper", "<");
		lesseThan.getRight().accept(this);
		exp.add("right", expr);
		expr = exp;
	}

	@Override
	public void visit(EqualityExp equalityExp) {
		ST exp = groupTemplate.getInstanceOf("exp");

		equalityExp.getLeft().accept(this);
		exp.add("left", expr);
		exp.add("oper", "==");
		equalityExp.getRight().accept(this);
		exp.add("right", expr);
		expr = exp;

	}

	@Override
	public void visit(NotEqualExp notEqualExp) {
		ST exp = groupTemplate.getInstanceOf("exp");

		notEqualExp.getLeft().accept(this);
		exp.add("left", expr);
		exp.add("oper", "!=");
		notEqualExp.getRight().accept(this);
		exp.add("right", expr);
		expr = exp;

	}

	@Override
	public void visit(PlusExp plusExp) {
		ST exp = groupTemplate.getInstanceOf("exp");

		plusExp.getLeft().accept(this);
		exp.add("left", expr);
		exp.add("oper", "+");
		plusExp.getRight().accept(this);
		exp.add("right", expr);
		expr = exp;
	}

	@Override
	public void visit(MinusExp minusExp) {
		System.out.println("MinusExp");
		ST exp = groupTemplate.getInstanceOf("exp");

		minusExp.getLeft().accept(this);
		exp.add("left", expr);
		exp.add("oper", "-");
		minusExp.getRight().accept(this);
		exp.add("right", expr);
		expr = exp;

	}

	@Override
	public void visit(MultExp multExp) {
		ST exp = groupTemplate.getInstanceOf("exp");

		multExp.getLeft().accept(this);
		exp.add("left", expr);
		exp.add("oper", "*");
		multExp.getRight().accept(this);
		exp.add("right", expr);
		expr = exp;

	}

	@Override
	public void visit(DivExp divExp) {
		ST exp = groupTemplate.getInstanceOf("exp");

		divExp.getLeft().accept(this);
		exp.add("left", expr);
		exp.add("oper", "/");
		divExp.getRight().accept(this);
		exp.add("right", expr);
		expr = exp;

	}

	@Override
	public void visit(ModExp modExp) {
		ST exp = groupTemplate.getInstanceOf("exp");

		modExp.getLeft().accept(this);
		exp.add("left", expr);
		exp.add("oper", "%");
		modExp.getRight().accept(this);
		exp.add("right", expr);
		expr = exp;

	}

	@Override
	public void visit(NotSignExp notSignExp) {
		notSignExp.getExp().accept(this);
		ST expST = new ST(String.format("not %s", expr.render()));

		expr = expST;

	}

	@Override
	public void visit(MinusSignExp minusSignExp) {
		minusSignExp.getExp().accept(this);
		ST expST = new ST(String.format("- %s", expr.render()));

		expr = expST;

	}

	@Override
	public void visit(True t) {
		ST expST = new ST("True");

		expr = expST;

	}

	@Override
	public void visit(False f) {
		ST expST = new ST("False");

		expr = expST;
	}

	@Override
	public void visit(Null n) {
		ST expST = new ST("None");

		expr = expST;

	}

	@Override
	public void visit(IntVal intval) {
		ST expST = new ST(intval.getValue().toString());

		expr = expST;

	}

	@Override
	public void visit(FloatVal floatVal) {

		ST expST = new ST(floatVal.getValue().toString());

		expr = expST;

	}

	@Override
	public void visit(CharVal charval) {
		System.out.print(charval.toString());
		ST expST = new ST(charval.toString());

		expr = expST;

	}

	@Override
	public void visit(ParenExp parenExp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(NewTypeExp newexp) {

		if (newexp.getExp() != null) {
			System.out.println(newexp.getType());
			if (newexp.getType() instanceof ArrayType) {
				System.out.println("ArrayType");
				ST matrixExp = groupTemplate.getInstanceOf("matrix");

				newexp.getType().accept(this);
				System.out.println(type.render());
				matrixExp.add("type", type.render());

				// Visita o tamanho da matriz
				newexp.getExp().accept(this);
				matrixExp.add("l", expr.render());
				matrixExp.add("c", expr.render());

				expr = matrixExp;

			} else {

				ST exp = groupTemplate.getInstanceOf("array_comprehension");

				System.out.println(newexp.getType().getClass());

				newexp.getType().accept(this);
				exp.add("type", type.render());

				newexp.getExp().accept(this);
				exp.add("size", expr.render());

				expr = exp;
			}
		}

		else {
			if (newexp.getType() instanceof NameType) {
				newexp.getType().accept(this);

				expr = new ST(type.render() + "()");
			}else {
				newexp.getType().accept(this);

				expr = new ST(type.render());
			}
		}

	}

	@Override
	public void visit(ArrayAccess arrayAccess) {
		arrayAccess.getLValue().accept(this);
		ST var = expr;
		arrayAccess.getExp().accept(this);
		ST index = expr;
		String formatedAccess = String.format("%s[%s]", var.render(), index.render());

		ST expST = new ST(formatedAccess);

		expr = expST;

	}

	@Override
	public void visit(FuncReturnExp funReturnExp) {
		System.out.println("FuncReturnExp");

		ST funcCall = groupTemplate.getInstanceOf("functionCall");
		String ID = funReturnExp.getID();

		funcCall.add("functionName", ID);

		FunCallParams paramsFcall = funReturnExp.getFunCallParams();

		if (paramsFcall.getExps() != null) {
			ST params = groupTemplate.getInstanceOf("separatedValues");
			for (Exp exp : paramsFcall.getExps()) {
				exp.accept(this);
				params.add("value", expr);
			}
			funcCall.add("params", params);
		}

		LocalEnv<SType> funcEnv = env.get(ID);
		FuncTypes funcTypes = (FuncTypes) funcEnv.get();

		if (funReturnExp.getExp() != null && funcTypes.getReturnType().size() > 1) {
			funReturnExp.getExp().accept(this);
			funcCall.add("index", expr);
		}

		expr = funcCall;

	}

	@Override
	public void visit(LValue Lvalue) {
		System.out.println("LValue");
		ST expST = new ST(Lvalue.getID());

		expr = expST;
	}

	@Override
	public void visit(IDLValue idLvalue) {
		ST expST = new ST(idLvalue.getID());

		expr = expST;
	}

	@Override
	public void visit(DotLValue dotLvalue) {
		String formatedAccess = String.format("%s.%s", dotLvalue.getData(), dotLvalue.getID());

		ST expST = new ST(formatedAccess);

		expr = expST;

	}

	@Override
	public void visit(FunCallParams fcp) {
		for (Exp exp : fcp.getExps()) {
			exp.accept(this);
		}

	}

}