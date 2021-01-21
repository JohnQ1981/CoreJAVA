package day06nestedternaryswitch;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		/*
		 ask user the password has 8 characters and
		 first character is  a digit 
		 print: 'The Password is valid"
		 otherwise:
		 check the last character of the password
		 if it is Upper Case Z :
		 print not secure but acceptable.
		 otherwise print " the Password is not valid
		 */

		System.out.println("Enter Password");
		String pass = scan.next();
		
		String result =(pass.length()==8) && (pass.charAt(0)>='0' && pass.charAt(0)<='9') ?
			"The Password is Valid"	: pass.charAt(pass.length()-1)=='Z' ? "Not Secure but acceptable" :
				"Password is not valid";
		System.out.println("The Result is :" + result);
				
		scan.close();
	}

}
