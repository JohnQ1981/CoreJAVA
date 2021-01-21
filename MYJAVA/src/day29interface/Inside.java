package day29interface;

			/*
			 1)by USING " interface" we can use multiple inheritacne in JAVA,
			 2) "interface" is not a class, interface is an interface.
			 3) Abstract classes may have abstract and concrete methods, but "interface"s
			 may have just abstract methods. 
			 4)For interfaces all methods are "abstract" by default. that is why
			 no need to use "abstract" keyword for methods in an interface.
			  public abstract void seat(); same with public  void seat();
			  INSIDE THE INTERFACE YOU CANNOT CREATE CONCRETE METHODS. 
			  5) for interfaces JUST PUBLIC IS POSSIBLE AS ACCESS MODIFIERS.
			  when you work in a class, if you remove access modifier it will be default but when
			  you work in an interface access modfiers of all methods
			  will be public all the tiime by dfault.
			  regardless you type access modifer or not.
			  public abstract void seat(); is the same with : void seat();
			   in Concrete Class All abstract methods should be overridden regardless.
			   
			   6) For concrete and abstract Classes we use "extends" keyword but for "interface"s we
			   use "implements" keyword, Both "extends" and "implements" can be used at the same time
			   for a class to achieve multiple inheritance. 
			   7) all methods in an interface must be "abstract", that is why "interface"s are called
			   "FULLY ABSTRACTION". "abstract" Classes are called Partial Abstraction.
			   8) When we have abstraction we cannot create objects, because of that
			   we cannot CREATE OBJECT BY USING NTERFACES. NO OBJECT CREATION FOR INTERFACES.
			   9. if you want to extend from interface to interface use "extend" keyword.
			   Class===> Interface   use "implements"
			   Class ===> Class  use 'extends"
			   Interface===> Interface  use "extends"
			   Interface ===> Class !!!!  A Class cannot be parent for an interface. !!!
			  10) If a Concrete Class has two interface parents , when you create the methods
			  with the same method signatures in parent interfaces, do not use different return types
			  otherwise Java cannot decide which one to override and starts to complain.  
			  
			 */
public interface Inside {
		
	int PRICE = 20000;
	
	public abstract void seat();//public void seat();
	
	public abstract void steeringWheel();
	
	public abstract void radio();
	                
	void clean();
	                
	
	//public void add();// regardless of keyword all methods inside the interface it will be abstract
	
	
}
