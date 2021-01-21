package oc21practice;

public class Toyota extends Car {
	
	public void toyota() {
		System.out.println("Toyota is Cool");
	}
	
	public Toyota () {
		super();
		//this();// did not work because no any constructor
		super.carsId=1990;
		this.tires="it is in the Car Class";
		
	}
	
	
}
