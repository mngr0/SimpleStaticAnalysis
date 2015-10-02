package models;

import java.util.List;

import models.behavior.BTBase;
import models.behavior.BTPrint;

public class SimpleStmtPrint extends SimpleStmt {

	private SimpleExp exp;

	/**
	 * Creates a print statement
	 * @param exp the expression of which we want to print its value
	 */
	public SimpleStmtPrint(SimpleExp exp) {
		this.exp = exp;
	}

	/*
	 * Simply check semantics in the expression
	 * @see models.SimpleElementBase#CheckSemantics(models.Environment)
	 */
	@Override
	public List<SemanticError> checkSemantics(Environment e) {
		return exp.checkSemantics(e);
	}

	@Override
	public BTBase inferBehavior(Environment e) {
		
		return new BTPrint(exp.getValue(e));
	}

}
