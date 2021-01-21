/**
 * 
 */
package day07practce;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class Practice005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age? ");
		int age = scan.nextInt();
		
		double cal = ((age * 2) + 8)/3;
		System.out.println("it is :"+ cal);
		
		
		double s= 9.0-(4.0/(2.0*5.0));
		
		System.out.println("It is :" + s);
		
		int tp = 45;
		int np = 8;
		System.out.println(tp % np);
		System.out.println("Enter Please number:");
		int f=scan.nextInt();
		int ld = f %10;
		System.out.println(" Last The Digit is:"+ ld);
		
		scan.close();

	}

}
