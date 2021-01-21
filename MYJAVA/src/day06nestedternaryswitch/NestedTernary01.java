package day06nestedternaryswitch;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
		/*
		 Nested Ternary, inside the Ternary you can put another Ternary
		 
		 	 
		Fast is slow, slow is fast. 
		
		ask user to enter an integer , if integer is greater or equal to 
		0, then check
		if it has 2 digits , or not
		if it has two digits print its Square, otherwise print its Cube
		 if integer is less then 0  check
		 if it is less than -10 or not
		 if it is less than -10 
		 print number itself otherwise print absolute value
		 */
		Scanner scan = new Scanner(System.in);
		/*System.out.println("'Enter The Year'");
		int y = scan.nextInt();
		
		String r = y%100 == 0? (y%400 ==0? "Ly": "N L Y"): (y%100!=0 ? (y%4==0?"LY": "NLY"));
		
		System.out.println(r);*/
		
		System.out.println(" Enter an Integer");
		int a = scan.nextInt();
		
		int r = a>= 0?(a>9 && a<100?a*a:a*a*a):(a<-10?a:a*(-1));
		System.out.println(r);
		
		scan.close();
		
		
		
		

	}

}
