package day13constructorsstatickeyword;

public class Static01 {
      /*
      1)if you use static keyword for an instance variable, then it is called "class variable"
      
      below is "age" is instance(object) variable   and "height" is class variable
      
      2) You can access "static" things by using just class name
      but to access "instance" things you have create object
         note: if you want you can access Static ones by using objects as well but
         it is not recommended
       3) Static Variables are common for All Objects. 
       Static variables are like a moon in the Sky, when it is changed , it is changed for all.

       */
      
	int age = 23;// instance Variable
	static int height = 6;// Class Variable 
	
	
	
	
	public static void main(String[] args) {

		
		Static01 s = new Static01();// object is created
		System.out.println(s.age); //accessing the instance variable 
		
		System.out.println(Static01.height);
		System.out.println(height);
		
		System.out.println(s.height);// no need to use object to access static variable
		

	}
	 public static void add(int n1, int n2) {
		 System.out.println(n1+n2);
	 }
	
	 public void subtract(int n1 , int n2) {
		 System.out.println(n1-n2);
		 
	 }
	
	

}
