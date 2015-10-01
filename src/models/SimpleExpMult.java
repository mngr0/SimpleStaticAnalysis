package models;

import java.util.LinkedList;
import java.util.List;

public class SimpleExpMult extends SimpleExp {
	
	SimpleExp leftSide, rightSide;

	/**
	 * Represents a binary expression sum
	 * @param leftSide 
	 * @param rightSide
	 */
	public SimpleExpMult(SimpleExp leftSide, SimpleExp rightSide) {
		this.leftSide = leftSide;
		this.rightSide = rightSide;
	}

	/**
	 * Simply multiply values of both expressions
	 * 
	 */
	@Override
	public int getValue(Environment e) {
		return leftSide.getValue(e) * rightSide.getValue(e);
	}

	/**
	 * Check semantics in both side expressions
	 */
	@Override
	public List<SemanticError> CheckSemantics(Environment e) {
		List<SemanticError> result = new LinkedList<SemanticError>();
		
		result.addAll(leftSide.CheckSemantics(e));
		result.addAll(rightSide.CheckSemantics(e));
		
		return result;
	}

}
