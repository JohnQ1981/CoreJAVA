package day08stringmanipulationsnt;
import java.util.Scanner;
public class SSNAndString {

	public static void main(String[] args) {
		
		/*
		Ask user ta enter his/her first name, last name 
		and Social Security Number. 
		Then type a program which makes 
		the initials of the first name and the
		 last name in uppercase, other characters
		  will be in lowercase.
		All characters except last 4 characters 
		of the Social Security Number �*�
		For example; Suleyman Alptekin *****5678 (9 digits)
		*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First And Last Name and SSN");
		String fn = scan.nextLine().trim();
		String ln = scan.nextLine().trim();
		String ssn = scan.nextLine();
		
		if (ssn.length()<9) {
			System.out.println("Enter 9 Digits SSN");
			
		}
		else {
			
						
			fn = fn.substring(0,1).toUpperCase()+fn.substring(1).toLowerCase();
			System.out.println(fn);
			ln = ln.substring(0,1).toUpperCase()+ln.substring(1).toLowerCase();
			System.out.println(ln);
			
			ssn= "*****"+ssn.substring(ssn.length()-4);
			System.out.println(ssn);
			
			System.out.println(fn +" "+ ln+" " + ssn);
			
		}
		
		scan.close();
		
		
		
	}

}
