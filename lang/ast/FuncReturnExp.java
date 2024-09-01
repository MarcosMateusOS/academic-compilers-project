package lang.ast;


import lang.interpreter.Visitor;

public class FuncReturnExp extends Exp {
	private String id;
	private FunCallParams funCallParams;
	private Exp exp; // Retorno da função

	public FuncReturnExp(int line, int col, String id, FunCallParams funCallParams, Exp exp) {
		super(line, col);
		this.exp = exp;
		this.funCallParams = funCallParams;
		this.id = id;
	}

	@Override
	public String toString() {
		return id + " ( " + (funCallParams != null ? funCallParams : "") + " ) [ " + exp + " ] ";
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public String getID() {
		return this.id;
	}
	
	public FunCallParams getFunCallParams() {
		return this.funCallParams;
	}
	
	public Exp getExp() {
		return this.exp;
	}

}