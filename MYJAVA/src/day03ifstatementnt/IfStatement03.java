package day03ifstatementnt;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 * Type java code by using if statement. When you enter the name of the day of a week,
output will be “Weekday” or “Weekend day” according to the name of the day.
		 */

		Scanner scan = new Scanner(System.in);
			System.out.println(" enter Day name");	
			String d3 = scan.nextLine();
			if(d3.equalsIgnoreCase("Monday") || d3.equalsIgnoreCase("Tuesday")|| d3.equalsIgnoreCase("Wednesday")|| d3.equalsIgnoreCase("Thursday")| d3.equalsIgnoreCase("Friday"))
		{System.out.println(" It is Weekday");
	}
	if (d3.equalsIgnoreCase("Sunday")|| d3.equalsIgnoreCase("Saturday")) {
		System.out.println("Weekend Day");
	} 
	if(d3.equalsIgnoreCase("Other")) {
		System.out.println("It is not Day");
		
		
	}

	}// for Strings do not use double Equal sign to check equality
	// we use Double Equal sign == for primitive data tytpes. 
	//we non primitve data types we use equalsIgnoreCase method
}
