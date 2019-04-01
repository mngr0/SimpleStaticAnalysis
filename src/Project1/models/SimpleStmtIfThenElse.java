package Project1.models;

import models.Environment;
import models.SemanticError;
import models.SimpleExpVar;
import models.SimpleStmt;
import models.behavior.BTBase;

import java.util.LinkedList;
import java.util.List;

public class SimpleStmtIfThenElse extends SimpleStmt{

    List<SimpleExpVar> exps;
    List<SimpleStmt> blocks;

    public SimpleStmtIfThenElse(List<SimpleExpVar> pExps, List<SimpleStmt> pBlocks) {
        exps= pExps;
        blocks=pBlocks;
    }


    @Override
    public List<SemanticError> checkSemantics(Environment e) {
        return null;
    }

    @Override
    public BTBase inferBehavior(Environment e) {
        return null;
    }

}
