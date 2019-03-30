package models;

import java.util.LinkedList;
import java.util.List;

public class SimpleStmtFunction/* extends SimpleStmt */{
  /*
    SimpleStmtBlock block;
    List<SimpleParameter> parameters;
    String id;


    public SimpleStmtFunction(SimpleStmtBlock block, String id, List<SimpleParameter> parameters) {
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
            for(SimpleParameter el:parameters)
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
        e.openScope();

        BTBlock current = null;

        LinkedList<BTBase> behaviors = new LinkedList<BTBase>();
        for(SimpleStmt el:children)
            behaviors.push(el.inferBehavior(e));

        for(BTBase b:behaviors){
            current = BTBase.add(b,current);
        }

        //close scope for this block
        e.closeScope();

        return current;
    }
    */
}
