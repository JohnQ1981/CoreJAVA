package day29interface;

public interface Outside {

	
			/*
			 1) When we create a variable in an interface, we must initialize(assign a value)
			 2) Final variables are in bold,and variables in interface are final by default.
				All variables in an interface are final by default.
				a) In an 'interface' all variables have constant variables. 
				
			3) All variables in an interface are static.
			
			4) Access modifiers of All variables in interface are"public"
				Note: public final static int NUM = 12; is the same with :"int NUM=12;"
				Note: for names of final variables use uppercases for all characters.
				
			5) Until JAVA 8, it was impossible to create concrete methods in the interface,
				but in JAVA 8 , JAVA gave us an option to create concrete methods in an interface
				by using "default" or "static" keywords.
				Note: "default" keyword which we use to create a concrete method in an interface
				is not access modifier, it is keyword to create concrete method.
				
			 */
		int NUM=12;
		int PRICE =30000;
		
		
	 void tire();//public and abstract by default, in the interface. cannott be private or protected
	 
	
	public void hood();
	
	public void headlight();
	
	 void clean();
	
	 //void polish();
	 
	 public default void polish() {
		 System.out.println("Polish the Car");
	 }
	 
	static void sunroof() {
		 System.out.println("it has sunroof");
	 }
	//public static void main(String[] arg) {
		//num = num +2; //The final field Outside.num cannot be assigned
	//}
	
}
