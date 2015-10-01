package models;

import java.util.List;

public abstract class SimpleElementBase {

	
	/**performs a semantic check for controlling that all declared variables exist
	 * @param e is the current environment where the information about existent variables is stored
	 * @return a list of the semantic problems found
	 */
	public abstract List<SemanticError> checkSemantics(Environment e);
		
}
