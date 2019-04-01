package models;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import parser.SimpleBaseVisitor;
import parser.SimpleParser.*;

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
	public SimpleElementBase visitFunction(FunctionContext ctx){
		String ID = ctx.ID().getText();

		addToTable(ID); // added to table for count

		List<SimpleStmt> children = new LinkedList<>();

		for(ParameterContext parameterContext : ctx.parameter()){
			children.add( (SimpleStmt) visitParameter(parameterContext)); //TODO tipaggio errato in my opinion

		}
		 SimpleStmtBlock block = (SimpleStmtBlock) visitBlock(ctx.block());
		 countFunctions++;
		 SimpleStmtFunction function = new SimpleStmtFunction(block,ID,children);
		 return function;

	}


	@Override
	public SimpleElementBase visitIfthenelse(IfthenelseContext ctx) {

		List<SimpleExpVar> exps = new LinkedList<SimpleExpVar>();
		List<SimpleStmt> blocks = new LinkedList<SimpleStmt>();
		//visit each children
		for(ExpContext expCtx : ctx.exp())
			exps.add((SimpleExpVar) visit(expCtx));

		//visit each children
		for(BlockContext blockCtx : ctx.block())
			blocks.add((SimpleStmt) visitBlock(blockCtx));


		SimpleStmtIfThenElse ifthenelse = new SimpleStmtIfThenElse(exps,blocks);

		return ifthenelse;
	}

	@Override
	public SimpleElementBase visitParameter(ParameterContext ctx) {
		//visit the first child, this works for every case
		if(ctx.VAR()!=null){
			//TODO gestione delle var
		}
		return  visitDeclaration(ctx.declaration()); //TODO not sure per un cazzo

	}

	@Override
	public SimpleElementBase visitDeclaration(DeclarationContext ctx) {
		//visit the first child, this works for every case
		if(ctx.ID()!=null){ //TODO o c'e' ID o c' e' un assegnamento
			String ID= ctx.ID().getText();
			addToTable(ID);
			return new SimpleStmtDeclaration(ID); //TODO trick per dirgli di non fare nulla
		}
		else{
			SimpleStmtAssignment assignment =(SimpleStmtAssignment) visit(ctx.assignment());
			addToTable(ctx.assignment().ID().getText());

			return  assignment;
		}

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

/*
	@Override
	public SimpleElementBase visitBoolExp(BoolExpContext ctx){
		SimpleExp left = (SimpleExp) visit(ctx.left);

		//build right
		SimpleExp right = (SimpleExp) visit(ctx.right);

		//build binary operation according operator

		switch(ctx.op.getText()){
			case "or": return new SimpleExpDiff(left, right);
			case "and": return new SimpleExpSum(left, right);
			case "==": return new SimpleExpMult(left, right);
			default: return null; //this should not happen
		}

		//return right;

	}

	@Override
	public SimpleElementBase visitNotExp(NotExpContext ctx){

		return visit(ctx.exp());

	}
*/
}
