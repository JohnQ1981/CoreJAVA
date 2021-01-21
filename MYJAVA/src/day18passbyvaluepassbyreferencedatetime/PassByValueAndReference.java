package day18passbyvaluepassbyreferencedatetime;

import java.util.ArrayList;
import java.util.List;

public class PassByValueAndReference {

	public static void main(String[] args) {
		/*
		 *

		1.) Java uses " pass by value", Java does not use " pass by reference";
		AFTER USING METHOD IF ORIGINAL VALUE DOES NOT CHANGE:
		IT IS CALLED "IMMUTABLE" , STRINGS ARE IMMUTABLE.
		

		 */
		// Pass by Value with Primitives
		
		int y = 5;
		
		square(y);
		
		System.out.println(y);
		
		// Pass by Value with Non- Primitives
//		AFTER USING METHOD IF ORIGINAL VALUE DOES NOT CHANGE:
//		IT IS CALLED "IMMUTABLE" , STRINGS ARE IMMUTABLE.
		String s="Ali";
		concat(s);
		
		System.out.println(concat(s));
		
		System.out.println(s);
		
	    //2.type
		//AFTER USING METHOD , ORIGINAL VALUE CHANGES IN LISTS.
		// BECUASE OF THAT LISTS ARE CALLED "MUTABLE"
		List<Integer> list = new ArrayList<>();
		
		list.add(11);
		list.add(12);
		System.out.println(list);
		
		System.out.println(increase(list));
		
		System.out.println(list);
	}

	// PASS BY REFERENCE
	
	
	
	
	
	
	public static List<Integer> increase(List<Integer> list) {
		
		//for(Integer w: list) {
			
			
			list.add(3);
			
			
		//}
		
		return list;
		
		
		
	}
	
	public static String concat(String s) {
		
		return s+"*";
		
		
	}
	
	
	    public static void square(int x) {
	    	System.out.println(x*x);
	    	
	    }
}
