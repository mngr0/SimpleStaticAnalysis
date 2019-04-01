package models;

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
        //TODO confident che sia ok
        LinkedList<SemanticError> res = new LinkedList<SemanticError>();
        for (SimpleExpVar exp: exps)
            res.addAll(exp.checkSemantics(e));
        for (SimpleStmt block: blocks)
            res.addAll(block.checkSemantics(e));

        return res;
    }

    @Override
    public BTBase inferBehavior(Environment e) {
        //TODO
        return null;
    }

}
