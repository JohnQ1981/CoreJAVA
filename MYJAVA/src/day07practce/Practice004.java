/**
 * 
 */
package day07practce;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class Practice004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please Enter Radius of the Circle:");
		double r= scan.nextDouble();
		float pi = 3.14f;
		double area = r * r * pi;
		int perimeter =(int) (2 * pi * r);
		System.out.println(" The Are of the Circle is: " + (int)area+ " And Perimeter is"+" "+perimeter);
		
		scan.close();

	}

}
