package oc21practice;

public class Corolla extends Toyota {

	public void toyota() {
		System.out.println("Toyota is in corolla");
	}
	
	public static void main(String[] args) {
		
		
		Toyota obj = new Toyota();
		Corolla obj2 = new Corolla();
		Car obj3 = new Car();
		System.out.println(obj2.carsId);
		System.out.println(obj2.feature);
		System.out.println(obj2.tires);
		obj.toyota();
		obj2.toyota();
		
	}
	
}
