// Generated from ./lang/parser/Lang.g4 by ANTLR 4.8

package lang.parser;    

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code program}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataDeclaration}
	 * labeled alternative in {@link LangParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDeclaration(LangParser.DataDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link LangParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(LangParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funDeclaration}
	 * labeled alternative in {@link LangParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDeclaration(LangParser.FunDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramsDeclaration}
	 * labeled alternative in {@link LangParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsDeclaration(LangParser.ParamsDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicType}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(LangParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(LangParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(LangParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharType(LangParser.CharTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(LangParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(LangParser.FloatTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameType(LangParser.NameTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdType(LangParser.IdTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commandList}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandList(LangParser.CommandListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCommand(LangParser.IfCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseCommand(LangParser.IfElseCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterateCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterateCommand(LangParser.IterateCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadCommand(LangParser.ReadCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCommand(LangParser.PrintCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnCommand(LangParser.ReturnCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnMultCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnMultCommand(LangParser.ReturnMultCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignCommand(LangParser.AssignCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallCommand(LangParser.CallCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(LangParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intVal}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVal(LangParser.IntValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(LangParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExp(LangParser.MinusExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExp(LangParser.EqualityExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charVal}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharVal(LangParser.CharValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(LangParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExp(LangParser.PlusExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lvalueExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalueExp(LangParser.LvalueExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatVal}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatVal(LangParser.FloatValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusSignExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusSignExp(LangParser.MinusSignExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExp(LangParser.DivExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExp(LangParser.ModExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code null}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(LangParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(LangParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExp(LangParser.MultExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expParen}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParen(LangParser.ExpParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(LangParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lesserThanExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesserThanExp(LangParser.LesserThanExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqualExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualExp(LangParser.NotEqualExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notSignExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotSignExp(LangParser.NotSignExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dotLvalue}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotLvalue(LangParser.DotLvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idLvalue}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdLvalue(LangParser.IdLvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLvalue}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLvalue(LangParser.ArrayLvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funCallParams}
	 * labeled alternative in {@link LangParser#exps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCallParams(LangParser.FunCallParamsContext ctx);
}