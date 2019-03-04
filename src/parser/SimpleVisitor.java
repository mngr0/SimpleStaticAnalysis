// Generated from Simple.g4 by ANTLR 4.4
package parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExp(@NotNull SimpleParser.BaseExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExp(@NotNull SimpleParser.VarExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull SimpleParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinExp(@NotNull SimpleParser.BinExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#deletion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeletion(@NotNull SimpleParser.DeletionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull SimpleParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull SimpleParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExp(@NotNull SimpleParser.ValExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExp(@NotNull SimpleParser.NegExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull SimpleParser.BlockContext ctx);
}