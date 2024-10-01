/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/
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