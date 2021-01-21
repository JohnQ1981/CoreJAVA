package day28abstractionnt;

public class Runner {

	public static void main(String[] args) {
		// by using abstract classes we cannot create object. 
		// since classes are templates, if class is abstract then we cannot create object from abstract
		//Honda obj = new Honda();
		
		Civic c1 = new Civic();
		
		c1.engine();
		c1.leather();//in Civic Class we do not have leather method
					// it is coming from parent Honda Class.
		//Tire t1 = new Tire();// we cannot create object from abstract class
		
		Accord c2 = new Accord();
		c2.engine();
		c2.leather();
		// search: if i cannot create object from abstract classes, what do you think
		//does an abstract class have constructor or not. 
		
	}

}
