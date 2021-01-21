/**
 * 
 */
package day11Practice;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class Question04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a character");
		char ch = scan.next().charAt(0);
		boolean t = (ch>='A' && ch<='Z') || (ch>='a' && ch<='z');
		if(t == true) {
			System.out.println(" it is alphabetic");
		}
		else {
			System.out.println(" it is not alphabetic");
		}
		scan.close();
	}

}
