package lang.ast;

import lang.interpreter.Visitor;

public class IDLValue extends LValue {
	
	private String id;
	
	public IDLValue(int line, int col, String id) {
		super(line, col);
		
		this.id = id;
	}

	@Override
	public String toString() {
		return id.toString();
		
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public String getID() {
		return id;
	}

}