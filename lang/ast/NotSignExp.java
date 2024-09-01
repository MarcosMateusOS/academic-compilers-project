package lang.ast;

import lang.interpreter.Visitor;

//Regra : NOT_SIGN sexp                    #NotSignExp
public class NotSignExp extends Exp {
	private Exp exp;

	public NotSignExp(int line, int col, Exp exp) {
		super(line, col);
		this.exp = exp;
	}

	@Override
	public String toString() {
		return " ! " + this.exp.toString();
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public Exp getExp() {
		return this.exp;
	}

}