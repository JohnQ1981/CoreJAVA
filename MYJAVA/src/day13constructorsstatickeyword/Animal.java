package day13constructorsstatickeyword;

public class Animal {

	int age;   // instance variable 
	String name;
	int weight;
	boolean isCarnivorous;

	public Animal() {
		this("Cat", 25);//Constructor call must be the first statement in a constructor
		this.age = 5;
		System.out.println("Age from the Constructor without parameter: "+age);

	}

	public Animal(String name, int weight) {
		this(true);
		this.name = name;
		this.weight=weight;

		System.out.println("Name and Weight from constructor with two parameters: "+ name+"-"+ weight);

	}

	public Animal(boolean isCarnivorous) {

		this.isCarnivorous=isCarnivorous;
		System.out.println("Is  the Animal Carnivorous: "+ isCarnivorous);
	}

	public static void main(String[] args) {

		Animal a1 = new Animal();
		//Animal a2 = new Animal("Dog",30);




	}

}
