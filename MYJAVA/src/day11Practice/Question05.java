/**
 * 
 */
package day11Practice;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class Question05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter your Yearly");
		long sal = scan.nextLong();
		if(sal<0 || sal <1000) {
			System.out.println("Enter salary bigger than 1000");
		}
		else if(sal<50000) {
			System.out.println("You are not eligible to buy a home");
		}else if(sal>=50000 && sal<90000) {
			System.out.println("You are eligible to buy a home that costs less than 300K");
		}else {
			System.out.println("You good to purchase any type of home");
		}
scan.close();
	}

}
