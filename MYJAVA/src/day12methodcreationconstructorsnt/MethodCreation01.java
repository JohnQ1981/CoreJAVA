package day12methodcreationconstructorsnt;

public class MethodCreation01 {

	public static void main(String[] args) {
		/*
		

		 */
		add(3.0,5);
		System.out.println(add(3,5));//8
		

	}
	// create a method
	
	public static void add(double n1,double n2) {
		
		System.out.println(n1+n2);
		
		
	}
	// when you use return type different than void
	// you have to use  ' return' keyword at the 
	//very end.  
	// return type of a method can be all primitive data types
	// and non-primitive data types
	public static int add(int n1, int n2) {
		return  n1+n2;
	}
	
	
	
	
}
