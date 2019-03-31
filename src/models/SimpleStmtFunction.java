package models;

import models.behavior.BTBase;
import models.behavior.BTBlock;

import java.util.LinkedList;
import java.util.List;

public class SimpleStmtFunction extends SimpleStmt {

    SimpleStmtBlock block;
    List<SimpleStmt> parameters;
    String id;


    public SimpleStmtFunction(SimpleStmtBlock block, String id, List<SimpleStmt> parameters) {
        this.block = block;
        this.id = id;
        this.parameters=parameters;
    }

    @Override
    public List<SemanticError> checkSemantics(Environment e) {

        e.openScope();

        //initialize result variable
        LinkedList<SemanticError> result = new LinkedList<SemanticError>();

        //check children semantics
        if(parameters!=null)
            for(SimpleStmt el:parameters)
                result.addAll(((SimpleParameter)el).checkSemantics(e)); //TODO parameter deve aggiungere la nuova variabile non qua
        if(block!=null){
            result.addAll(block.checkSemantics(e));
        }
        //close scope for this block
        e.closeScope();

        return result;

    }

    @Override
    public BTBase inferBehavior(Environment e) { //TODO non ho la minima idea di cosa faccia
        e.openScope();

        BTBlock current = null;

        //close scope for this block
        e.closeScope();

        return current;
    }

}
