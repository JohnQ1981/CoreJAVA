package day14staticblockarrays;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		/*
		 * Get a three-digit number from the user and print all digits.
		 * Ex : Inputs : 853 
		 * Output : The number's  unit digit is : 3
		 *          The number's tens digit is  : 5 
		 *          The number's hundreds digit is : 8
		 *          */

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a three-digit number ");
		int num = scan.nextInt();
		
		int unit = num%10;
		System.out.println("The number's  unit digit is " + unit);
		
		num/=10;
		int tens = num%10;
		System.out.println(" The number's tens digit is " + tens);
		
		num/=10;
		int hundreds = num%10;
		System.out.println("The number's hundreds digit is " + hundreds );
		
		
		
		System.out.println("Enter  3 digit number");
		int dg = scan.nextInt();
		
			
			System.out.println(dg%10+" "+ (dg/10)%10+" "+(dg%100)%10+" "+ dg%10);
		
		
		
		scan.close();
		

	}

	
	
}
