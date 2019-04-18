package models;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import models.SimpleBaseVisitor;
import models.SimpleParser.*;

public class 	SimpleVisitorImpl extends SimpleBaseVisitor<SimpleElementBase> {

	private int countFunctions = 0;
	private Map<String,Integer> table = new HashMap<>();

	public Map<String, Integer> getTable() {
		return table;
	}

	public int getCountFunctions() {
		return countFunctions;
	}

	private void addToTable(String ID){
		try{
			table.put(ID,table.get(ID)+1);

		}catch (Exception e){
			table.put(ID,1);

		}
	}
	@Override
	public SimpleElementBase visitFunctioncall(FunctioncallContext ctx){
		String ID = ctx.ID().getText();

		addToTable(ID); // added to table for count

		List<SimpleStmt> children = new LinkedList<>();

		for(ExpContext parameterContext : ctx.exp()){
		//	children.add( (SimpleStmt) visitParameter(parameterContext)); //TODO tipaggio errato in my opinion

		}
		// SimpleStmtBlock block = (SimpleStmtBlock) visitBlock(ctx.block());
		 countFunctions++;
		 SimpleStmtFunction function = new SimpleStmtFunction();
		 return function;

	}


	@Override
	public SimpleElementBase visitIfthenelse(IfthenelseContext ctx) {


		return null;
	}

	@Override
	public SimpleElementBase visitParameter(ParameterContext ctx) {

		return  null;

	}

	@Override
	public SimpleElementBase visitDeclaration(DeclarationContext ctx) {
		return null;

	}


	@Override
	public SimpleElementBase visitStatement(StatementContext ctx) {
		//visit the first child, this works for every case
		return visit(ctx.getChild(0));
	}
	
	@Override
	public SimpleElementBase visitAssignment(AssignmentContext ctx) {
		//get expression
		String id = ctx.ID().getText();
		SimpleExp exp = (SimpleExp) visit(ctx.exp());

		//get id of variable
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
	

	

	



}
