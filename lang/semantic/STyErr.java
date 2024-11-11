package lang.semantic;

public class STyErr extends SType {
	private static STyErr st = new STyErr();

	private STyErr() {
	}

	public static STyErr newSTyErr() {
		return st;
	}

	public boolean match(SType st) {
		return true;
	}
}