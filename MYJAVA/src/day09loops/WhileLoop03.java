package day09loops;

import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {
		/*
		Type java code by using while loop,
Write a program that prompts the user to input a positive integer.
It should then print factorial of that number.
		 * 
		 */
		
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Positive Number");
			int n = scan.nextInt();
			
			int r=1;
			int i=1;// counter for loop, are called flag
			if(n<0) {
				System.out.println("Enter number greater than 0");
			}
			else {
			while(i<=n) {
				
				r=r*i;
				i++;
			}
			System.out.println("Factorial of " +n+"! is: "+r);
			}
			
			scan.close();
	}

}
