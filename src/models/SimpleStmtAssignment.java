package models;

import java.util.List;

import models.behavior.BTAtom;
import models.behavior.BTBase;

public class SimpleStmtAssignment extends SimpleStmt{

	SimpleExp exp;
	String id;
	
	/**
	 * @param exp
	 * @param id
	 */
	public SimpleStmtAssignment(SimpleExp exp, String id) {
		this.exp = exp;
		this.id = id;
	}

	@Override
	public List<SemanticError> checkSemantics(Environment e) {
		
		List<SemanticError> res = exp.checkSemantics(e);
		
		e.addVariable(id, exp.getValue(e));
		
		return res;
		
	}

	@Override
	public BTBase inferBehavior(Environment e) {
		int cost = 0;
		//if the variable doesn't exist in the current scope then 
		//it has a cost equals to 1
		if(e.getVariableValueLocal(id) == null)
			cost = 1;
		
		//put the variable in the current scope with the current value
		e.addVariable(id, exp.getValue(e));
		
		return new BTAtom(cost);
	}

}
