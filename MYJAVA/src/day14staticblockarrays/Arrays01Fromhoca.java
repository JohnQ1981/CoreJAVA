package day14staticblockarrays;

import java.util.Arrays;

public class Arrays01Fromhoca {
	
	int i = 12;
	
	/*
	 1)To store multiple values in a reserved area in memory, we may use "Array"s
	 2)An array can have just a single data type.
	 3)When you create an array you have to declare a)Data types of the elements
	                                                b)The number of elements
	 4)What kind of data types can we store in an array?
	   a)All primitives can be stored. 
	   b)Non-primitive ones CANNOT be stored in arrays.
	   c)Reference of non-primitive ones can be stored. 
	 5)Arrays are objects so they are stored in Heap Memory, arrays have methods in heap memory
	   next to the values                                               
	*/

	public static void main(String[] args) {
		//How to create an array
		int a[] = new int[5];	
		//How to add elements into an array
		a[0] = 13;
		a[3] = 25;
		a[2] = 13;
		a[4] = 31;
		a[1] = 10;
		//How to print an array on the console
		System.out.println(Arrays.toString(a));
		//How to print a specific element
		System.out.println(a[3]);//25
		
				
		//Create a String array
		String b[] = new String[3];
		//If you do not assign value for an element, Java will use default values for it.
		b[0] = "Ali";
		b[2] = "Veli";
		System.out.println(Arrays.toString(b));
		//Print just Veli on the console
		System.out.println(b[2]);//Veli
		
		/*
		 Create a double array whose length is 5.
		 Assign values for all elements.
		 Print all elements in a line and but "-" between the elements
		 						2.1-3.2-4.0-
		*/
		double c[] = new double[5];
		c[0] = 1.2;
		c[1] = 3.4;
		c[3] = 5.6;
		c[4] = 7.8;
		//In Strings, we use "length()", in Arrays we use "length"
		for(int i = 0; i<c.length; i++) {
			System.out.print(c[i] + " - ");
		}

	}

}