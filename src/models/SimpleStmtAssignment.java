package models;

import java.util.List;

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
	public List<SemanticError> CheckSemantics(Environment e) {
		
		List<SemanticError> res = exp.CheckSemantics(e);
		
		e.addVariable(id);
		
		return res;
		
	}

}
