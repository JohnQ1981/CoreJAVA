/**
 * 
 */
package day06nestedternaryswitch;

import java.util.Scanner;

/**
 * @author IK
 *
 */
public class Switch02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
//System.out.println("Value of 5 is " );
System.out.println("Enter Day name");
String dayname= scan.next();
switch (dayname){
	case("Monday"):
		System.out.println("First Daye of the Week");
	break;
	case("Tuesday"):
		System.out.println("Second day");
	break;
	case("Wednesday"):
		System.out.println("Third Day");
	break;
	case("Thursday"):
		System.out.println("Fourth Day");
	break;
	case("Friday"):
		System.out.println("Fifth Day");
	break;
	case("Saturday"):
		System.out.println("Sixth Day");
	break;
	case ("Sunday"):
		System.out.println(" Seventh Day");
	break;
	default: System.out.println("Enter Only Day Name");
	System.out.println("Value of 5 is " + '5');
	
	
	
	scan.close();
	
}

		
		

	}

}
