package day21encapsulationinheritance;

public class Runner {

	public static void main(String[] args) {

		Mammal m1 = new Mammal(5);
		m1.feedBaby();
		m1.giveBirth();
		m1.drink();
		m1.eat();
		m1.move();
		System.out.println("===========");
		
		Cat c1 = new Cat();
		c1.drink();
		c1.eat();
		c1.feedBaby();
		c1.giveBirth();
		c1.meow();
		c1.move();
		System.out.println("===========");
		
		Dog d1 = new Dog();
		d1.drink();
		d1.eat();
		d1.feedBaby();
		d1.giveBirth();
		d1.bark();
		d1.move();
		d1.smellWell();
		System.out.println("============");
		
		Fish f1 = new Fish();
		f1.drink();
		f1.eat();
		f1.liveUnderWater();
		f1.move();
	}

}
