/**
 * 
 */
package day11Practice;

import java.util.Scanner;

/**
 * @author IK
 *
 */
public class Exam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AliCan";
		System.out.println(str.substring(2,5));
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Pass");
		String pass = scan.nextLine();
		while(!(pass.equals("password"))) {
			System.out.println("false");
			System.out.println("Enter your password");
			pass = scan.nextLine();
		}
		System.out.println("true");
scan.close();
	}

}
