package day12methodoverloading;

public class MethodCreation01FromHoca {
	
	/* To call a method from inside the main method a)Type the name of the method 
	                                                b)Put the values inside the method paranthesis*/		
	/* In a static method non-static things cannot be used */
	/* When you create a method, if you create variables inside the method parenthesis, they are
	   called "parameters" */
	/* When you call a method, if you use some values inside the method parenthesis, they are called
	   "arguments" */
	/* Java looks at the method names first to select the method to use, if the names are same
	   Java looks at the parameters and makes the selection according to the parameters.*/
	
	/*
	 You can use same names for the methods by using the followings;
	 1)Change the number of parameters
	 2)Change the data type of the parameters
	 3)If the data types are different, change the order of parameters
	*/
	
	/*
	 Overloading: If you create methods whose names are same, it is called "Method Overloading"
	 */

	public static void main(String[] args) {
		
		add(13.0,4.0);//17.0
		
		add(2, 3, 4);//9.0
		
		multiply(4, 3, 0.5);//6.0

	}
	
	//Create a method which adds 2 numbers
	public static void add(double n1, double n2) {
		System.out.println(n1 + n2);
	}
	
	public static void add(int n1, double n2) {
		System.out.println(n1 + n2);
	}
	
	public static void add(double n2, int n1) {
		System.out.println(n1 + n2);
	}
	
	//Create a method which adds 3 numbers
	public static void add(double n1, double n2, double n3) {
		System.out.println(n1 + n2 + n3);
	}
	
	//Create a method which multiplies 3 numbers, call the method from main method.
	public static void multiply(double n1, double n2, double n3) {
		System.out.println(n1*n2*n3);
	}

}