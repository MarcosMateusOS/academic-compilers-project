package lang.semantic;

import java.util.TreeMap;

public class TyEnv<T> {
	private TreeMap<String, T> tyEnv;
	
	public TyEnv() {
		tyEnv = new TreeMap<String, T>();
	}
	
	
	public void setFunction(String id, T type) {
		this.tyEnv.put(id, type);
	}
	
	 public T getFunction(String id){
         return this.tyEnv.get(id);
    }
	 
	 
	public boolean checkDuplicity(String id) {
		 return this.tyEnv.containsKey(id);
	}
	 

}