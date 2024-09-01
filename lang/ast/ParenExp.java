package lang.ast;

import lang.interpreter.Visitor;

//Regra: |<assoc=left> OPEN_PARENT exp CLOSE_PARENT     #ParenExp
public class ParenExp extends Exp {
	private Exp exp;

	public ParenExp(int line, int col, Exp exp) {
		super(line, col);
		
		this.exp = exp;
	}

	@Override
	public String toString() {
		return " ( " + exp.toString() + " ) ";
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public Exp getExp() {
		return this.exp;
	}

}