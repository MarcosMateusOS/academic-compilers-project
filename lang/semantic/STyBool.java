package lang.semantic;

public class STyBool extends SType {

	private static STyBool stb = new STyBool();

	private STyBool() {
	}

	public static STyBool newSTyBool() {
		return stb;
	}

	@Override
	public String toString() {
		return "Bool";
	}

	@Override
	public boolean match(SType st) {
		return (st instanceof STyBool) || (st instanceof STyErr);
	}
}