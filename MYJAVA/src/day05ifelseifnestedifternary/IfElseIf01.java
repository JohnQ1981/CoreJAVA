package day05ifelseifnestedifternary;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		/*
		 use if -else- if -statement , when you have 2 options
		 
		 as user to enter 1 integer
		 
		 if integer is more than 0, print Positive
		 
		 if integer is 0, print neutral
		 if integer is less then 0 print negative
		 */
		Scanner scan=new Scanner(System.in);
		 System.out.println(" Enter integer ");
		 int a = scan.nextInt();
		  if(a == 0) {
			  System.out.println(" It is Neutral");
			  
		  }
		  else if(a > 0) {
			  System.out.println("it is Positive");
			  
		  } else {
			  System.out.println(" It is Negative");
		  }
		 
		// test for boundary Values Check, 
		  //Boundary Value Test
		scan.close();

	}

}
