package day05ifelseifnestedifternary;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * 
		 * 
		 * Type java code by using if-else if() statement,
If age is less than 13 output will be “Should not work”,
If age is greater than 65 output will be “Retired”,
Otherwise; output will be “Should work”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter your Age");
		int age = scan.nextInt();
		
		if ( age <13 && age >=0 ) {
			System.out.println(" Should Not Work");
			
		}
		else if( age >65) {
			System.out.println("Retired");
			
		} 
		else if (age <0  ){
			System.out.println(" Not Valid Age");
		}
		
		
		else {
			System.out.println("Should Work");
		}
		
		
		
		//============================================
		System.out.println(" Enter your Age");
		int age1 = scan.nextInt();
		
		if ( age1 < 0 ) {
			System.out.println(" Enter Valid Age");
			
		}
		else if( age1 <13) {
			System.out.println("Should not work");
			
		} 
		else if (age1 <= 65  ){
			System.out.println(" should work");
		}
		
		
		else {
			System.out.println("Retired");
		}
		
		scan.close();
	}

}
