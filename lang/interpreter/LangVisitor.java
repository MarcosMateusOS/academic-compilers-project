/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/

package lang.interpreter;

import java.util.List;
import java.util.ArrayList;
import lang.ast.*;
import lang.parser.LangBaseVisitor;
import lang.parser.LangParser;
import lang.parser.LangParser.*;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Classe LangVisitor estende LangBaseVisitor, gerado pelo ANTLR. Esta classe é
 * responsável por percorrer a árvore de análise sintática gerada pelo ANTLR.
 * 
 * Cada método 'visit' implementado nesta classe lida com um tipo específico de
 * nó da gramática, transformando-o em um elemento correspondente na estrutura
 * AST do programa.
 */
public class LangVisitor extends LangBaseVisitor<Node> {
	
	/*ProgramContext: Visita o nó raiz do Programa*/
	@Override
	public Node visitProgram(ProgramContext ctx) {

		Program program = new Program(ctx.start.getLine(), ctx.start.getCharPositionInLine());

		// Inicia o visit por todo os nós que representa o tipo data
		for (int i = 0; i < ctx.data().size(); i++) {
			ParseTree child = ctx.data(i);
			program.addData((Data) this.aggregateResult(this.defaultResult(), child.accept(this)));
		}
		
		// Inicia o visit por todo os nós que representa o tipo Function
		for (int i = 0; i < ctx.fun().size(); i++) {
			ParseTree child = ctx.fun(i);
			program.addFunctions((Function) this.aggregateResult(this.defaultResult(), child.accept(this)));
		}

		return program;
	}

	@Override
	public Node visitDatas(DatasContext ctx) {
		String nameData = ctx.NAME_TYPE().getText();

		List<DataDeclaration> dataDeclarations = new ArrayList<>();

		for (int i = 0; i < ctx.decl().size(); i++) {
			dataDeclarations.add((DataDeclaration) ctx.decl().get(i).accept(this));
		}

		return new Data(ctx.start.getLine(), ctx.start.getCharPositionInLine(), nameData, dataDeclarations);
	}

	@Override
	public Node visitFunction(FunctionContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		String functionName = ctx.getChild(0).getText();

		Function func = new Function(l, c, functionName);
		Params parameters;

		if (ctx.params() != null) {
			parameters = (Params) ctx.params().accept(this);
			func.setParams(parameters);
		}

		/* Percorre todos os tipos de retorno da função */
		for (int i = 0; i < (ctx.type().size()) && this.shouldVisitNextChild(ctx, this.defaultResult()); i++) {
			ParseTree childThree = ctx.type(i);
			func.addReturnType((Type) this.aggregateResult(this.defaultResult(), childThree.accept(this)));
		}

		/* Percorre todos comandos da função */
		for (int i = 0; i < ctx.cmd().size(); i++) {
			ParseTree childThree = ctx.cmd(i);
			func.addCommand((Command) this.aggregateResult(this.defaultResult(), childThree.accept(this)));
		}

		return func;

	}

	@Override
	public Node visitParam(ParamContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();

		Params param = new Params(l, c);
		List<String> ids = new ArrayList<>();
		List<Type> types = new ArrayList<>();

		for (int i = 0; i < ctx.type().size(); i++) {
			ids.add(ctx.ID().get(i).getText());
			types.add((Type) ctx.type().get(i).accept(this));

		}
		param.setIDs(ids);
		param.setTypes(types);

		return param;

	}

	@Override
	public Node visitDataDeclaration(DataDeclarationContext ctx) {

		return new DataDeclaration(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.getChild(0).getText(),
				(Type) ctx.type().accept(this));

	}

	@Override
	public Node visitBasicType(BasicTypeContext ctx) {
		return super.visitBasicType(ctx);
	}

	@Override
	public Node visitIntType(IntTypeContext ctx) {
		return new IntType(ctx.start.getLine(), ctx.start.getCharPositionInLine());
	}

