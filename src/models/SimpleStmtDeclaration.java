package models;

import models.behavior.BTAtom;
import models.behavior.BTBase;
import util.Strings;

import java.util.LinkedList;
import java.util.List;

public class SimpleStmtDeclaration extends SimpleStmt {
    String id;

    /**
     *
     * @param id
     */
    public SimpleStmtDeclaration( String id) {

        this.id = id;
    }

    @Override
    public List<SemanticError> checkSemantics(Environment e) {

        List<SemanticError> result = new LinkedList<SemanticError>();

        //check for the variable
     //   if(!e.containsVariable(id))
     //       result.add(new SemanticError(Strings.ErrorVariableDoesntExist + id));

        e.addVariable(id, 0);

        return result;

    }

    @Override
    public BTBase inferBehavior(Environment e) {
        int cost = 0;
        //if the variable doesn't exist in the current scope then
        //it has a cost equals to 1

        //TODO
        return new BTAtom(cost);
    }


}
