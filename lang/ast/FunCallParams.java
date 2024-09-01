package lang.ast;

import java.util.List;

import lang.interpreter.Visitor;

public class FunCallParams extends Exp {
	private List<Exp> exps;


	public FunCallParams(int line, int col, List<Exp> exps) {
		super(line, col);
		
		this.exps = exps;
	}

	@Override
	public String toString() {
	    String funcCallParamsStr = "";
        for (Exp exp : exps) {
        	funcCallParamsStr += exp.toString() + ", ";
        }
        if(funcCallParamsStr.length() > 0){
            return funcCallParamsStr.substring(0, funcCallParamsStr.length() - 2);      
        }
        return funcCallParamsStr;
		
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public List<Exp> getExps(){
		return this.exps;
	}

	

}