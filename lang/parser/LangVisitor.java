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
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Datas}
	 * labeled alternative in {@link LangParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatas(LangParser.DatasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataDeclaration}
	 * labeled alternative in {@link LangParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDeclaration(LangParser.DataDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunDeclaration}
	 * labeled alternative in {@link LangParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDeclaration(LangParser.FunDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamsDeclaration}
	 * labeled alternative in {@link LangParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsDeclaration(LangParser.ParamsDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(LangParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BasicType}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(LangParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LangParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharType(LangParser.CharTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(LangParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(LangParser.FloatTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameType(LangParser.NameTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdType}
	 * labeled alternative in {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdType(LangParser.IdTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandList}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandList(LangParser.CommandListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCommand(LangParser.IfCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElseCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseCommand(LangParser.IfElseCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IterateCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterateCommand(LangParser.IterateCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadCommand(LangParser.ReadCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCommand(LangParser.PrintCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnCommand(LangParser.ReturnCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnMultCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnMultCommand(LangParser.ReturnMultCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignCommand(LangParser.AssignCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallCommand}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallCommand(LangParser.CallCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExp(LangParser.PlusExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code New}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(LangParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(LangParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(LangParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExp(LangParser.MultExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LValueExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLValueExp(LangParser.LValueExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntVal}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVal(LangParser.IntValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotSignExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotSignExp(LangParser.NotSignExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code True}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(LangParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code False}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(LangParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExp(LangParser.DivExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharVal}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharVal(LangParser.CharValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExp(LangParser.MinusExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatVal}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatVal(LangParser.FloatValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(LangParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExp(LangParser.EqualityExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExp(LangParser.ModExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusSignExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusSignExp(LangParser.MinusSignExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HotEqualExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHotEqualExp(LangParser.HotEqualExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpParen}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParen(LangParser.ExpParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LesserThanExp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesserThanExp(LangParser.LesserThanExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdLvalue}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdLvalue(LangParser.IdLvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotLvalue}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotLvalue(LangParser.DotLvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLvalue}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLvalue(LangParser.ArrayLvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunCallParams}
	 * labeled alternative in {@link LangParser#exps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCallParams(LangParser.FunCallParamsContext ctx);
}