	@Override
	public Node visitBoolType(BoolTypeContext ctx) {
		return new BoolType(ctx.start.getLine(), ctx.start.getCharPositionInLine());
	}

	@Override
	public Node visitCharType(CharTypeContext ctx) {
		return new CharType(ctx.start.getLine(), ctx.start.getCharPositionInLine());
	}

	@Override
	public Node visitFloatType(FloatTypeContext ctx) {

		return new FloatType(ctx.start.getLine(), ctx.start.getCharPositionInLine());
	}

	@Override
	public Node visitNameType(NameTypeContext ctx) {
		String nameType = ctx.getChild(0).getText();
		return new NameType(ctx.start.getLine(), ctx.start.getCharPositionInLine(), nameType);
	}

	@Override
	public Node visitArrayType(ArrayTypeContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		Type type = (Type) ctx.type().accept(this);
		return new ArrayType(l, c, type);
	}

	@Override
	public Node visitCommandList(CommandListContext ctx) {

		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		List<Command> cmds = new ArrayList<>();
		CommandList commandList = new CommandList(l, c);

		for (int i = 0; i < ctx.cmd().size(); i++) {
			cmds.add((Command) ctx.cmd().get(i).accept(this));
		}
		commandList.setCommands(cmds);

		return commandList;

	}

	@Override
	public Node visitIfCommand(IfCommandContext ctx) {

		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();

		Exp exp = (Exp) ctx.getChild(2).accept(this);
		Command cmd = (Command) ctx.getChild(4).accept(this);
		System.out.println(ctx.toString());
		return new IfCommand(l, c, cmd, exp);
	}

	@Override
	public Node visitIfElseCommand(IfElseCommandContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();

		Exp exp = (Exp) ctx.getChild(2).accept(this);
		Command cmd = (Command) ctx.getChild(4).accept(this);
		Command cmdElse = (Command) ctx.getChild(4).accept(this);

		return new IfElseCommand(l, c, cmd, cmdElse, exp);
	}

	@Override
	public Node visitIterateCommand(IterateCommandContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();

		Exp exp = (Exp) ctx.getChild(2).accept(this);
		Command cmd = (Command) ctx.getChild(4).accept(this);

		IterateCommand teste = new IterateCommand(l, c, exp, cmd);

		return new IterateCommand(l, c, exp, cmd);
	}

	@Override
	public Node visitReadCommand(LangParser.ReadCommandContext ctx) {

		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		LValue lvalue = (LValue) ctx.getChild(1).accept(this);

		return new ReadCommand(l, c, lvalue);
	}

	@Override
	public Node visitPrintCommand(LangParser.PrintCommandContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		Exp exp = (Exp) ctx.exp().accept(this);

		return new PrintCommand(l, c, exp);
	}

	@Override
	public Node visitReturnCommand(LangParser.ReturnCommandContext ctx) {

		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		Exp exp = (Exp) ctx.exp().accept(this);

		return new ReturnCommand(l, c, exp);
	}

	@Override
	public Node visitReturnMultCommand(LangParser.ReturnMultCommandContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		List<Exp> exps = new ArrayList<Exp>();

		for (int i = 0; i < ctx.exp().size(); i++) {
			exps.add((Exp) ctx.exp().get(i).accept(this));
		}

		return new ReturnMultCommand(l, c, exps);
	}

	@Override
	public Node visitAssignCommand(LangParser.AssignCommandContext ctx) {

		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		Exp exp = (Exp) ctx.exp().accept(this);
		LValue lvalue = (LValue) ctx.lvalue().accept(this);

		return new AssignCommand(l, c, exp, lvalue);
	}

