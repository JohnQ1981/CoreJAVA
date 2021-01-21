package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*
		 Type java code by using ternary and if-else. 
		 Ask user to enter two integers
Write a program to print the minimum one on the console.
		 */
Scanner scan = new Scanner(System.in);
System.out.println("Enter Two integer");
int a =scan.nextInt();
int b = scan.nextInt();
int m = a>b ? b : a;
   System.out.println( a>b ? b : a);
   System.out.println("Smaller :" + m);

scan.close();
		
		
		
		
		
		
	}

}
