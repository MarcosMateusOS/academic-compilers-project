package lang.ast;

import lang.interpreter.Visitor;

//Regra: | CHAR_VAL                         #CharVal
public class CharVal extends Exp {

    private char value;
    
    public CharVal(int line, int col, char value) {
        super(line, col);
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('\'');
        
        // Tratamento dos literal caractere
        switch (value) {
            case '\n':
                sb.append("\\n");
                break;
            case '\t':
                sb.append("\\t");
                break;
            case '\b':
                sb.append("\\b");
                break;
            case '\r':
                sb.append("\\r");
                break;
            case '\\':
                sb.append("\\\\");
                break;
            case '\'':
                sb.append("\\'");
                break;
            default:
                sb.append(value);
                break;
        }

        sb.append('\'');
        return sb.toString();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    public char getValue() {
    	return this.value;
    }
    
}
