// Generated from /home/simone/Projects/SimpleStaticAnalysis/src/parser/Simple.g4 by ANTLR 4.7.2
package parser;
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
	 * Enter a parse tree produced by {@link SimpleParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SimpleParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SimpleParser.FunctionContext ctx);
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
	 * Enter a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBaseExp(SimpleParser.BaseExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBaseExp(SimpleParser.BaseExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVarExp(SimpleParser.VarExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVarExp(SimpleParser.VarExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinExp(SimpleParser.BinExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinExp(SimpleParser.BinExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterValExp(SimpleParser.ValExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitValExp(SimpleParser.ValExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNegExp(SimpleParser.NegExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNegExp(SimpleParser.NegExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBoolExp(SimpleParser.BoolExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBoolExp(SimpleParser.BoolExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolsExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBoolsExp(SimpleParser.BoolsExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolsExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBoolsExp(SimpleParser.BoolsExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNotExp(SimpleParser.NotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link SimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNotExp(SimpleParser.NotExpContext ctx);
}