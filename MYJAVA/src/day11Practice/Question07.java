/**
 * 
 */
package day11Practice;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class Question07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		Question 1: Type the program which
		 asks the user to put the birth year.
		  It calculates the user's age.
		   If the age is 65 or more than that,
		    it prints that you are eligible to get retired.
		     Otherwise, it prints that 
		     you are not eligible to 
		     get retired yet 
		     (Use ternary operators in your codes). 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your year of Birth");
		int dob = scan.nextInt();
		int retire = 2020-dob;
		if(retire>65) {
			System.out.println("You are eligible to retire "
					+ "since you are "+ retire+" years old");
		}
		else {
			System.out.println("You are not eligible to retire "
					+ "since you are "+ retire+" years old");
		}
		
		String r = (retire>65)?"You are eligible to retire since you ar"+retire+"years old":"You are not";
		System.out.println(r);
		scan.close();
	
}
}


