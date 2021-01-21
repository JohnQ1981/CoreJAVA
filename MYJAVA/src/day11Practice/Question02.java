/**
 * 
 */
package day11Practice;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class Question02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		do {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number between 1 and 10");
		 n = scan.nextInt();
		
		if((n!=7 && n<0)&&n<7) {
			System.out.println("i am sorry,Try Again, your number is less than the lucky number");
		}else if((n!=7 && n<0)&&n>7) {
			System.out.println("i am sorry,Try Again, your number is greater than the lucky number");
		}
		} while(n!=7);
		System.out.println("You hit the lucky number!");
		
	}
	

}
