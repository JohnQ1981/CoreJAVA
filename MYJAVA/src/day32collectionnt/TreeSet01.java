package day32collectionnt;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		
			/*
				
				1) All elements are unique inside the TreeSet.
				2) All elements are in natural order. 
				(ascending order for numbers, alphabetical orders for string).
				Since putting element in order is hard, TreeSet will be slower than LinkedHashSet
				
				3)TreeSet is the slowest set of the Set Collection.
				
				Note: If you need a collection whose elements are unique and in natural order.
					  use TreeSet.	
					  But using TreeSet will make your program very slow. You need to do something to make
					  it faster. 
				4) TreeSet does not accept "null" as element.
				
				
				InterView Question:
				
				Q:if you need unique Data in Natural order? what do you use?
				
				Answer: I will use TreeSet, 
				
				Q: but TreeSet is very slow, what do you do to make your code faster?
				
				A: I use HashSet to add elements, then i convert HashSet to TreeSet. 
 
 
 		
			 */
		LocalTime st = LocalTime.now();
		
		System.out.println(st);
			TreeSet<String> ts1=new TreeSet<>();
			
			ts1.add("Ali");
			ts1.add("Veli");
			ts1.add("Jack");
			ts1.add("John");
			ts1.add("Tarik");
			ts1.add("Celi");
			
			System.out.println(ts1);//[Ali, Celi, Jack, John, Tarik, Veli] alphabetical order
			
			ts1.add("Ali");
			
			System.out.println(ts1);//[Ali, Celi, Jack, John, Tarik, Veli] no duplicates
			
			//s1.add("null");// null is not accepted as element
			
			System.out.println(ts1);
			
			LocalTime et =LocalTime.now();
			System.out.println(et);
			
			
			System.out.println("=======================");
			
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
			
			//hs1.add("null");
			
			System.out.println(hs1);//[Ali, Veli, Jack, John, Tarik, Celi, null]
			System.out.println("==========================");
			
			TreeSet<String> ts2= new TreeSet<>(hs1);
			
			System.out.println(ts2);
			
			LocalTime endingTime2 = LocalTime.now();
			
			System.out.println(endingTime2);
		

	}

}
