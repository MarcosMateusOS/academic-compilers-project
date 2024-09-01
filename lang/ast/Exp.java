package lang.ast;

import lang.interpreter.Visitor;

// Classe abstrata para representar expressões:
public abstract class Exp extends Node{
	
    public Exp(int line, int col) {
        super(line, col);
    }

}