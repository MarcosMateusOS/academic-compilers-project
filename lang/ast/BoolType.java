package lang.ast;

import lang.interpreter.Visitor;

public class BoolType extends Type{
    public BoolType(int line, int col) {
        super(line, col);
    }

    @Override
    public String toString() {
        return "Bool";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}