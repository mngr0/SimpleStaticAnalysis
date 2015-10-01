package models;

import java.util.LinkedList;
import java.util.List;


public class SimpleExpVal extends SimpleExp {

	private int value;

	/**
	 * Creates a delete statement
	 * @param value the variable we want to delete
	 */
	public SimpleExpVal(int value) {
		this.value = value;
	}

	/*
	 * No semantic errors here
	 * Checks if the variable in use exists. if it doesn't then add an error.
	 * @see models.SimpleElementBase#CheckSemantics(models.Environment)
	 */
	@Override
	public List<SemanticError> CheckSemantics(Environment e) {
		List<SemanticError> result = new LinkedList<SemanticError>();
				
		return result;
	}

	@Override
	public int getValue(Environment e) {
		
		return value;
	}

}
