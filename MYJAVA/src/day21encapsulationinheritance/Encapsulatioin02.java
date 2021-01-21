package day21encapsulationinheritance;

public class Encapsulatioin02 {

	public static void main(String[] args) {

		Encapsulation01 obj1 = new Encapsulation01();

		obj1.getCollegeName();
		System.out.println(obj1.getCollegeName());//FIU



		obj1.setCollegeName("Bogazici");
		System.out.println(obj1.getCollegeName());

		Students obj2 = new Students();
		//obj2.setName("Alisher");

		System.out.println(obj2.getaddress());
		System.out.println(obj2.getName());
		System.out.println(obj2.getSsn());
		//System.out.println(obj2.setCollegeName("Bogazici"));
		// create a new student whose address is :"Piscataway, New Jersey,
		// and name is : "Ayse Tan"
		// and ssn is 987654321

		obj2.setAddress("Piscataway, New Jersey");
		System.out.println(obj2.getaddress());

		obj2.setName("Ayse Tan");
		System.out.println(obj2.getName());

		obj2.setSsn("987654321");
		System.out.println(obj2.getSsn());






	}

}
