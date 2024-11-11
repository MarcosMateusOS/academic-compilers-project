/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/
package lang.semantic;

public class LocalEnv<T> extends TyEnv<T> {
	private String id;
	private SType ty;

	public LocalEnv(String id, SType ty) {
		this.id = id;
		this.ty = ty;
	}

	public LocalEnv() {

	}

	public void setLocal(String id, SType ty) {
		this.id = id;
		this.ty = ty;
	}

	public SType get() {
		return this.ty;
	}

}
