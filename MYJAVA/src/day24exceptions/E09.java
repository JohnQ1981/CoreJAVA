package day24exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E09 {
			/*
			 	Difference between throws and throw
			 	1) "throws" keyword is used after the method paranthesis before the "{"
				"throw" keyword is used in method body
				2)Buy using "throw" keyword you can throw just one exception
				but by using "throws" keyword you can throw multiple Exceptions by putting
				comma between them
				3) "throw" keyword is used to throw Exception explicitly wherever we want
				  but "throws" keyword is used just once in the method signature line.
				 4)After "throw" keyword we have to create an Exception Class Object
				 that is why we have to use "new" keyword and constructor
				 but after "throws" keyword we use just the name of the Exception class
				 
			 */
	public static void main(String[] args) throws ArithmeticException, IOException {


		FileInputStream fis = new FileInputStream("src/day24exceptions/TextFile");
			fis.close();
		int age =12;
			if(age<0) {
				throw new IllegalArgumentException();
			}else {
				System.out.println(age);
			}
	}

}
