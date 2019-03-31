package models;

import models.behavior.BTBase;

import java.util.List;

public class SimpleParameter extends SimpleStmt {

    @Override
    public List<SemanticError> checkSemantics(Environment e) {
        return null;
    }

    @Override
    public BTBase inferBehavior(Environment e) {
        return null;
    }
}
