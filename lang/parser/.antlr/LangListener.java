// Generated from /home/marcos/dev/ufjf/compiladores/Trab-Compiladores/lang/parser/Lang.g4 by ANTLR 4.13.1

package lang.parser;    

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Datas}
	 * labeled alternative in {@link LangParser#data}.
	 * @param ctx the parse tree
	 */
	void enterDatas(LangParser.DatasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Datas}
	 * labeled alternative in {@link LangParser#data}.
	 * @param ctx the parse tree
	 */
	void exitDatas(LangParser.DatasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DataDeclaration}
	 * labeled alternative in {@link LangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDataDeclaration(LangParser.DataDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DataDeclaration}
	 * labeled alternative in {@link LangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDataDeclaration(LangParser.DataDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Function}
	 * labeled alternative in {@link LangParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link LangParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LangParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Param}
	 * labeled alternative in {@link LangParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParam(LangParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Param}
	 * labeled alternative in {@link LangParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParam(LangParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(LangParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(LangParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BasicType}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(LangParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BasicType}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(LangParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterIntType(LangParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitIntType(LangParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterCharType(LangParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitCharType(LangParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(LangParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(LangParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterFloatType(LangParser.FloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitFloatType(LangParser.FloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterNameType(LangParser.NameTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitNameType(LangParser.NameTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommandList}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCommandList(LangParser.CommandListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommandList}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCommandList(LangParser.CommandListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterIfCommand(LangParser.IfCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitIfCommand(LangParser.IfCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterIfElseCommand(LangParser.IfElseCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitIfElseCommand(LangParser.IfElseCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IterateCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterIterateCommand(LangParser.IterateCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IterateCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitIterateCommand(LangParser.IterateCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterReadCommand(LangParser.ReadCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitReadCommand(LangParser.ReadCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterPrintCommand(LangParser.PrintCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitPrintCommand(LangParser.PrintCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterReturnCommand(LangParser.ReturnCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitReturnCommand(LangParser.ReturnCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnMultCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterReturnMultCommand(LangParser.ReturnMultCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnMultCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitReturnMultCommand(LangParser.ReturnMultCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterAssignCommand(LangParser.AssignCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitAssignCommand(LangParser.AssignCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(LangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(LangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(LangParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(LangParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterReExp(LangParser.ReExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitReExp(LangParser.ReExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AExp}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterAExp(LangParser.AExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AExp}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitAExp(LangParser.AExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExp}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExp(LangParser.EqualityExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExp}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExp(LangParser.EqualityExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualExp}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualExp(LangParser.NotEqualExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualExp}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualExp(LangParser.NotEqualExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LesserThanExp}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterLesserThanExp(LangParser.LesserThanExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LesserThanExp}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitLesserThanExp(LangParser.LesserThanExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusExp}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterPlusExp(LangParser.PlusExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusExp}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitPlusExp(LangParser.PlusExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MExp}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterMExp(LangParser.MExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MExp}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitMExp(LangParser.MExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusExp}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterMinusExp(LangParser.MinusExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusExp}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitMinusExp(LangParser.MinusExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultExp}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterMultExp(LangParser.MultExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultExp}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitMultExp(LangParser.MultExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModExp}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterModExp(LangParser.ModExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModExp}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitModExp(LangParser.ModExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivExp}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterDivExp(LangParser.DivExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivExp}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitDivExp(LangParser.DivExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SExp}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterSExp(LangParser.SExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SExp}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitSExp(LangParser.SExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotSignExp}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterNotSignExp(LangParser.NotSignExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotSignExp}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitNotSignExp(LangParser.NotSignExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusSignExp}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterMinusSignExp(LangParser.MinusSignExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusSignExp}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitMinusSignExp(LangParser.MinusSignExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code True}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterTrue(LangParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code True}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitTrue(LangParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code False}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterFalse(LangParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code False}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitFalse(LangParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Null}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterNull(LangParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitNull(LangParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntVal}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterIntVal(LangParser.IntValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntVal}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitIntVal(LangParser.IntValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatVal}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterFloatVal(LangParser.FloatValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatVal}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitFloatVal(LangParser.FloatValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharVal}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterCharVal(LangParser.CharValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharVal}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitCharVal(LangParser.CharValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterParenExp(LangParser.ParenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitParenExp(LangParser.ParenExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewTypeExp}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterNewTypeExp(LangParser.NewTypeExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewTypeExp}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitNewTypeExp(LangParser.NewTypeExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncReturnExp}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterFuncReturnExp(LangParser.FuncReturnExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncReturnExp}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitFuncReturnExp(LangParser.FuncReturnExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LValueExp}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterLValueExp(LangParser.LValueExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LValueExp}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitLValueExp(LangParser.LValueExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(LangParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(LangParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotLValue}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterDotLValue(LangParser.DotLValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotLValue}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitDotLValue(LangParser.DotLValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDLValue}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterIDLValue(LangParser.IDLValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDLValue}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitIDLValue(LangParser.IDLValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunCallParams}
	 * labeled alternative in {@link LangParser#exps}.
	 * @param ctx the parse tree
	 */
	void enterFunCallParams(LangParser.FunCallParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunCallParams}
	 * labeled alternative in {@link LangParser#exps}.
	 * @param ctx the parse tree
	 */
	void exitFunCallParams(LangParser.FunCallParamsContext ctx);
}