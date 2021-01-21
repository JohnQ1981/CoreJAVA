/**
 * 
 */
package day05ifelseifnestedifternary;

import java.util.Scanner;

/**
 * @author IK
 *
 */
public class HWIfElseIFDay05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Integer");
		int i1 = scan.nextInt();
		System.out.println(" Enter Second Integer");
		int i2 = scan.nextInt();
		
		if(i1 >= 0 && i2>= 0) {
			System.out.println("Since both Positive:"+ (i1+i2));
			
		}
		else if(i1<0 && i2<0) {
			System.out.println("Since both Negative "+ i1*i2);
		}
		else {System.out.println("I cannot add or multiply \n different signed numbers");}
		scan.close();
		
		
	}

}
