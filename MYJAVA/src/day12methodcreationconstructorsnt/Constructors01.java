package day12methodcreationconstructorsnt;

import java.util.Scanner;

public class Constructors01 {

	/*
	 1) When you create a class, Java creates a default constructor for the class
	 Default constructor is invisible inside the class
	 
	 2.)Class name and Constructor should match
	 
	 3.) When you create a constructor , Java cancels the Default one
	 4.) constructor is not a method because it has no return type.
	 Constructor is Constructor 
	 what is the difference between "method and Constructor?"
	    a) Constructors do not have the return type but methods have.
	    b) Constructors' name must be the same with the class name but methods
	    can use different names
	 
	 
	 
	 When do we need to create a Constructor?
	 think about a bill Template 
	 1 Template and create many 100 dollars 
   */
	
	
	public Constructors01() {
		System.out.println("Constructor without parameter");
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		//Class name     Object name          new keyword       Constructor
		Scanner             scan        =        new              Scanner(System.in);
		
		Constructors01       obj         =        new             Constructors01();

	}

}
