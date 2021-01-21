package day12methodoverloading;

public class MethodCreation01 {

	public static void main(String[] args) {
		
		sayHello();
		add(30,4.0);
		mul(2.1,2.35,6.5);
		add(2,3,6);
		add(9,6.0);
		add(1,2);
		

	}
	
	//Create a method which adds 2 numbers
	//variables are called "parameters" inside the method
	//when you call a method, if you use some values
	//inside the method parenthesis, they are called " arguments"
	// Parameters and arguments should be in equal amount
	// You can use the same names for the methods by using the followings:
	// 1. change the number of parameters
	//2. change the data  type of the parameters
	//3. if the data types are different 
	//change the order of the parameters.
	// this concept is called Overloading
	/*if you create a methods whose name are the same
	 it is Called: "Method Overloading"
	 */
	
	
	
public static void add(double num1,double num2) {
	
	System.out.println(num1+num2);
	
}

public static void add(int num1,double num2) {
	
	System.out.println(num1+num2);
	
}
public static void add(double num1,int num2) {
	
	System.out.println(num1+num2);
	
}
public static void add(int num1,int num2) {
	
	System.out.println(num1+num2);
	
}


public static void add(double a1,double a2,double a3) {
	System.out.println(a1+a2+a3);
}




public static void mul(double n1,double n2,double n3) {
	
	System.out.println(n1*n2*n3);
}
	
	static void sayHello() {
		for(int i =0;i<=5;i++) {
			System.out.println("Hello World");
		}
	}
	
	static void sayHello2() {
		for(int i =0;i<=5;i++) {
			System.out.println("Hello World");
		}
	}
	

}
