/**
 * 
 */
package day11Practice;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class Question06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Question 2: Type the program which asks 
		 * the user the favorite color. 
		 * If it is green, it prints you 
		 * like natural places. If it is yellow,
		 *  it prints you like brightness. 
		 *  If it is red, it prints you like mystery. 
		 *  If it is blue, it prints you like comfort.
		 *   If it is none of them, 
		 *   it prints I can not see your
		 *    feeling with that color.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Yor favorite Color");
		String color = scan.nextLine().trim().toUpperCase();
		
		switch(color) {
		
		case("GREEN"):{
			System.out.println("you like natural  places");
			break;
		}
		case("RED"):{
			System.out.println("You like mystery");
			break;
		}
		case("BLUE"): {
			System.out.println("You like comfort");
			break;
		}
		case("NONE"):{
			System.out.println("I cannot see your feeling with that color");
			break;
		}
		default:{
			System.out.println("you did not entered");
		}
		
		}
		scan.close();
		
		
		
		
	}

}
