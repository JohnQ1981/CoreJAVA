package day09loops;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a name.		
If the name contains the letter ‘a’ then print “Won!” on the console
otherwise ask user to enter another name.
Use do-while loop.


Type java code by using while loop,
Write a program that prompts the user 
to input a positive integer.
It should then print the 
multiplication table of that number.
		 */
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter Positive number");
		
		int i= scan.nextInt();
		
		int b=0;
		while(b<=10) {
			System.out.println("The "+i+" multiplied "
					+ "by "+b+ " is = "+b*i);
			b++;
		}
		scan.close();
		
		
		
		
		
		
		
		
	}

}
