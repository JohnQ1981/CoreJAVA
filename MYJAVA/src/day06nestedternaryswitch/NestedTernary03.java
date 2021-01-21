/**
 * 
 */
package day06nestedternaryswitch;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class NestedTernary03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter name of the Day");
		String dn = scan.next();
		
		String n= (dn.equalsIgnoreCase("Monday"))? "1":(dn.equalsIgnoreCase("Tuesday")?"2":(dn.equalsIgnoreCase("Wednesday")?"3":
			(dn.equals("Thursday")?"4":(dn.equalsIgnoreCase("Friday")?"5":(dn.equalsIgnoreCase("Saturday")?"6":(dn.equalsIgnoreCase("Sunday")?"7":"Enter Days only ")))))
				
				);
		System.out.println(n);
		
		scan.close();
		
		
		

	}

}
