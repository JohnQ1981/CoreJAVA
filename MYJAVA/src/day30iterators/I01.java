package day30iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class I01 {
	
	/*
	 1) WE have 2 interfaces: 1) Iterator : We can navigate inside a collection by using Iterator Interface.
	 						  				We can access elements of the collection by using Iterator Interface.
	 						  				We can remove elements from the collection by using Iterator Interface.
	 						  				
	 						  2) ListIterator: Listiterator has more functionality than iterator;
	 						  				   You can navigate inside the collection in 2 Directions.
	 						  				   by using hasNext() and next(), you can navigate form the beginining
	 						  				   to end , 
	 						  				   and by Uising hasPrevious() and previous(), you can navigate from end to begining,
	 						  				   Note: Before using hasPrevious() and previous(), you need to use 
	 						  				   			hasNext() and next()
		
 		Differences between"iterator" and 'listiteraor"
 			1) ListIterator can travers forward and backward.
 			2) Iterators can travers just forward.
 			3) ListIterator has hasNext(), next(), hasPrevious(), previous(), set(), add(); and remove();
 			   Iterator has (just)remove() and other standard methods.
 			4) ListIterator can be only used for Lists, but Iterator can be used for other collections as well.
 			5) ListIterator has some methods to use indexes, but Iterator cannot run with indexes.
 
 
	 */
	
	/*
	 * By using loops we cannot update the collections, but sometimes we need to update collections.
	 * to update collections we need to use iterators. 
	 */
	public static void main(String[] args) {

				List<String> list1 = new ArrayList<String>(); 
				
				list1.add("A");
				list1.add("C");
				list1.add("B");
				
				System.out.println(list1);
				
				//Navigate among the elements by using for-each loop
				for(String w: list1) {
					//System.out.print(w+ " ");
					//list1.add(w);
					w = w + "X";
					
				}
				System.out.println(list1);
				System.out.println();
				//Navigate amoing the elements by using iterator
				/*
				 hasnext(); asks to the pointer if there is any element after the pointer,
				 if there is it returns "true", if there is no element it returns "false"
				 
				 next(); moves the pointer to the front of the next element, and returns
				 the previous element that pointer was pointing to. 
 					
				 */
				Iterator<String> it1 = list1.iterator();
				
//				while(it1.hasNext()) {
//					System.out.print(it1.next()+" ");
//					
//				}
				System.out.println();
				
				while(it1.hasNext()) {
						it1.next();
						it1.remove();
						
					
				}
				System.out.println(list1);
				
				
				
//				for() {
//					
//				}
		
		
	}

}
