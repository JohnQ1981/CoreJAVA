package day12methodcreationconstructorsnt;


public class Constructor01FromHoca {
	
	/*
	 1)When you create a class, Java creates a default constructor for the class.
	   Default constructor is invisible inside the class
	   
	 2)Constructor's name must be same with the class name
	 
	 3)When you create a constructor, Java cancels the default one
	 
	 4)Constructor is not a method because it has no return type. Constructor is a constructor
	   What is the difference betwen "method" and "constructor"?
	   a)Constructors do not have return type but methods have.
	   b)Constructors' name must be same with the class name but method can use different names
	*/

	public Constructor01FromHoca() {
		System.out.println("Constructor without parameter");
	}
	
	public static void main(String[] args) {
		
		//Class name      Object name      new keyword         Constructor
		Constructor01FromHoca       obj       =      new            Constructor01FromHoca();

	}

}