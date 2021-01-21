package day09loops;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		/*
		Type java code by using while loop,
Write a program that prompts the user to input an integer.
It should then find sum of the digits of that number.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Integer");
		int num=scan.nextInt();
		
		int sum=0;
		//int i = 0; // flag
		
		while(num!=0) {
			
			sum=sum+num%10;
			num=num/10;		
			//sum=sum+num;
			
		}
		System.out.println(sum);
		
		scan.close();
		
		
		
		
	}

}
