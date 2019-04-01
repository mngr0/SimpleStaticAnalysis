package models;

import java.util.LinkedList;
import java.util.List;

public class SimpleExpNeg extends SimpleExp {
	
	SimpleExp exp;

	/**
	 * Represents a negated expression
	 * @param exp 
	 */
	public SimpleExpNeg(SimpleExp exp) {
		this.exp = exp;		
	}

	/**
	 * Simply rest right expression from left expression
	 * 
	 */
	@Override
	public int getValue(Environment e) {
		return -exp.getValue(e);
	}

	/**
	 * Check semantics in the expression
	 */
	@Override
	public List<SemanticError> checkSemantics(Environment e) {
		List<SemanticError> result = new LinkedList<SemanticError>();
		
		result.addAll(exp.checkSemantics(e));
			
		return result;
	}

}
