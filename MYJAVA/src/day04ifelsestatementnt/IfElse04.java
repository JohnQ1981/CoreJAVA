package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//monday
		System.out.println("Enter Any name of the Days");
		
		String s1 = "Learn Java";
		String s= scan.next();
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(6));
		s=s.toLowerCase();
		// no more 80 characters in one line
// Java uses index and index starts with 0 , index is one less of order number
	if(s.equalsIgnoreCase("Monday") || s.equalsIgnoreCase("Tuesday") || s.equalsIgnoreCase("Wednesday")
|| s.equalsIgnoreCase("Thursday")|| s.equalsIgnoreCase("Friday"))

{
		System.out.print(s.charAt(1));
		System.out.print(s.charAt(3));
		System.out.print(s.charAt(5));

} else {
	
	System.out.println("Enter a Valid name");
}
	
	// Java uses Boundary check for numbers
	
	
	
	
	}

}
