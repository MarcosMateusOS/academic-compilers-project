package lang.ast;

import lang.interpreter.Visitor;

public class MinusExp extends BinOp {

	public MinusExp(int line, int col, Exp left, Exp right) {
		super(line, col, left, right);
	}

	@Override
	public String toString() {
		return (left.toString() + " - " + right.toString());
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}