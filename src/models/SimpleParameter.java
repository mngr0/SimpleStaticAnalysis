package models;

import models.behavior.BTBase;

import java.util.List;

public class SimpleParameter extends SimpleElementBase { //TODO fix all

    @Override
    public List<SemanticError> checkSemantics(Environment e) {
        return null;
    }

    @Override
    public BTBase inferBehavior(Environment e) {
        return null;
    }
}
