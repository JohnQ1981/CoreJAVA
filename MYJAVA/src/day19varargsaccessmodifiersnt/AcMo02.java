package day19varargsaccessmodifiersnt;

import day18passbyvaluepassbyreferencedatetime.AcMo03;

public class AcMo02 extends AcMo03  {
	
	 
	public static void main(String[] args) {
		/*
		 * 
		 * 1) In AcMo01, I created private, 
		 * protected, default, 
		 * and public instance variables.
		  In AcMo02, I created an object 
		  to access them but I could not 
		  access to the private one.
		  So private class members cannot 
		  be accessed from other classes.
		 * 
		 * 2) From different packages you cannot access
		 * to default class members,
		 * for example:  if you create a default variable
		 * in package A, you can access to the variable
		 * from all classes in the package A, but you cannot
		 * access to the variable from other packages.
		 * 
		 * 
		 * 3) in java there is parent child relationship,
		 *   from different packages you have two options
		 *   to access " protected" ones, if you are in "child"
		 *   class you can access to the protected ones.
		 *   if you are not in a child class
		 *   you cannot access to the protected ones.
		 *   
		 *   4) Public class members can be accessed
		 *   from everywhere , no any restriction
		 *   for public class members
		 * 	Note: for classes Private  and protected
		 * access modifiers cannot be used
		 * you can use just public or default for 
		 * access modifiers.
		 * 
		 * 
		 */
		AcMo01 obj1 = new AcMo01();

		System.out.println(obj1.defaultAge);
		System.out.println(obj1.protectedAge);
		System.out.println(obj1.publicAge);
		AcMo03 obj2 = new AcMo03();
		//below obj2 is bringing from other package
		System.out.println(obj2.publicName);
		System.out.println(obj2.protectedName);
		
		
	}

}
