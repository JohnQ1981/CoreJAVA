package day21encapsulationinheritance;

public class Encapsulation01 {
	/*
	 1) we use Encapsulation to hid data and method implementations.
	 	a) user should access to hidden data or hidden methods, but should not see details
	 // b)using encapsulated data must be easy
	  * c) when one part is broken , it should not break other parts.
	  * data or method in Encapsulation should be independent
	  * 
	  *2) Encapsulated codes should have the following characteristics:
	  *    a) Everyone should know how to access
	  *    b)Should be easy to use regardless complex codes
	  *    c)There should not be any side effects of the code
	  *    to the rest of the application
	  *    
 		3)//how to make Encapsulation
 		 * a) make the Access modifier "private"
 		 * b) create "getter" and "setter" methods
 		 * "getter" method is used to read encapsulated data
 		 * "setter" method is  used to update encapsulated data
 		 * 
 		 * 
 		 *4) Advantages of Encapsulation
 		 *	a) it gives us Flexibility, we can update Encapsulated data by using setter method
 		 *	b) Reusability-- we can create and use getter and setter methods from every class
 		 *	c) Maintainability, by using setter methods we can update the value whenever we want
 		 *	
 		 *5) After creating Private variables if you do not
 		 *create any setter method, it means nothing will be updated
 		 *in the class, that is why Class is called "Immutable Class" in other words " no SetterMethods"
 		 *
 		 *
 		 *
 		 * 
	 */
	
	private String collegeName = "FIU";
	private int age = 23;
	private boolean old = false;
	
	public static void main(String[] args) {


	}
	//how to create getter method
//	 public String getCollegeName() {
//		 
//		 return collegeName;
//	 }
//	
//	 //how to create setter method
//	 public void setCollegeName(String collegeName) {
//		 
//		 this.collegeName= collegeName;
//		 
//	 }

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//for booleans getter method's name starts with: "is"
	public boolean isOld() {
		return old;
	}

	public void setOld(boolean old) {
		this.old = old;
	}

}
