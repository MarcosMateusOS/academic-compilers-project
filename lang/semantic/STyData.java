package lang.semantic;

public class STyData extends SType {
	private String name;
	
	


	private STyData(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public boolean match(SType st) {
		return (st instanceof STyData) || (st instanceof STyErr);
	}
	

}