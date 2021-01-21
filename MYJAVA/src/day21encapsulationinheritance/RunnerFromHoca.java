package day21encapsulationinheritance;

public class RunnerFromHoca {
	
	/*
	 1)Object Class is the parent class of all classes in Java (like Adem)
	 2)In  Java just Object Class does not have a parent class
	 3)Common features of all classes in Java are stored in Object Class
	 */

	public static void main(String[] args) {
	
		Mammal m1 = new Mammal();
		m1.feedBaby();
		m1.giveBirth();
		m1.drink();
		m1.eat();
		m1.move();
		
		System.out.println("==========");
		
		Cat c1 = new Cat();
		c1.meow();
		c1.feedBaby();
		c1.giveBirth();
		c1.drink();
		c1.eat();
		c1.move();
		
		System.out.println("==========");
		
		Dog d1 = new Dog();
		d1.smellWell();
		d1.bark();
		d1.feedBaby();
		d1.giveBirth();
		d1.drink();
		d1.eat();
		d1.move();
		
		System.out.println("==========");
		
		Fish f1 = new Fish();
		f1.liveUnderWater();
		f1.drink();
		f1.eat();
		f1.move();

	}
}