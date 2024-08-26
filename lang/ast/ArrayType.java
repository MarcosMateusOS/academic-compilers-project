package lang.ast;

import lang.interpreter.Visitor;

public class ArrayType extends Type{
	
	public Type type;
	
    public ArrayType(int line, int col, Type type) {
        super(line, col);
        this.type = type;
    }

    @Override
    public String toString() {
        return type.toString() + "[]";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}