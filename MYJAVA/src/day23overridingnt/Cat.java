package day23overridingnt;

public class Cat extends Animal  {
	// Overriding changing implementation of a method in a Child Class
	//Name and parameter cannot be changed in Overriding. 
	// Name and parameter is method Signature. Method Signature cannot be changed.
	
public static void main(String[] args) {
	    
}
@Override
	 void sound() {
	//super.sound();
	System.out.println("Cats meow");
	}

		@Override
	protected void eat() {
	
	super.eat();
	System.out.println(super.age);
	System.out.println("Cats like milk");
	super.eat();
	
	
}
		@Override
	public int add() {
	
	
	return  1+2;
	
		}
		@Override
		public Integer mul() {
			
			return 2*3;
		}
		@Override
		public Cat create() {
			
			return new Cat();
		}

	
}
