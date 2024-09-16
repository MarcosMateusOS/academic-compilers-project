package lang.semantic;

public class STyArray extends SType {

	private SType type;

	private STyArray(SType type) {
		this.type = type;
	}

	public  SType getType() {
		return type;
	}
	
	@Override
    public String toString() {
        return "Array type => " + type.toString() + "[]";
    }

	@Override
	public boolean match(SType st) {
		return (st instanceof STyArray) || (st instanceof STyErr);
	}
}