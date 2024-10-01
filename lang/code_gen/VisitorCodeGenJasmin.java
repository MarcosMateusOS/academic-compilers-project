package lang.code_gen;

import lang.ast.*;
import lang.interpreter.Visitor;
import lang.semantic.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class VisitorCodeGenJasmin extends Visitor {

	private STGroup groupTemplate;
	private ST type, stmt, expr, var;
	private ST template;
	private List<ST> funcs, params, datas, dcls;
	private TyEnv<LocalEnv<SType>> env;
	private LocalEnv<SType> local;
	private String fileName;
	private Integer stackSize;
	private int label = 0;
	private String currentFunc;
	private Integer indexReturnType = null;

	public VisitorCodeGenJasmin(String fileName, TyEnv<LocalEnv<SType>> env) {
		groupTemplate = new STGroupFile("./lang/code_gen/templates/jasmin.stg");
		this.fileName = fileName;
		this.env = env;
		this.stackSize = 0;

	}

	@Override
	public void visit(Program p) {
		template = groupTemplate.getInstanceOf("program");
		datas = new ArrayList<ST>();

		template.add("name", fileName);
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
			PrintStream ps = new PrintStream("lang/code_gen/gen_files/" + "generated.j");
			ps.println(template.render());

			System.out.println("File converted Path=lang/code_gen/gen_files/" + "generated.j");
		} catch (Exception e) {
			System.out.println("Erro to convert Lang to Jasmin");
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void visit(Data d) {
		ST data = groupTemplate.getInstanceOf("data");

		data.add("name", d.getId());
		dcls = new ArrayList<ST>();
		ArrayList<ST> gets = new ArrayList<ST>();
		ArrayList<ST> sets = new ArrayList<ST>();
		for (DataDeclaration dcl : d.getDeclarations()) {

			ST decl = groupTemplate.getInstanceOf("decl");

			decl.add("id", dcl.getId());
			
			System.out.println("dcl.getType() + " + dcl.getType().toString());
			dcl.getType().accept(this);
			System.out.println(type.render());
			decl.add("type", type);
			dcls.add(decl);
			
			ST getST = groupTemplate.getInstanceOf("get");
			getST.add("name", dcl.getId());
			getST.add("type", dcl.getId());
			getST.add("name_data", d.getId());
			
			gets.add(getST);
			
			ST setST = groupTemplate.getInstanceOf("set");
			setST.add("name", dcl.getId());
			setST.add("type", dcl.getId());
			setST.add("name_data", d.getId());
			
			sets.add(setST);
		}
		
		data.add("decls", dcls);
		data.add("gets", gets);
		data.add("sets", sets);
		
		System.out.println("DATA " + data.render());
		datas.add(data);
	}

	@Override
	public void visit(Function f) {
		ST fun = groupTemplate.getInstanceOf("func");
		String name = null;
		System.out.println(f.getID());
		if (f.getID().equals("main")) {
			System.out.println(f.getID());
			name = "inicio";
		} else {
			name = f.getID();
		}
		fun.add("name", name);
		currentFunc = name;
		System.out.println(env.get(f.getID()));
		local = env.get(f.getID());
		System.out.println(local);
		fun.add("decls", local.getKeys().size());

		if (f.getParams() != null && f.getParams().getTypes().size() > 0) {
			stackSize += f.getParams().getTypes().size();

		}

		if (f.getParams() != null && f.getParams().getTypes().size() > 0) {
			System.out.println(f.getParams().toString());
			Params param = f.getParams();

			param.accept(this);

			List<Type> types = param.getTypes();
			List<String> idsTypes = param.getIDs();
			param.accept(this);

			for (int index = 0; index < types.size(); index++) {
				String paramID = idsTypes.get(index);
				types.get(index).accept(this);

				fun.add("params", type);
			}

		}

		if (f.getID().equals("main")) {
			System.out.println(f.getID());
			ST type = new ST("[Ljava/lang/String;");
			fun.add("params", type);

		}

		if (f.getCommands() != null) {
			for (Command command : f.getCommands()) {
				command.accept(this);

				fun.add("cmds", stmt);

				stmt = null;
			}
		}

		if (f.getReturnTypes() != null && f.getReturnTypes().size() > 0) {
			System.out.println("temretorno");
			if (indexReturnType != null) {
				f.getReturnTypes().get(indexReturnType).accept(this);
				;
				fun.add("return", type);
			} else {
				f.getReturnTypes().get(f.getReturnTypes().size() - 1).accept(this);
				;
				fun.add("return", type);
			}

		} else {
			fun.add("return", "V");
		}

		fun.add("stack", 50);

		funcs.add(fun);

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
		System.out.println("to " + at.getType().toString());
		System.out.println(type.render());
		arrayType.add("type", type);
		type = arrayType;

	}

	@Override
	public void visit(NameType at) {
		type = groupTemplate.getInstanceOf("data_type");
		type.add("name", at.getName());

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

		System.out.println("IfCommand");
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

		ST cmd = groupTemplate.getInstanceOf("cmd");
		ST ifCmd = groupTemplate.getInstanceOf("if");
		ifCmd.add("num", label++);
		ifElsec.getExp().accept(this);

		ifCmd.add("expr", expr);

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

		System.out.println("IterateCommand");
		ST cmd = groupTemplate.getInstanceOf("cmd");
		ST iterate = groupTemplate.getInstanceOf("for");
		int currentLabel = label++;
		System.out.println(iterate.toString());
		iterate.add("num", currentLabel);
		System.out.println("TESTE WHILE");
		iteratec.getExp().accept(this);
		System.out.println("TESTE WHILE E" + expr);
		iterate.add("times", expr);

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
		stackSize--;

		stmt = cmd;
	}

	@Override
	public void visit(ReadCommand readc) {

		ST cmd = groupTemplate.getInstanceOf("cmd");

		System.out.println("ReadCommand");
	

		readc.getLValue().accept(this);

		System.out.println("GETCLASS " + readc.getLValue().getClass());
	
		
		ST read = null;
		ST store = null;
		
		Pair<SType, Integer> pair = local.getPair(readc.getLValue().getID());
		
		if(pair.first() instanceof STyChar) {
			read = groupTemplate.getInstanceOf("sread");
			store = groupTemplate.getInstanceOf("iastore");
		}else {
			read = groupTemplate.getInstanceOf("iread");
			store = groupTemplate.getInstanceOf("istore");
		}
		
		store.add("var", pair.second());
		
		
		System.out.println("store" + store.render());
		
		read.add("expr", store);
		
		read.add("name","<init>");
		System.out.println("stmt " + read.render());

		cmd.add("stmt", read);

		stmt = cmd;

	}

	@Override
	public void visit(PrintCommand printc) {
		stackSize += 2;
		System.out.println("PrintCommand");
		ST cmd = groupTemplate.getInstanceOf("cmd");
		ST print = null;
		printc.getExp().accept(this);

		if (expr.getName().equals("/char")) {
			System.out.println("char");
			print = groupTemplate.getInstanceOf("iprint_string");
		} else {
			print = groupTemplate.getInstanceOf("iprint_int");
		}

		print.add("expr", expr);

		cmd.add("stmt", print);

		stmt = cmd;
		stackSize -= 2;
	}

	@Override
	public void visit(ReturnCommand returnc) {
		// stackSize++;
		System.out.println("ReturnMultCommand");
		ST cmd = groupTemplate.getInstanceOf("cmd");
		ST returnST = groupTemplate.getInstanceOf("ireturn");

		returnc.getExp().accept(this);

		returnST.add("expr", expr);

		cmd.add("stmt", returnST);

		stmt = cmd;

	}

	@Override
	public void visit(ReturnMultCommand returnMultc) {

		ST cmd = groupTemplate.getInstanceOf("cmd");

		ArrayList<ST> exprs = new ArrayList<ST>();
		for (Exp exp : returnMultc.getExps()) {

			exp.accept(this);
			exprs.add(expr);

		}

		ST returnST = groupTemplate.getInstanceOf("ireturn");

		returnST.add("expr", exprs.get(this.indexReturnType));

		cmd.add("stmt", returnST);

		stmt = cmd;

	}

	@Override
	public void visit(AssignCommand assignc) {
		// stackSize++;

		ST cmd = groupTemplate.getInstanceOf("cmd");

		LValue lvalue = assignc.getLValue();
		lvalue.accept(this);
		System.out.println("AssignCommand " + assignc.toString());
		System.out.println("AssignCommand " + lvalue.getID());
		// Atribuição para variáveis simples
		if (lvalue instanceof IDLValue) {
			Pair<SType, Integer> pair = local.getPair(lvalue.getID());

			ST istore = groupTemplate.getInstanceOf("istore");

			istore.add("var", pair.second());

			assignc.getLExp().accept(this);

			istore.add("expr", expr);

			System.out.println(istore.render());
			cmd.add("stmt", istore);
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

		stmt = cmd;
	}

	@Override
	public void visit(FunctionCall fc) {
		// stackSize++;
		System.out.println("FunctionCall");
		ST cmd = groupTemplate.getInstanceOf("cmd");
		ST funcCall = groupTemplate.getInstanceOf("call");
		String ID = fc.getID();
		funcCall.add("class", fileName);
		funcCall.add("name", ID);

		LocalEnv<SType> func = (LocalEnv<SType>) env.get(ID);
		FuncTypes funcTypes = (FuncTypes) func.get();

		FunCallParams paramsFcall = fc.getFunCallParams();

		List<LValue> lvalues = fc.getLvalues();

		if (lvalues != null) {

			List<SType> funcReturnTypes = funcTypes.getReturnType();

			if (funcReturnTypes != null && funcReturnTypes.size() > 0) {

				processSType(funcReturnTypes.get(funcReturnTypes.size() - 1));
				funcCall.add("return", type);

				for (int i = 0; i < funcReturnTypes.size(); i++) {
					processSType(funcReturnTypes.get(i));
					funcCall.add("type", type);
				}
			}
		}

		if (paramsFcall.getExps() != null) {

			for (Exp exp : paramsFcall.getExps()) {
				exp.accept(this);
				funcCall.add("args", expr);
			}

		}

		cmd.add("stmt", funcCall);

		stmt = cmd;

	}

	@Override
	public void visit(AndExp andexp) {
		// stackSize++;
		ST exp = groupTemplate.getInstanceOf("and_expr");

		andexp.getLeft().accept(this);
		exp.add("left", expr);

		andexp.getRight().accept(this);
		exp.add("right", expr);

		expr = exp;

	}

	@Override
	public void visit(LesserThanExp lesseThan) {
		ST exp = groupTemplate.getInstanceOf("ilt_expr");

		lesseThan.getLeft().accept(this);
		exp.add("left", expr);

		lesseThan.getRight().accept(this);
		exp.add("right", expr);
		expr = exp;
	}

	@Override
	public void visit(EqualityExp equalityExp) {
		// stackSize++;
		ST exp = groupTemplate.getInstanceOf("iequals");

		equalityExp.getLeft().accept(this);
		exp.add("left", expr);

		equalityExp.getRight().accept(this);
		exp.add("right", expr);
		expr = exp;

	}

	@Override
	public void visit(NotEqualExp notEqualExp) {
		// stackSize++;
		ST exp = groupTemplate.getInstanceOf("innotequals_expr");

		notEqualExp.getLeft().accept(this);
		exp.add("left", expr);
		exp.add("oper", "!=");
		notEqualExp.getRight().accept(this);
		exp.add("right", expr);
		expr = exp;

	}

	@Override
	public void visit(PlusExp plusExp) {
		// stackSize++;
		ST exp = groupTemplate.getInstanceOf("iadd");

		plusExp.getLeft().accept(this);
		exp.add("left", expr);

		plusExp.getRight().accept(this);
		exp.add("right", expr);
		expr = exp;
	}

	@Override
	public void visit(MinusExp minusExp) {
		// stackSize++;
		System.out.println("MinusExp");

		// Cria um novo template 'isub' para a subtração
		ST exp = groupTemplate.getInstanceOf("isub");

		// Processa o lado esquerdo da subtração
		minusExp.getLeft().accept(this);
		exp.add("left", expr); // Adiciona a parte esquerda ao template
		System.out.println("RENDER L: " + expr.render());

		// Processa o lado direito da subtração
		minusExp.getRight().accept(this);
		exp.add("right", expr); // Adiciona a parte direita ao template
		System.out.println("RENDER R: " + expr.render());

		// Renderiza a expressão completa após ambos os lados serem processados
		System.out.println("RENDER FINAL: " + exp.render());
		System.out.println("RENDER FINAL: ");
		// Define o resultado final da subtração como a expressão completa
		expr = exp;

	}

	@Override
	public void visit(MultExp multExp) {
		// stackSize++;
		ST exp = groupTemplate.getInstanceOf("imul");

		multExp.getLeft().accept(this);
		exp.add("left", expr);

		multExp.getRight().accept(this);
		exp.add("right", expr);
		expr = exp;

	}

	@Override
	public void visit(DivExp divExp) {
		// stackSize++;
		ST exp = groupTemplate.getInstanceOf("idiv");

		divExp.getLeft().accept(this);
		exp.add("left", expr);

		divExp.getRight().accept(this);
		exp.add("right", expr);
		expr = exp;

	}

	@Override
	public void visit(ModExp modExp) {
		// stackSize++;
		ST exp = groupTemplate.getInstanceOf("imod");

		modExp.getLeft().accept(this);
		exp.add("left", expr);

		modExp.getRight().accept(this);
		exp.add("right", expr);
		expr = exp;

	}

	@Override
	public void visit(NotSignExp notSignExp) {
		// stackSize++;
		ST notExp = groupTemplate.getInstanceOf("not_expr");
		notSignExp.getExp().accept(this);
		notExp.add("expr", expr);
		expr = notExp;

	}

	@Override
	public void visit(MinusSignExp minusSignExp) {
		// stackSize++;
//		minusSignExp.getExp().accept(this);
//		ST expST = new ST(String.format("- %s", expr.render()));
//
//		expr = expST;

	}

	@Override
	public void visit(True t) {
		ST expST = groupTemplate.getInstanceOf("boolean_true");

		expr = expST;

	}

	@Override
	public void visit(False f) {
		ST expST = groupTemplate.getInstanceOf("boolean_false");

		expr = expST;
	}

	@Override
	public void visit(Null n) {
		ST expST = new ST("None");

		expr = expST;

	}

	@Override
	public void visit(IntVal intval) {
		System.out.println("INTVAL");
		System.out.println(intval.getValue());
		ST expST = groupTemplate.getInstanceOf("int_expr");
		System.out.println(intval.getValue().toString());
		stackSize += stackSize;
		expST.add("value", intval.getValue().toString());
		System.out.println("RENDERRRR " + expST.render());
		expr = expST;
	}

	@Override
	public void visit(FloatVal floatVal) {

		expr = groupTemplate.getInstanceOf("float");
		expr.add("value", floatVal.getValue().toString());

	}

	@Override
	public void visit(CharVal charval) {
		ST expST = groupTemplate.getInstanceOf("char");

		expST.add("value", charval.toString().replace("'", "\""));

		expr = expST;

	}

	@Override
	public void visit(ParenExp parenExp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(NewTypeExp newexp) {
		// stackSize++;

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

				expr = new ST("new " + type.render());
			} else {
				newexp.getType().accept(this);

				expr = new ST(type.render());
			}
		}

	}

	@Override
	public void visit(ArrayAccess arrayAccess) {
		// stackSize++;
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

		ST cmd = groupTemplate.getInstanceOf("cmd");
		ST funcCall = groupTemplate.getInstanceOf("call");
		String ID = funReturnExp.getID();
		funcCall.add("class", fileName);
		funcCall.add("name", ID);

		LocalEnv<SType> func = (LocalEnv<SType>) env.get(ID);
		FuncTypes funcTypes = (FuncTypes) func.get();

		FunCallParams paramsFcall = funReturnExp.getFunCallParams();
		List<SType> funcParamsTypes = funcTypes.getTypes();
		int aux = 0;
		if (paramsFcall.getExps() != null) {

			for (Exp exp : paramsFcall.getExps()) {
				exp.accept(this);
				funcCall.add("args", expr);

				processSType(funcParamsTypes.get(aux));
				funcCall.add("type", type);

			}

		}
		System.out.println("funcReturnTypes");
		System.out.println(funcTypes.getReturnType().size());

		if (funcTypes.getReturnType().size() >= 1) {
			System.out.println("funcReturnTypes");

			List<SType> funcReturnTypes = funcTypes.getReturnType();

			funReturnExp.getExp().accept(this);
			if (funcReturnTypes != null && funcReturnTypes.size() > 0) {

				IntVal index = (IntVal) funReturnExp.getExp();
				indexReturnType = index.getValue();
				processSType(funcReturnTypes.get(index.getValue()));
				funcCall.add("return", type);

			}
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
		// stackSize++;
		System.out.println("IDLValue");
		System.out.println(idLvalue.getID());
		System.out.println(local.getPair(idLvalue.getID()));
		Pair<SType, Integer> pair = local.getPair(idLvalue.getID());

		ST expST = groupTemplate.getInstanceOf("iaccess");
		System.out.println("render IDLValue " + pair.second());
		expST.add("num", pair.second());
		System.out.println("render IDLValue " + expST.render());
		System.out.println("render " + expST.render());
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

	private void processSType(SType t) {

		if (t instanceof STyInt)
			type = groupTemplate.getInstanceOf("int_type");
		else if (t instanceof STyBool)
			type = groupTemplate.getInstanceOf("boolean_type");
		else if (t instanceof STyFloat)
			type = groupTemplate.getInstanceOf("float_type");
		else if (t instanceof STyArray) {
			ST aux = groupTemplate.getInstanceOf("array_type");
			processSType(((STyArray) t).getType());
			aux.add("type", type);
			type = aux;
		}

	}

}