// Generated from Simple.g4 by ANTLR 4.4
package parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBaseExp(@NotNull SimpleParser.BaseExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBaseExp(@NotNull SimpleParser.BaseExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVarExp(@NotNull SimpleParser.VarExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVarExp(@NotNull SimpleParser.VarExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull SimpleParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull SimpleParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinExp(@NotNull SimpleParser.BinExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinExp(@NotNull SimpleParser.BinExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#deletion}.
	 * @param ctx the parse tree
	 */
	void enterDeletion(@NotNull SimpleParser.DeletionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#deletion}.
	 * @param ctx the parse tree
	 */
	void exitDeletion(@NotNull SimpleParser.DeletionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull SimpleParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull SimpleParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull SimpleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull SimpleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterValExp(@NotNull SimpleParser.ValExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitValExp(@NotNull SimpleParser.ValExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNegExp(@NotNull SimpleParser.NegExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNegExp(@NotNull SimpleParser.NegExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull SimpleParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull SimpleParser.BlockContext ctx);
}