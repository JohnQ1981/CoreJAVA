package day23overridingnt;

	public class Animal {
		public int age = 23;
	public static void main(String[] args) {
		
	
	}

	 void sound() {
	System.out.println("Make sounds");
	}

	protected void eat() {
	System.out.println("Animals eat food");
	}
	
	public int add() {
		
		return 3+5;
	}
	
	public Integer mul() {
		return 3*4;
	}
	
	public Animal create() {
		return new Animal();
	}
	
	
	
}
	
