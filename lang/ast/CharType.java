package lang.ast;

import lang.interpreter.Visitor;

//Regra: | CHAR_TYPE #CharType
public class CharType extends Type{
    public CharType(int line, int col) {
        super(line, col);
    }

    @Override
    public String toString() {
        return "Char";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}