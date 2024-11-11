/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/
package lang.semantic;

import java.util.Set;
import java.util.TreeMap;

import lang.code_gen.Pair;

public class TyEnv<T> {
	private TreeMap<String, T> tyEnv;

	public TyEnv() {
		tyEnv = new TreeMap<String, T>();
	}

	public void set(String id, T type) {
		this.tyEnv.put(id, type);
	}

	public T get(String id) {
		return this.tyEnv.get(id);
	}

	public Set<String> getKeys() {
		return tyEnv.keySet();
	}
	
	public int getIndexOfKey(String key) {
	    int index = 0;

	    for (String currentKey : tyEnv.keySet()) {
	        if (currentKey.equals(key)) {
	            return index;
	        }
	        index++;
	    }

	    return -1;  
	}
	
	public Pair<SType, Integer> getPair(String id){
		return new Pair(this.tyEnv.get(id),this.getIndexOfKey(id));
	}

	public boolean checkDuplicity(String id) {
		return this.tyEnv.containsKey(id);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("TyEnv: \n");
		for (String key : tyEnv.keySet()) {
			sb.append(key).append(" : ").append(tyEnv.get(key)).append("\n");
		}
		return sb.toString();
	}

}