package day12methodcreationconstructorsnt;
//import java.util.Scanner;
public class InstanceAndLocalVariables {

	 /*
    //1.if you create a variable outside of the main method
     * it is called "instance variable"
     * a) if you do not initialize (assigning value) an instance variable,
     * Java will assign them default values
     * for byte, short, int , long and default value is 0
     * for char default value is 0 as well
     * for boolean default value is false
     * for double and float default value is 0.0
     * Instance Variables can be used in Entire Class
     * but local variable can be used inside that particular method it is in
     * 
     * 
     * for String default value is "null", object empty object
     * 2. if you create a variable inside the method it is
     * called " local variable" only accessible inside that particular method
     * B) DO NOT FORGET TO INITIALIZE VARIABLES.
     * if you try to use before initializing Java will complain
     * 
     * 
     * 
     * 
    */
	// this part is above main method
	static int j; //  instance variable- not initialized 
	static // so Java will assign default value
	boolean b; // default is false ==> assigned by Java
	static double d;
	static String r;
	public static void main(String[] args) {
       //int k = 7; // local variable 
       System.out.println(i+"-\n"+j+"-\n"+d+"-\n"+b+"-\n"+ r);
		
	}

	static // this part is below main method
	
	int i;// instance variable
	
	public static void add(int a, int b) {
		//int m =11; // local variable
		
		
	}
	
	public static double area(double pi) {
		
		
		return pi = 3.1477777789;
		
	}
	
	// CONSTRUCTOR MEANS OBJECT BUILDER
	//we need template and object builder
	
	
	
}
