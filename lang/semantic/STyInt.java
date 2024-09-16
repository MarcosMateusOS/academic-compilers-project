package lang.semantic;

public class STyInt extends SType {

	private static STyInt sti = new STyInt();

	private STyInt() {
	}

	public static STyInt newSTyInt() {
		return sti;
	}
	
	@Override
    public String toString() {
        return "Int";
    }

	@Override
	public boolean match(SType st) {
		return (st instanceof STyInt) || (st instanceof STyErr);
	}
}