package lang.semantic;

public class STyInt extends SType {

	private static TyInt ti = new TyInt();

	private STyInt() {
	}
	
	public static TyInt

	@Override
	public boolean match(SType st) {
		return (st instanceof TyInt) || (st instanceof TyErr);
	}
}