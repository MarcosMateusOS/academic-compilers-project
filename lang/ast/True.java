package lang.ast;

import lang.interpreter.Visitor;

//Regra: | TRUE                             #True
public class True extends Exp {
	public True(int line, int col) {
		super(line, col);
	}

	@Override
	public String toString() {
		return "true";
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}