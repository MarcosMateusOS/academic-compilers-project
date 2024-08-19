package lang.ast;

public class Node extends SuperNode {
    
    private int line;
    private int col;
    
    public Node() {
        super();
    }

    public Node(int l, int c) {
        super();
        this.line = l;
        this.col = c;
    }
    
    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return col;
    }  
}
