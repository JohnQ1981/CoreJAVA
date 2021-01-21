/**
 * 
 */
package day11Practice;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class Question08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int j;
		
		if(n>9 && n <99) {
			j = n%10;
			System.out.println(j);
			
		} else {
			System.out.println(n*n);
		}
		int result= (n>9 && n <99)?n%10:(n*n);
		System.out.println(result);
scan.close();
	}
  
}
