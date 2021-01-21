package day32collectionsmaps;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable01Fromhoca {
	
	/*
	 1)HashTable is syncronized and thread-safe
	 2)HashTable deos not accept "null" as key or value.
	 3)HashTable puts the elements in random order.
	 4)HashTable is slower than HashMap
	 */

	public static void main(String[] args) {
		
		Hashtable<String, Integer> ht1 = new Hashtable<>();
		ht1.put("Ali Can", 23);
		ht1.put("Veli Han", 25);
		ht1.put("Kemal Ay", 23);
		ht1.put("Canan Can", 23);
		ht1.put("Angie Star", 23);
		System.out.println(ht1);//{Angie Star=23, Kemal Ay=23, Veli Han=23, Canan Can=23, Ali Can=23}
		
		//entrySet() method displays the map elements in a Set.
		Set<Entry<String, Integer>> s1 = ht1.entrySet();
		
		Iterator<Entry<String, Integer>> it1 = s1.iterator();
		while(it1.hasNext()) {
			Object el = it1.next();
			System.out.print(el + " * ");
		}

	}

}