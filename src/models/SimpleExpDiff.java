package models;

import java.util.LinkedList;
import java.util.List;

public class SimpleExpDiff extends SimpleExp {
	
	SimpleExp leftSide, rightSide;

	/**
	 * Represents a binary expression sum
	 * @param leftSide 
	 * @param rightSide
	 */
	public SimpleExpDiff(SimpleExp leftSide, SimpleExp rightSide) {
		this.leftSide = leftSide;
		this.rightSide = rightSide;
	}

	/**
	 * Simply rest right expression from left expression
	 * 
	 */
	@Override
	public int getValue(Environment e) {
		return leftSide.getValue(e) - rightSide.getValue(e);
	}

	/**
	 * Check semantics in both side expressions
	 */
	@Override
	public List<SemanticError> checkSemantics(Environment e) {
		List<SemanticError> result = new LinkedList<SemanticError>();
		
		result.addAll(leftSide.checkSemantics(e));
		result.addAll(rightSide.checkSemantics(e));
		
		return result;
	}

}
