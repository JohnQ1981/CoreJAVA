/**
 * 
 */
package day11Practice;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class Question3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter integer ");
		int num = scan.nextInt();
		
		if(num%5==0 && num%2==0) {
			System.out.println("The number is divisible by both 2 and 5");
		}
		else if(num%2==0 || num%5==0) {
			System.out.println(" it is divisible by 2 or 5");
		}
		else {
			System.out.println("The number is not divisible either 2 or 5");
		}
		
		String res = (num%2==0 && num%5==0)? "divisible by both":(num%2==0||num%5==0 ? "Divisible by 2 or 5":"it is not");
		System.out.println(res);
		scan.close();
		
		
		
		
		

	}

}
