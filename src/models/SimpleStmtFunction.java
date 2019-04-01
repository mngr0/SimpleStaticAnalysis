package models;

import models.behavior.BTAtom;
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
                result.addAll(el.checkSemantics(e)); //TODO parameter deve aggiungere la nuova variabile non qua
        if(block!=null){
            result.addAll(block.checkSemantics(e));
        }
        //close scope for this block
        e.closeScope();

        return result;

    }

    @Override
    public BTBase inferBehavior(Environment e) { //TODO non ho la minima idea di cosa faccia
        e.openScope(); //TODO non so se serva

        int cost = 0;
        //if the variable doesn't exist in the current scope then
        //it has a cost equals to 1
        if(e.getVariableValueLocal(id) == null){
            cost = 1;

        }

        //put the variable in the current scope with the current value
        //e.addVariable(id, parameters); //TODO devo capire i tipo dei parametri, non posso avere funzioni con lo stesso tipaggio
        //close scope for this block
        e.closeScope();

        return new BTAtom(cost);
    }

}
