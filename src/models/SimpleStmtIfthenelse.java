package models;

import models.behavior.BTBase;

import java.util.LinkedList;
import java.util.List;

public class SimpleStmtIfthenelse extends SimpleStmt{

    List<SimpleExpVar> exps;
    List<SimpleStmt> blocks;

    public SimpleStmtIfthenelse(List<SimpleExpVar> pExps, List<SimpleStmt> pBlocks) {
        super();
        exps= pExps;
        blocks=pBlocks;
    }


    @Override
    public List<SemanticError> checkSemantics(Environment e) {
        LinkedList<SemanticError> res = new LinkedList<SemanticError>();
        for (SimpleExpVar exp: exps)
            res.addAll(exp.checkSemantics(e));
        for (SimpleStmt block: blocks)
            res.addAll(block.checkSemantics(e));

        return res;
    }

    @Override
    public BTBase inferBehavior(Environment e) {
        return null;
    }
}
