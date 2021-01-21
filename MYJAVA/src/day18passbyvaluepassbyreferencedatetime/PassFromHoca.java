package day18passbyvaluepassbyreferencedatetime;

import java.util.ArrayList;
import java.util.List;

public class PassFromHoca {

	public static void main(String[] args) {
		
		/*
		 1)Java uses "pass by value", Java does not use "pass by reference"
		*/
		
		//Pass by Value with primitives
		int y = 5;
		square(y);
		System.out.println(y);
		
		//Pass by value with non-primitives
		//1.Type
		//After using methods, if the original value does not change
		//it is called "immutable", so Strings are immutable
		String s = "Ali";
		System.out.println(concat(s));//Ali*
		System.out.println(s);//Ali
		//2.Type
		//After using methods, original value changes in lists
		//because of that lists are called "mutable"
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		System.out.println(increase(list));
		System.out.println(list);
		
		//Pass by Reference
		//When pass by reference is used, the copy of reference is created
		//and used it in the method. Original reference and copy reference
		//points the same object. Because of that, using original or copy
		//reference updates the same data which is original.

	}
	
	public static void square(int x) {
		System.out.println(x * x);
	}
	
	public static String concat(String s) {
		return s + "*";
	}
	
	public static List<Integer> increase(List<Integer> list) {
			list.add(3);
		    return list;
	}

}