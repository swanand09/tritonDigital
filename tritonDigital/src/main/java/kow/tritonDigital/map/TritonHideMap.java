package kow.tritonDigital.map;

import java.util.HashMap;

public class TritonHideMap<K,V> {
	
	HashMap<K, V> myHashmap;
	private int numberOfGets = 0;
	private int numberOfPuts = 0;
	
	public int getNumberOfGets() {
		return numberOfGets;
	}
	
	public int getNumberOfPuts() {
		return numberOfPuts;
	}

	public TritonHideMap() {
		myHashmap = new HashMap<K, V>();		
	}	
	
	public synchronized V get(K key) {
		numberOfGets += 1;
		return myHashmap.get(key);
	}	
	
	public synchronized V put(K key, V value) {
		numberOfPuts += 1;
		return myHashmap.put(key, value);
	}







	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
