/**
 * 
 */
package day11Practice;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class Question005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your age");
		int age = scan.nextInt();
		
		if (age<0) {
			System.out.println(" Please Enter Correct Age");
		}
		else if(age<16) {
			System.out.println("You are not eligible to get a driver license");
		}else if(age>=16 && age<18) {
			System.out.println("You can get only permit to drive");
			
		}
		else {
			System.out.println("You are eligible to get a driver license");
		}
scan.close();
	}

}
