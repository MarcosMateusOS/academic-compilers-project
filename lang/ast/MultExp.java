package lang.ast;

import lang.interpreter.Visitor;

//Regra :<assoc=left> mexp MULT_SIGN sexp              #MultExp
public class MultExp extends BinOp {

	public MultExp(int line, int col, Exp left, Exp right) {
		super(line, col, left, right);
	}

	@Override
	public String toString() {
		return (left.toString() + " * " + right.toString());
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}