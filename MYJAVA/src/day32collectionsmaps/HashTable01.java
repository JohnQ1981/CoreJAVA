package day32collectionsmaps;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable01 {

	public static void main(String[] args) {


		/*
		 1) HashTable is synchronized and thread-safe, if you need synchronized and thread-safe use HashTable.
		 2) HashTable does not accept 'null' as key, or value.
		 3) HashTable puts the elements in random order.
		 4)	HashTable is slower than HashMap.


		 { and= means it is map
		 */




		Hashtable<String, Integer> ht1= new Hashtable<>();

		ht1.put("Ali", 24);
		ht1.put("Burhan", 32);
		ht1.put("Ceyhan", 49);
		ht1.put("Deli", 52);
		ht1.put("Deli", 52);
		ht1.put("John", 22);
		ht1.put("John", 44);

		System.out.println(ht1);//{John=22, Ali=24, Burhan=32, Deli=52, Ceyhan=49}



		System.out.println(ht1.entrySet());//[John=22, Ali=24, Burhan=32, Deli=52, Ceyhan=49]

		Set<Entry<String, Integer>> s1 = ht1.entrySet();

		System.out.println(s1);

		Iterator<Entry<String, Integer>> it1 = s1.iterator();

		while(it1.hasNext()) {
			Object el= it1.next();
			System.out.print(el +" ");

		}
		System.out.println();
		System.out.println(ht1.keySet()+"*"+ ht1.entrySet());


	}

}
