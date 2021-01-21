package day09loops;
import java.util.Scanner;
public class String01 {

	public static void main(String[] args) {
		
		/*
		 sometime we need to update or remove 
		 just letters or just digits from a String
		 to do this task we use  Regular Expressions (regex)
		 with replaceAll method
		  * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String ");
		String s = scan.nextLine();
		String s2 = scan.nextLine();
		String s3 = scan.nextLine();
		System.out.println(s);
		System.out.println(s2);
		// for letters and digits we use "\\w"==> it means Upper Case A--> Z
		//from a-> z, 0->9
		s = s.replaceAll("\\w", "");
		System.out.println(s);
		
		//"\\W" ==>  A--> Z
		//from a-> z, 0->9  not <=== but all others
		
		s2 = s2.replaceAll("\\W", "");
		System.out.println(s2);
		
		
		// "\\d"  removes all digits and replaces 
		System.out.println(s3.replaceAll("\\d",""));
		//"\\D"  removes and replaces all but digits
		scan.close();
		
		
	}

}
