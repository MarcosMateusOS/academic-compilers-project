package lang.ast;

import lang.interpreter.Visitor;

public class False extends Exp {


	public False(int line, int col) {
		super(line, col);
	}

	@Override
	public String toString() {
		return "false";
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}