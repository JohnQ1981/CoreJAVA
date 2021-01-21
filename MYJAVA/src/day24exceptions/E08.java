package day24exceptions;

import java.util.Scanner;

public class E08 {

	public static void main(String[] args) {


		int numOfEggs = 12;
		
		
		
		
		
		
		if(numOfEggs<0) {
			
			throw new IllegalArgumentException("Number of Eggs cannot be less than 0");
			
		}else {
			System.out.println(numOfEggs);
		}
		
		String s = "1023";
		
		boolean r = true;
		for(int i =0; i <s.length();i++) {
			if(!(s.charAt(i)>='0'&& s.charAt(i)<='9')) {
				r= false;
			}
		}
		
		if(!r) {
			throw new NumberFormatException("Some chars are not digit");
			
		}else {
			//System.out.println(s+1);
			System.out.println(Integer.parseInt(s+1));
			int result = Integer.parseInt(s);
			System.out.println(s+" "+ (result+1));
		}
		
		
		String v = "abc";//null;//"Null";
		
		if(v.equals(null)) {
			
			throw new NullPointerException();
		
		}else {
			
			System.out.println(v.length());
		}
		
		
		int arr[] = {11,12,13};
		Scanner scan = new Scanner(System.in);
		System.out.println("Which index do you want to use");
		int idx = scan.nextInt();
		if(idx>=arr.length || idx<0) {
			throw new ArrayIndexOutOfBoundsException("use valid index");
			
		}else {
			System.out.println(arr[idx]);
		}
		
		int j = 12;
		short k = (short)j;
		// between primitives you can do explicit narrowing 
		//but for some classes explicit narrowing does not work
		//for Example: You cannot cast Object Class object to a String Class object.
		// if you insist to convert an object from Object Class
		//to String Class you will get ClassCastException
		Object obj = new Object();
		String str = (String)obj;//ClassCastException
		
//		Integer a = new Integer(4);
//		Short sa = (Short)a;

	}

}
