/**
 * 
 */
package day11Practice;

import java.util.Scanner;

/**
 * @author IK
 *
 */
public class Practice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A value");
		int av = scan.nextInt();
		
		if(av<0) {
			av = av*(-1);
			System.out.println("Absolute Value is "+ av);
		}
		else {
			System.out.println("Absolute Value is "+ av);
		}
		scan.close();
	}

}
