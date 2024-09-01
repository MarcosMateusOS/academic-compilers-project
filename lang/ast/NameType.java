package lang.ast;

import lang.interpreter.Visitor;

//Regra: | NAME_TYPE #NameType
public class NameType extends Type{
		
	private String nameType;
	
    public NameType(int line, int col, String nameType) {
        super(line, col);
        this.nameType = nameType;
    }

    @Override
    public String toString() {
        return this.nameType;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}