package day12methodcreationconstructorsnt;

public class InstanceAndLocalVariablesFromhoca {
	
	/*
	 1)If you create a varibale outside of the main method, it is called "instance variable"
	 
	      a)If you do not initialize(assigning value) an instance variable, Java will assign them default values.
	           For byte, short, int, long, default value is 0
	           For char, default value is 0
	           For boolean, default value is "false"
	           For float and double, default value is 0.0
	           For String, default value is null
	           
	      b)Instance variables can be used in entire class      
	     
	 2)If you create a variable inside a method, it is called "local variable"
	 
	     a)Do not forget to initialize local variables.
	 */
	  static int i;
	  static boolean b;
	  static double d;
	

	public static void main(String[] args) {
		int k = 7;
		
		System.out.println(i + " - " + b + " - " + d);

	}
	
	public static void add(int n1, int n2) {
		
		int m = 11;
		
		i++;
	
	}

}