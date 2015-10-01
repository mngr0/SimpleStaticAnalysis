package models;

import java.util.LinkedList;
import java.util.List;

import util.Strings;

public class SimpleExpVar extends SimpleExp {

	private String id;

	/**
	 * Creates a delete statement
	 * @param id the variable we want to delete
	 */
	public SimpleExpVar(String id) {
		this.id = id;
	}

	/*
	 * Checks if the variable in use exists. if it doesn't then add an error.
	 * @see models.SimpleElementBase#CheckSemantics(models.Environment)
	 */
	@Override
	public List<SemanticError> checkSemantics(Environment e) {
		List<SemanticError> result = new LinkedList<SemanticError>();
		
		//check for the variable
		if(!e.containsVariable(id))
			result.add(new SemanticError(Strings.ErrorVariableDoesntExist + id));
		
		return result;
	}

	@Override
	public int getValue(Environment e) {
		
		return 0;
	}

}