	@Override
	public Node visitFunctionCall(LangParser.FunctionCallContext ctx) {
		String id = ctx.ID().getText(); // Obtém o identificador da função

		// Obtém os parâmetros da chamada da função, se existirem
		FunCallParams funCallParams = null;
		if (ctx.exps() != null) {
			FunCallParams exps = (FunCallParams) ctx.exps().accept(this);
			funCallParams = exps;
		}

		// Obtém a lista de lvalues, se existirem
		List<LValue> lvalues = new ArrayList<>();
		if (ctx.lvalue() != null) {
			for (LangParser.LvalueContext lvalueCtx : ctx.lvalue()) {
				lvalues.add((LValue) visit(lvalueCtx));
			}
		}

		// Cria e retorna um novo objeto FunctionCall
		return new FunctionCall(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), id, funCallParams,
				lvalues);

	}

	@Override
	public Node visitAndExp(LangParser.AndExpContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		Exp left = (Exp) ctx.getChild(0).accept(this);
		Exp right = (Exp) ctx.getChild(2).accept(this);

		return new AndExp(l, c, left, right);
	}

	@Override
	public Node visitReExp(LangParser.ReExpContext ctx) {
		return super.visitReExp(ctx);
	}

	@Override
	public Node visitAExp(LangParser.AExpContext ctx) {
		return super.visitAExp(ctx);
	}

	@Override
	public Node visitEqualityExp(LangParser.EqualityExpContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		Exp left = (Exp) ctx.getChild(0).accept(this);
		Exp right = (Exp) ctx.getChild(2).accept(this);

		return new EqualityExp(l, c, left, right);
	}

	@Override
	public Node visitNotEqualExp(LangParser.NotEqualExpContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		Exp left = (Exp) ctx.getChild(0).accept(this);
		Exp right = (Exp) ctx.getChild(2).accept(this);

		return new NotEqualExp(l, c, left, right);
	}

	@Override
	public Node visitLesserThanExp(LangParser.LesserThanExpContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();

		Exp left = (Exp) ctx.getChild(0).accept(this);
		Exp right = (Exp) ctx.getChild(2).accept(this);
		// Imprimindo os operandos para depuração

		return new LesserThanExp(l, c, left, right);
	}

	@Override
	public Node visitPlusExp(LangParser.PlusExpContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		Exp left = (Exp) ctx.getChild(0).accept(this);
		Exp right = (Exp) ctx.getChild(2).accept(this);

		return new PlusExp(l, c, left, right);
	}

	@Override
	public Node visitMExp(LangParser.MExpContext ctx) {
		return super.visitMExp(ctx);
	}

	@Override
	public Node visitMinusExp(LangParser.MinusExpContext ctx) {

		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		Exp left = (Exp) ctx.getChild(0).accept(this);
		Exp right = (Exp) ctx.getChild(2).accept(this);

		return new MinusExp(l, c, left, right);
	}

	@Override
	public Node visitMultExp(LangParser.MultExpContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		Exp left = (Exp) ctx.getChild(0).accept(this);
		Exp right = (Exp) ctx.getChild(2).accept(this);

		return new MultExp(l, c, left, right);
	}

	@Override
	public Node visitModExp(LangParser.ModExpContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		Exp left = (Exp) ctx.getChild(0).accept(this);
		Exp right = (Exp) ctx.getChild(2).accept(this);

		return new ModExp(l, c, left, right);
	}

	@Override
	public Node visitDivExp(LangParser.DivExpContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		Exp left = (Exp) ctx.getChild(0).accept(this);
		Exp right = (Exp) ctx.getChild(2).accept(this);

		return new DivExp(l, c, left, right);
	}

	@Override
	public Node visitSExp(LangParser.SExpContext ctx) {
		return super.visitSExp(ctx);
	}

	@Override
	public Node visitNotSignExp(LangParser.NotSignExpContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		Exp exp = (Exp) ctx.getChild(1).accept(this);

		return new NotSignExp(l, c, exp);
	}

	@Override
	public Node visitMinusSignExp(LangParser.MinusSignExpContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		Exp exp = (Exp) ctx.getChild(1).accept(this);

		return new MinusSignExp(l, c, exp);
	}

	@Override
	public Node visitTrue(LangParser.TrueContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		return new True(l, c);
	}

	@Override
	public Node visitFalse(LangParser.FalseContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		return new False(l, c);
	}

	@Override
	public Node visitNull(LangParser.NullContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		return new Null(l, c);
	}

	@Override
	public Node visitIntVal(LangParser.IntValContext ctx) {

		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		int value = Integer.parseInt(ctx.getChild(0).getText());
		return new IntVal(l, c, value);
	}

	@Override
	public Node visitFloatVal(LangParser.FloatValContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		float value = Float.parseFloat(ctx.getChild(0).getText());
		return new FloatVal(l, c, value);
	}

	@Override
	public Node visitCharVal(LangParser.CharValContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		char value = ctx.CHAR_VAL().getText().charAt(1);
		return new CharVal(l, c, value);
	}

	@Override
	public Node visitLValueExp(LangParser.LValueExpContext ctx) {

		return super.visitLValueExp(ctx);
	}

	@Override
	public Node visitParenExp(LangParser.ParenExpContext ctx) {

		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		Exp exp = (Exp) ctx.getChild(1).accept(this);

		return new ParenExp(l, c, exp);
	}

	@Override
	public Node visitNewTypeExp(LangParser.NewTypeExpContext ctx) {
		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		// Aceita o tipo
		Type type = (Type) ctx.type().accept(this);

		// Se o tipo for NameType
		if (type instanceof NameType) {
			// Caso seja um ARRAY DE DATA
			if (ctx.exp() != null) {
				Exp exp = (Exp) ctx.exp().accept(this);
				return new NewTypeExp(l, c, exp, type, ctx.type().getText());
			}
			// Caso seja somente o TIPO DATA
			return new NewTypeExp(l, c, type, ctx.type().getText());
		}

		// Caso seja um new array
		if (ctx.exp() != null) {
			Exp exp = (Exp) ctx.exp().accept(this);
			return new NewTypeExp(l, c, exp, type, ctx.type().getText());
		}

		// Caso não seja um new array, só aceita o tipo
		return new NewTypeExp(l, c, type, ctx.type().getText());

	}

	@Override
	public Node visitFuncReturnExp(LangParser.FuncReturnExpContext ctx) {

		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();

		String str = ctx.ID().getText();
		FunCallParams fCallPar = (FunCallParams) ctx.exps().accept(this);

		Exp exp = (Exp) ctx.exp().accept(this);

		return new FuncReturnExp(l, c, str, fCallPar, exp);
	}

	@Override
	public Node visitArrayAccess(LangParser.ArrayAccessContext ctx) {

		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		LValue lvalue = (LValue) ctx.getChild(0).accept(this);
		Exp exp = (Exp) ctx.getChild(2).accept(this);

		return new ArrayAccess(l, c, lvalue, exp);
	}

	@Override
	public Node visitDotLValue(LangParser.DotLValueContext ctx) {

		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();

		LValue lvalue = (LValue) ctx.lvalue().accept(this);
		String id = ctx.getChild(2).getText();
		String dataName = ctx.lvalue().getText();
		return new DotLValue(l, c, lvalue, id, dataName);

	}

	@Override
	public Node visitIDLValue(LangParser.IDLValueContext ctx) {

		int l = ctx.start.getLine();
		int c = ctx.start.getCharPositionInLine();
		String id = ctx.ID().getText();

		return new IDLValue(l, c, id);
	}

	@Override
	public Node visitFunCallParams(LangParser.FunCallParamsContext ctx) {

		List<Exp> exps = new ArrayList<>();

		for (int i = 0; i < ctx.exp().size(); i++) {
			exps.add((Exp) ctx.exp().get(i).accept(this));
		}

		return new FunCallParams(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), exps);
	}

}
