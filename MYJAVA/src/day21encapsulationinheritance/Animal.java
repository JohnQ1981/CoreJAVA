package day21encapsulationinheritance;

/*
 * 1)if you create parent(super) child(sub) relationship between the classes
 * child Class/ Sub Class can use every class member whose access modifier
 * public or protected
 * 
 * "private"class members cannot be used from other classes even though they are child classes.
 * 
 * default/package private class members can be used from the inside the package
 * that is why , if the child class is in the same package with the default class member
 * they can be used.
 * 
 * 2)To Create Parent child Relationship we use" extends" keyword
 * 
 * 3) Parent Class Cannot use the classmembers from child class.
 * 
 * // benefits of parent child relationship
//reusabilit
//maintenance
// less coding
 * PARENT-CHILD RELATIONSHIP(INHERITANCE)
 * 4)Advantages of Inheritance
 * 	a) Reusability: we put common features into parent class
 * then all child classes will be able to use those.
 * 	example: move method for animals.
 * 
 * 	b)Less Coding: if you do not put common feature into parent class,
 * 					you should put it into every child class one by one.
 * 					it needs to be typed the same code again and again.
 * 	c) Maintain: if you need to update something, it will be easy that is why, when you update
 * the method in parent class the method will be updated for all childs
 * classes.
 * 	
 * 5)in Java ,  a child cannot have multiple Parent, JAVA DOES NOT ALLOW MULTIPLE INHERITANCE
 * because multiple inheritance creates problem when the parent classes have the same named methods
 * 
 * 6) if you have methods with the same name in parents classes,
 * child class will use the closes one.
 * 
 * 7) if a parent class has multiple child classes,
 * that kind of inheritance is called " Hierarchical Inheritance"
 * 8) if there is child - parent - grandparent
 * b) If there is child-parent-granparent-..., it is called "Multilevel Inheritance"  
 * 
 */





public class Animal  {
		
		public Animal () {
			System.out.println("Animal Constructor");
		}
	public static void main(String[] args) {
		
	}

	public  void move() {
		
		System.out.println("They can move");
	}
	
	
	public void eat() {
		System.out.println("They eat food");
	}
	
	public void drink() {
		System.out.println("They drink water");
	}
	
	
}
