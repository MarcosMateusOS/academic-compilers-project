package lang.ast;

import lang.interpreter.Visitor;

public class Null extends Exp {


	public Null(int line, int col) {
		super(line, col);
	}

	@Override
	public String toString() {
		return "null";
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}