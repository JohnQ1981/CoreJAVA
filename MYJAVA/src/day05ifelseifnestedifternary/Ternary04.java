package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		/*
		Ask user to enter an integer. If the number has 3 digits, 
		output will be
		“This number has 3 digits.”
		 Otherwise, output will be “This number has no 3 digits.”
		How can you decide the number of digits of an integer?
		
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter an Integer");
		int num = scan.nextInt();
		
		String r = (num >99 && num<1000) || (num <-99 && num>-1000)? "This number has 3 digits." : "This number has no 3 digits." ;
		System.out.println("result " + r);
		
	scan.close();	
	}

}
