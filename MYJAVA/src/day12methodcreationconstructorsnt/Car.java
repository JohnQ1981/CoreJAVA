package day12methodcreationconstructorsnt;

public class Car { ///CLASS

	int price;
	String make;
	String model;
	int mileage;
	int year;
	boolean isGas;
	
	public Car(int price,String make, String model, int year) {///CONSTRUCTOR
		this.price =price;
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public Car(int price,String make,String model,int year,int mileage, boolean isGas) {
		this.price=price;
		this.make=make;
		this.model=model;
		this.year=year;
		this.mileage=mileage;
		this.isGas=isGas;
		
	}
	
	
	public static void main(String[] args) {

        Car car1 = new Car(2000,"Honda","Civic",2017); ///OBJECT
        System.out.println(car1.price);
        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println("==================");
        
        Car car2 = new Car(5000,"Audi","A6",2019);
        System.out.println(car1.price);
        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);

        System.out.println("==================");
        Car car3 = new Car (16000, "Infiniti","QX60",2015,55000,true);
        System.out.println(car3.price);
        System.out.println(car3.make);
        System.out.println(car3.model);
        System.out.println(car3.year);
        System.out.println(car3.mileage);
        System.out.println(car3.isGas);
        
	}
	
	//Create a constructor which uses all variables,
	//then create an object and print the features of the object
		//on the console
	
	
	
	
	
	
	
	
	

}
