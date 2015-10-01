package models;

import java.util.LinkedList;
import java.util.List;

public class SimpleStmtBlock extends SimpleStmt {
	
	List<SimpleStmt> children;

	/**
	 * Creates a new block
	 * @param children: the list of direct children elements of the block
	 */
	public SimpleStmtBlock(List<SimpleStmt> children) {
		this.children = children;
	}

	/**
	 * It checks the semantic for every child in order item by item
	 * It creates a new scope for the elements that will be found inside
	 * Each element may add new elements to the environment inside the current scope
	 * After finishing drop the newly created scope
	 * @see models.SimpleElementBase#CheckSemantics(models.Environment)
	 */
	public List<SemanticError> CheckSemantics(Environment e) {
		//create scope for inner elements
		e.openScope();
		
		//initialize result variable
		LinkedList<SemanticError> result = new LinkedList<SemanticError>();
		
		//check children semantics
		if(children!=null)
			for(SimpleStmt el:children)
				result.addAll(el.CheckSemantics(e));
		
		//close scope for this block
		e.closeScope();
		
		return result;
	}

}
