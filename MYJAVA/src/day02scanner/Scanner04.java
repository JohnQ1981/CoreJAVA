package day02scanner;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		/*
		 * ask user to enter full name and address
		 * Print them  on the console
		 * 
		 * 
		 */
Scanner scan = new Scanner(System.in);
//Class 



System.out.println("Enter First Name and Last Name:");

String FirstLastName = scan.nextLine();

System.out.println("Enter Your Address :");
String address = scan.nextLine(); // For Strings we use nextLine() method.
                                  // There is one more method for String is the next() but it only gets first word

System.out.println("Your Full name is " + FirstLastName);
System.out.println("And your address is " +
		address);
scan.close();

//Steps to create an object from the Class
// Class Name    Object Name     Equal Sign    "new" Keyword        Constructor
   Scanner        scan1            =               new               Scanner(System.in);




	}

}
