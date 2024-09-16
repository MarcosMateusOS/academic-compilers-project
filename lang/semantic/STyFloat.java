package lang.semantic;

public class STyFloat extends SType {

	private static STyFloat stf = new STyFloat();

	private STyFloat() {
	}

	public static STyFloat newSTyFloat() {
		return stf;
	}
	
	@Override
    public String toString() {
        return "Float";
    }

	@Override
	public boolean match(SType st) {
		return (st instanceof STyFloat) || (st instanceof STyErr);
	}
}