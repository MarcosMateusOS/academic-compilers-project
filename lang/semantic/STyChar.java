package lang.semantic;

public class STyChar extends SType {

	private static STyChar stchar = new STyChar();

	private STyChar() {
	}

	public static STyChar newSTyChar() {
		return stchar;
	}

	@Override
	public String toString() {
		return "Char";
	}

	@Override
	public boolean match(SType st) {
		return (st instanceof STyChar) || (st instanceof STyErr);
	}
}