/**
 * 
 */
package day07practce;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class Practice002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Last 4 Exam's Grades: ");
		int a =scan.nextInt();
		int b = scan.nextInt();
		int c= scan.nextInt();
		double d = scan.nextDouble();
		double av=(a+b+c+d)/4;
		System.out.println("Average is: "+ av);
		scan.close();
		
		
	}

}
