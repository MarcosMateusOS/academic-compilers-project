package lang.semantic;

public class STyNull extends SType {

	private static STyNull stn = new STyNull();

	private STyNull() {
	}

	public static STyNull newSTyNull() {
		return stn;
	}
	
	@Override
    public String toString() {
        return "stn";
    }

	@Override
	public boolean match(SType st) {
		return (st instanceof STyNull) || (st instanceof STyErr);
	}
}