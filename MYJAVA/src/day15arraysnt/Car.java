package day15arraysnt;

public class Car{

	
	 int year;
	 String model;





	public Car(int year,String model) {
		this.year = year;
		this.model = model;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car(2020, "Honda");
		Car car2 = new Car(1999, "Toyota");
		System.out.println(car1.year);
		System.out.println(car2.model);

	}
	
	
	

}
