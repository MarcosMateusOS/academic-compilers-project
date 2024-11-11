package lang.ast;

import lang.interpreter.Visitor;

// Classe auxiliar para representar os objetos dos tipos (Data);
public class TypeObject extends LValue {
	private Type type;
	private Object content;
	private String ID;
	
	public TypeObject(int line, int col,  Type type, String id) {
		super(line, col);
		this.type = type;
		this.ID = id;
	}
	
	public TypeObject(int line, int col,  Type type) {
		super(line, col);
		this.type = type;
		this.ID = null;
	}



	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	

    @Override
    public String toString(){
        return "" + content + " (" + type.toString() + ")";
    }
    
    public Object getContent() {
    	return this.content;
    }
    
    public Type getType() {
    	return this.type;
    }



	@Override
	public String getID() {
		return this.ID;
	}

}