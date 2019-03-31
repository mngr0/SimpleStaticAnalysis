package models;

import models.behavior.BTBase;

import java.util.List;

public class SimpleStmtIfthenelse extends SimpleStmt{
    public SimpleStmtIfthenelse(List<SimpleStmt> exps, List<SimpleStmt> blocks) {
        super();
    }

    //public SimpleStmtIfthenelse(List<SimpleExpVar> exps, List<SimpleStmt> blocks) {
    //    super();
   // }

    @Override
    public List<SemanticError> checkSemantics(Environment e) {
        return null;
    }

    @Override
    public BTBase inferBehavior(Environment e) {
        return null;
    }
}
