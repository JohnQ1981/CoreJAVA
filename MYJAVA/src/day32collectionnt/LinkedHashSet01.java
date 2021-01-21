package day32collectionnt;

import java.time.LocalTime;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet01 {

	public static void main(String[] args) {
		

		
		/*
		 1)Elements are unique
		 2)Elements are in the insertion order
		 3) it accepts "null" as value.
		 
		 Note: if you need a collection which has unique Elements ordered in insertion order
		 and has null as element, use LinkedHashSet.
		 
		 note: Java creates codes for every data by using "hashing technique".
		 "hashing technique" is technique to create unique codes, Java finds some codes
		 to make sure all hash codes are unique. 
 			
		 */
		
		
		LocalTime startingTime1 = LocalTime.now();
		System.out.println(startingTime1);
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
		
		lhs1.add("Ali");
		lhs1.add("Veli");
		lhs1.add("Jack");
		lhs1.add("John");
		lhs1.add("Tarik");
		lhs1.add("Celi");
		
		System.out.println(lhs1);//[Ali, Veli, Jack, John, Tarik, Celi]
		lhs1.add("Ali");
		
		System.out.println(lhs1);//[Ali, Veli, Jack, John, Tarik, Celi]
		
		lhs1.add("null");
		
		System.out.println(lhs1);//[Ali, Veli, Jack, John, Tarik, Celi, null]
		
		LocalTime endingTime1 = LocalTime.now();
		
		System.out.println(endingTime1);
		
		System.out.println("================");
		
		
		LocalTime startingTime2 = LocalTime.now();
		System.out.println(startingTime2);
		
		HashSet<String> hs1 = new HashSet<>();
		
		hs1.add("Ali");
		hs1.add("Veli");
		hs1.add("Jack");
		hs1.add("John");
		hs1.add("Tarik");
		hs1.add("Celi");
		
		System.out.println(hs1);//[Ali, Veli, Jack, John, Tarik, Celi]
		hs1.add("Ali");
		
		System.out.println(hs1);//[Ali, Veli, Jack, John, Tarik, Celi]
		
		hs1.add("null");
		
		System.out.println(hs1);//[Ali, Veli, Jack, John, Tarik, Celi, null]
		LocalTime endingTime2 = LocalTime.now();
		
		System.out.println(endingTime2);
		
		System.out.println(lhs1.hashCode());
		

	}

}
