package models;

import java.util.LinkedList;
import java.util.List;

import parser.SimpleBaseVisitor;
import parser.SimpleParser;
import parser.SimpleParser.*;

public class SimpleVisitorImpl extends SimpleBaseVisitor<SimpleElementBase> {

	private int countFunctions = 0;

	public int getCountFunctions() {
		return countFunctions;
	}

	@Override
	public SimpleElementBase visitFunction(FunctionContext ctx){
		String ID = ctx.ID().getText();
		List<ParameterContext> children = new LinkedList<>();

		for(ParameterContext parameterContext : ctx.parameter()){
		//	children.add( (SimpleStmt) visitParameter(parameterContext)); //TODO son veramente da visitare? Credo di si
			//TODO perche' credo che possno essere creati in due modi
		}
		 SimpleStmtBlock block = (SimpleStmtBlock) visitBlock(ctx.block());
		 countFunctions++;
		// SimpleStmtFunction function = new SimpleStmtFunction(block,ID,children);
		 //return function;
		return block; //TODO da cavare e mettere l'altro una volta capito che cazzo fa
	}

	@Override
	public SimpleElementBase visitParameter(ParameterContext ctx) {
		//visit the first child, this works for every case
		return visit(ctx.getChild(0)); //TODO not sure
	}

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
