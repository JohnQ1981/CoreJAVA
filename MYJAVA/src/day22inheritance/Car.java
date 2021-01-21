package day22inheritance;

public class Car extends Vehicle {
	/*
	 When you create a constructor with parameter, 
	 Java will remove the default Constructor from parent class.
	 
	 When you create a constructor in Child Class,
	 it will look for the Default Constructor
	 from Parent Class automaticaly.
	 But it is removed, that is why Java complains,
	 to Stop complaining you must call
	 the existing constructor in the parent Constructor
	 by using super keyword.
	 
	 HW: Exlain: super() and this()
	 			super and this
	 			super() and super
	 			this() and this
	 
	 
	 */
	
	public int price = 10;
	public String make = "Toyota";
	
	public Car() {
		super(5);
		
		System.out.println("Car no -parameter");
		
	}
	
	public Car(String make) {
		super(7);
		System.out.println(this.price);//10
		System.out.println(super.price);//20
		System.out.println("Car with parameter");
	}
	
	
//	public static void main (String[] args) {
//		
//		Car objc=new Car();
//		System.out.println(price);
//		
//	}
	
}
