package kow.tritonDigital.map;

import java.util.HashMap;

public class TritonMap<K, V> extends HashMap<K, V> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8302010169088363266L;
	private int numberOfGets = 0;
	private int numberOfPuts = 0;

	@Override
	public synchronized V put(K key, V value) {
		numberOfPuts += 1;
		return super.put(key, value);
	}

	@Override
	public synchronized V get(Object key) {
		numberOfGets += 1;
		return super.get(key);
	}	

	public int getNumberOfGets() {
		return numberOfGets;
	}

	public int getNumberOfPuts() {
		return numberOfPuts;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TritonMap<String, String> somemap = new TritonMap<String, String>();
		somemap.put("a", "1");
		somemap.put("b", "2");
		somemap.put("c", "3");
		//somemap.put("d", "4");
		somemap.get("c");
		somemap.get("c");
		//somemap.get("c");
		
		System.out.println(somemap.getNumberOfPuts());
		System.out.print(somemap.getNumberOfGets());
		
		

	}
}
