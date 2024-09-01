package lang.ast;



public abstract class BinOp extends Exp{
	
	protected Exp left;
	protected Exp right;
	
	
    public BinOp(int line, int col, Exp left, Exp right) {
        super(line, col);
        
        this.left = left;
        this.right = right;
    }
    

    public Exp getLeft() {
        return left;
    }

    public Exp getRight() {
        return right;
    }

    public void setLeft(Exp left) {
        this.left = left;
    }

    public void setRight(Exp right) {
        this.right = right;
    }

}