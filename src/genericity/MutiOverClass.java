package genericity;

import java.util.HashMap;
import java.util.Map;

public class MutiOverClass<K, V> {
	public Map<K, V> map = new HashMap<K, V>();
	
	public void put(K k, V v){
		map.put(k, v);
	}
	
	public V get(K k){
		return map.get(k);
	}
	
	public static void main(String[] args) {
		MutiOverClass<Integer, String> mu = new MutiOverClass<Integer, String>();
		for(int i = 0; i < 5; i++){
			mu.put(i, "num" + i);
		}
		for(int i = 0; i < mu.map.size(); i++){
			System.out.println(mu.map.get(i));
		}
	}
}
