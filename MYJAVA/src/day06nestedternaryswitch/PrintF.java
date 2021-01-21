/**
 * 
 */
package day06nestedternaryswitch;

import java.util.Scanner;

/**
 * @author IK
 *
 */
public class PrintF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("%d*%d=%d",5,3,5*3).println();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Char");
		char a = scan.next().charAt(0);
		
		String d=a>='A' && a<='Z'?"Upper CAse":(a>='a'&& a<='z'?"Lower Case":"It is not a Alpabet");
		System.out.println("Character is " +d);
		
		scan.close();
	}

}
