package day29interface;

public class Honda extends Car implements Inside, Outside, Cosmetic   {

	@Override
	public void move() {
		System.out.println("It moves okay");
		
	}

	@Override
	public void gas() {
		
		System.out.println("It uses gas economically.");
		
	}

	@Override
	public void tire() {

		System.out.println("Honda will use new tires");
		
	}

	@Override
	public void hood() {
		System.out.println("Stainless Still");
		
	}

	@Override
	public void headlight() {
		System.out.println("LED Headlight");
		
	}

	@Override
	public void seat() {
		System.out.println("Orthopedic");
		
	}

	@Override
	public void steeringWheel() {
		System.out.println("Leather Streering Wheel");
		
	}

	@Override
	public void radio() {
		System.out.println("Digital: Boss Sound system");
		
	}

	@Override
	public void color() {
		System.out.println("Red");
		
	}

	@Override
	public void windowtint() {
		System.out.println("35% Dark");
		
	}

	@Override
	public void clean() {
		
		System.out.println("Keep it Clean!");
		
	}

//	@Override
//	public void polish() {
//		System.out.println("Hello polish from Honda");
//	}

	

	
	
	
}
