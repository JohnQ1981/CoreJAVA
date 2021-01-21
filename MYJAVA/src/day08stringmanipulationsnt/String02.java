package day08stringmanipulationsnt;
import java.util.Scanner;
public class String02 {

	public static void main(String[] args) {
		/*
		Ask user to enter password, if the password is okay for the following conditions output will be
		“Your password is created successfully.” 
		If the password is not okay for any of the following conditions output will be 
		“Enter a new password according to the give conditions”
				1.First letter must be upper case
				2.Last letter must be lower case
				3.Password must contain at least 6 characters
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Password");
		String pass = scan.nextLine();
		if(pass.charAt(0)>='A' && (pass.charAt(pass.length()-1)>='a'&&pass.charAt(pass.length()-1)<='z') &&
		pass.length()>5){
			System.out.println("Your Password is creates Successfully");
		}
		else {
			System.out.println("enter a new password according to the given conditions");
		}
		
		
		
		
		
		
		
		
		scan.close();
	}

}
