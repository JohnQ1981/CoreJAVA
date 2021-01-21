package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Enter Your Age");
		
		int age = scan.nextInt();
		
		if(age >=18 && age <=65 ) {
			
			System.out.println(" You need to Work");
		} else {
			
			System.out.println(" No Need to work:");
		}

		// boundary value test 
		
	}

}
