package lang.semantic;


public class LocalEnv<T> {
	private String id;
	private SType ty;
	
	
	public LocalEnv(String id, SType ty) {
		this.id = id;
		this.ty = ty;
	}
}
