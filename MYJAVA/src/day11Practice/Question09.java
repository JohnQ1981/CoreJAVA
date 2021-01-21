/**
 * 
 */
package day11Practice;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class Question09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What size of the coffee you would like to drink?");
		String size = scan.nextLine();
		char sb = size.toLowerCase().charAt(0);
		
		switch(sb) {
		case 't':{
			System.out.println("it is Tall");
			break;
		}
		case 'g' :{
			System.out.println("it is grande");
			break;
		}
		case 'v' :{
			System.out.println("it is Venti");
			break;
		}
		default:{
			System.out.println("Enter only t v or g");
		}
		
		
		
		}

	}

}
