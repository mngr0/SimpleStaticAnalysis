package models;

import java.util.LinkedList;
import java.util.List;

import parser.SimpleBaseVisitor;
import parser.SimpleParser.AssignmentContext;
import parser.SimpleParser.BaseExpContext;
import parser.SimpleParser.BinExpContext;
import parser.SimpleParser.BlockContext;
import parser.SimpleParser.DeletionContext;
import parser.SimpleParser.NegExpContext;
import parser.SimpleParser.PrintContext;
import parser.SimpleParser.StatementContext;
import parser.SimpleParser.ValExpContext;
import parser.SimpleParser.VarExpContext;

public class SimpleVisitorImpl extends SimpleBaseVisitor<SimpleElementBase> {
	
	@Override
	public SimpleElementBase visitStatement(StatementContext ctx) {
		//visit the first child, this works for every case
		return visit(ctx.getChild(0));
	}
	
	@Override
	public SimpleElementBase visitAssignment(AssignmentContext ctx) {
		//get expression
		SimpleExp exp = (SimpleExp) visit(ctx.exp());
		
		//get id of variable
		String id = ctx.ID().getText();
		
		//construct assignment expression
		SimpleStmtAssignment assign = new SimpleStmtAssignment(exp, id);
		return assign;
	}
	
	@Override
	public SimpleElementBase visitBlock(BlockContext ctx) {
		
		//list for saving children statements
		List<SimpleStmt> children = new LinkedList<SimpleStmt>();
		
		//visit each children
		for(StatementContext stmtCtx : ctx.statement())
			children.add((SimpleStmt) visitStatement(stmtCtx));
		
		//construct block statement expression
		SimpleStmtBlock block = new SimpleStmtBlock(children );
		
		return block;
		
	}
	
	@Override
	public SimpleElementBase visitDeletion(DeletionContext ctx) {
		
		//construct delete expression with variable id
		SimpleStmtDelete delete = new SimpleStmtDelete(ctx.ID().getText());
		
		return delete;		
	}
	
	@Override
	public SimpleElementBase visitPrint(PrintContext ctx) {
		
		//get expression
		SimpleExp exp = (SimpleExp) visit(ctx.exp());
		
		//construct print exp
		SimpleStmtPrint print = new SimpleStmtPrint(exp);
		
		return print;
	}
	
	@Override
	public SimpleElementBase visitBaseExp(BaseExpContext ctx) {

		//visit inner expression
		return visit(ctx.exp());
	}
	
	@Override
	public SimpleElementBase visitNegExp(NegExpContext ctx) {
		//visit inner expression and create neg expression
		return new SimpleExpNeg((SimpleExp) visit(ctx.exp()));
	}
	
	@Override
	public SimpleElementBase visitBinExp(BinExpContext ctx) {
		//build left 
		SimpleExp left = (SimpleExp) visit(ctx.left);
		
		//build right
		SimpleExp right = (SimpleExp) visit(ctx.right);
		
		//build binary operation according operator
		switch(ctx.op.getText()){
			case "+": return new SimpleExpSum(left, right);
			case "-": return new SimpleExpDiff(left, right);
			case "*": return new SimpleExpMult(left, right);
			case "/": return new SimpleExpDiv(left, right);
			default: return null; //this should not happen
		}

	}
	
	@Override
	public SimpleElementBase visitValExp(ValExpContext ctx) {
		
		//parse the number, this is safe because of the lexer rules
		return new SimpleExpVal(Integer.parseInt(ctx.NUMBER().getText()));
	}
	
	@Override
	public SimpleElementBase visitVarExp(VarExpContext ctx) {
		
		//get the variable id and create expression variable
		return new SimpleExpVar(ctx.ID().getText());
	}
	

}
