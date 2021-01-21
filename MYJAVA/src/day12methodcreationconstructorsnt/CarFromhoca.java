package day12methodcreationconstructorsnt;

public class CarFromhoca {
	
	int price;
	String make;
	String model;
	int mileage;
	int year;
	boolean isGas;
	
	public CarFromhoca(int price, String make, String model, int year) {	
		this.price = price;
		this.make = make;
		this.model = model;
		this.year = year;	
	}
	
	//Create a constructor which uses all variables, then create an object and print the features of the object
	//on the console
	public CarFromhoca(int price,String make,String model,int year,int mileage, boolean isGas) {
		this.price=price;
		this.make=make;
		this.model=model;
		this.year=year;
		this.mileage=mileage;
		this.isGas=isGas;	
	}

	public static void main(String[] args) {
		
		CarFromhoca car1 = new CarFromhoca(20000, "Honda", "Civic", 2017);
		System.out.println(car1.price);
		System.out.println(car1.make);
		System.out.println(car1.model);
		System.out.println(car1.year);
		
		System.out.println("============");
		
		CarFromhoca car2 = new CarFromhoca(50000, "Audi", "R8", 2019);
		System.out.println(car2.price);
		System.out.println(car2.make);
		System.out.println(car2.model);
		System.out.println(car2.year);
		
		System.out.println("============");
		
		CarFromhoca car3 = new CarFromhoca(40000, "Mercedes", "GLC", 0, 2020, true);
		System.out.println(car3.price);
		System.out.println(car3.make);
		System.out.println(car3.model);
		System.out.println(car3.mileage);
		System.out.println(car3.year);
		System.out.println(car3.isGas);

	}

}