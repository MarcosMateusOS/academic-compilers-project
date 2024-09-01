package lang.ast;

import java.util.List;
import lang.interpreter.Visitor;

//Regra: | ID OPEN_PARENT exps? CLOSE_PARENT (LESSER_THAN lvalue (COMMA lvalue)* GREATER_THAN)? SEMICOLON #FunctionCall
public class FunctionCall extends Command {
    private String id;
    private FunCallParams funCallParams;
    private List<LValue> lvalues;

    public FunctionCall(int line, int col, String id, FunCallParams funCallParams, List<LValue> lvalues) {
        super(line, col);
        this.id = id;
        this.funCallParams = funCallParams;
        this.lvalues = lvalues;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append("(");

        if (funCallParams != null) {
            sb.append(funCallParams.toString());
        }

        sb.append(")");

        if (lvalues != null && !lvalues.isEmpty()) {
            sb.append(" < ");
            for (int i = 0; i < lvalues.size(); i++) {
                sb.append(lvalues.get(i).toString());
                if (i < lvalues.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" >");
        }

        sb.append(";");
        return sb.toString();
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
    

    public List<LValue> getLvalues() {
    	return this.lvalues;
    }
}
