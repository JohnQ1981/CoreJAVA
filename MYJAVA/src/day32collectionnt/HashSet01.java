package day32collectionnt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSet01 {

	public static void main(String[] args) {
		/*
		 
		
		1) HashSet does not accept repeated data, all data must be unique in HashSet,
			if you need collection that has only unique data , use HashSet. 
		2) HashSet is the fastest set in Java, when I need unique data use HashSet.
		
		3) HashSet does not put the elements in any order, Elements are ordered in random order
			since they are unique.
		4) "null" can be used as an element in HashSets, object with no value="null";
		 
		Note: if you need a collection which has Unique Elements, order is not important,and fast speed is 
		very important then use HashSets. 
		
		
		
		
		
		
		
		
		 
		 */
				
				
			HashSet<String> hs1 = new HashSet<>();	
			
			hs1.add("Ali");
			hs1.add("Veli");
			hs1.add("Jack");
			hs1.add("John");
			hs1.add("Tarik");
			hs1.add("Celi");
			
			System.out.println(hs1);//[Celi, Veli, John, Tarik, Jack, Ali] random
			
			//if you try to add the same element into the HashSet 
			//you will not get any Errors, no RTE no compile Time Error, Java will overwrite
			
			hs1.add("Celi");//
			hs1.add("null");
			
			System.out.println(hs1);
			
			hs1.add("null");
			
			List<String> l1= new ArrayList<>();
			
			l1.add("Ali");
			l1.add("Celi");
			
			
			System.out.println(hs1);
			
			hs1.containsAll(l1);
			System.out.println(hs1.containsAll(l1));//true
			
			l1.add("Ikram");
			
			System.out.println(hs1.containsAll(l1));//false since no ikram in HashSet
			
			hs1.hashCode();
			System.out.println(hs1.hashCode());//93411745
			hs1.iterator();
			System.out.println(hs1.iterator());
				

	}

}
