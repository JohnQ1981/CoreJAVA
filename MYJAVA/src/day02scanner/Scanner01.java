package day02scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		/*
		 In Every Application we need to communicate with the end user
		 Example: first name last name etc...
		 Java has many libraries and libraries does contain classes.
		 all classes does a job. Wrapper is for primitive datas
		 Scanner Class is to create interaction between user and application
		  First we have to import Scanner Class from library in order to use it
		 */
		//1.1 st.Step
		Scanner scan = new Scanner(System.in);
		
		//2nd Step - ask input from User? give directions to the user
		System.out.println("Enter your age");
		
		//3rd Step - assign the input from user to a variable
		int age = scan.nextInt();
		
		System.out.println("Your Age is " +age);
		
		scan.close();
		
		
		
		

	}

}
