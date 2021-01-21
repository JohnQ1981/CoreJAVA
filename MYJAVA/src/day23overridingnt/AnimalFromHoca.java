package day23overridingnt;

public class AnimalFromHoca {
	
	public int age = 23;
	String name = "Ali";

	void sound() {
		System.out.println("Animals make sound");
	}
	
	protected void eat() {
		System.out.println("Animals eat food");
	}
	
	public int add() {
		return 3+5;
	}
	
	public Integer multiply() {
		return 3*4;
	}
	
	public AnimalFromHoca create() {
		return new AnimalFromHoca();
	}
	
}