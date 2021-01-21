/**
 * 
 */
package day07practce;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class Practice003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("How much money do you have?");
		double money= scan.nextDouble();
		
		System.out.println("How much you spent for Apple?");
		double apple = scan.nextDouble();
		
		System.out.println("How much you spent for Grapes?");
		double grapes=scan.nextDouble();
		
		System.out.println("how much money you spen Strawberries?");
		double strw=scan.nextDouble();
		
		double spent = apple+grapes+ strw;
		System.out.println("All Spent money: "+ spent+ " And Money you left"+ (money-spent));
		
		scan.close();

	}

}
