// Generated from /home/marco/Documents/github/SSA/src/parser/Simple.g4 by ANTLR 4.7.2
package models;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpleParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpleParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#deletion}.
	 * @param ctx the parse tree
	 */
	void enterDeletion(SimpleParser.DeletionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#deletion}.
	 * @param ctx the parse tree
	 */
	void exitDeletion(SimpleParser.DeletionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SimpleParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SimpleParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(SimpleParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(SimpleParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#ifthenelse}.
	 * @param ctx the parse tree
	 */
	void enterIfthenelse(SimpleParser.IfthenelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#ifthenelse}.
	 * @param ctx the parse tree
	 */
	void exitIfthenelse(SimpleParser.IfthenelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SimpleParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SimpleParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SimpleParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SimpleParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(SimpleParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(SimpleParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SimpleParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SimpleParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SimpleParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SimpleParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SimpleParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SimpleParser.ValueContext ctx);
}