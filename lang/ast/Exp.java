package lang.ast;

import lang.interpreter.Visitor;

public abstract class Exp extends Node{
	
    public Exp(int line, int col) {
        super(line, col);
    }

}