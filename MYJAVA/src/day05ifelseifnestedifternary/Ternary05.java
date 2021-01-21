package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Ternary05 {

	public static void main(String[] args) {
		/*
		 Type java code by using ternary.
Write a program to print absolute 
value of an integer entered by user.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter integer");
		int t= scan.nextInt();
		
		int r = t<=0 ? t*(-1) :t;
		System.out.println("Result "+ r);
		
		scan.close();
		
		
	}

}
