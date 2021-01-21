package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		
		/*
		 if it rains i will cancel the picnic, else i will not.
		  
		  		  
		 */
		if(5>13) {
			System.out.println("IF body");
			
			
		} else {
			System.out.println("Else Body");
			
			
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an Integer");
		
		int a = scan.nextInt();
		//1.way by using 
		if(a%2 ==0) {
			
			System.out.println(" It is Even number");
			
			
		} else {
			
			System.out.println(" It is Odd Number");
		}
		System.out.println("Enter one more integer");
		int b= scan.nextInt();
		
				if(b%2 == 0) {
					System.out.println("Even");
					
				}
		if(b%2 != 0) {
			System.out.println(" Add");
		}
		
		
		
		
		
		
		scan.close();
		
		
		
		
		

	}

}
