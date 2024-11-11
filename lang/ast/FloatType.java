package lang.ast;

import lang.interpreter.Visitor;

//Regra: | FLOAT_TYPE #FloatType
public class FloatType extends Type{
    public FloatType(int line, int col) {
        super(line, col);
    }

    @Override
    public String toString() {
        return "Float";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}