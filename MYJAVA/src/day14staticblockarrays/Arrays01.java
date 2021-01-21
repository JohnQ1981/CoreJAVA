package day14staticblockarrays;

import java.util.Arrays;

public class Arrays01 {
	
	int i = 12;
	
	/*   1.)Arrays :to Store multiple values in memory we can use "Array"s.
	 *   2.) an Array can have just a single DATA Type; 
	 *   3. When you Create an ARRAY, you have to Declare:
	 *        a. DATA Types of the elements
	 *        b. Number of elements.
	 *        
	 *   4.) What kind of DATA Type can we store?
	 *         a) All Primitive can be stored
	 *         b) Non-primitive one Cannot be Stored in ARRAYS
	 *         c) Reference of NON PRIMITIVE ones can be stored.
	 *         
	 *   5) ARRAYS ARE OBJECT SO THEY ARE STORED IN HEAP MEMORY. 
	 *   ARRAYS have METHODS IN HEAP MEMORY NEXT TO VALUES.
	 *   
	 *         
	 *   ARRAYS work with SACK Memory, it stores Reference of the NON PRIMITVE DATA TYPES.
	 *   ARRASY DOES NOT WORK WITH HEAP MEMORY. 
	 *   Declare DATA Type and Declare Number of elements in the ARRAY
	   :Variable names should start with lower case letters
	*/
	
	

	public static void main(String[] args) {
		
       int a [] = new int[5];
       a[0] = 5;
       a[3] = 25;
       a[0] = 15;
       a[2] = 13;
       a[4] = 31;
       a[1] = 10;
       System.out.println(a);
       
       System.out.println(Arrays.toString(a));// how to print array on the console 
       
       
       
       for(int k =0; k<=a.length-1;k++) {
    	   System.out.print("["+a[k]+"]"+" ");
       }
       
       
       // how to print a specific Element
       System.out.println(a[3]);
       
       
       System.out.println(a[0]);
       // Creating String value 
       // if you do not assign value for an element, Java will use Default Values.
       String b[] = new String[3];
       b[0] = "Ali";
       b[2] = "Veli";
       System.out.println(Arrays.toString(b));
       
       System.out.println(b[2]);
       
       
       double a3[] = new double[5];
       a3[0]= 1.2;
       a3[1] = 2.6;
       //a3[2]= 3.98;
       a3[3] = 4.56;
       a3[4] = 5632.56;
       // in Strings when we use length() with parenthesis, in arrays just length  no parenthesis
       for(int k =0; k<= a3.length-1; k++) {
       System.out.print(a3[k]+"-");
       }
       System.out.println();
       System.out.println(Arrays.toString(a3));
       
       

	}

}
