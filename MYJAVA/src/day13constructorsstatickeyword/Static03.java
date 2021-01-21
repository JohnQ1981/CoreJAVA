package day13constructorsstatickeyword;

public class Static03 {
	/*
	 Create a program which counts the number of objects you created
   Static variables keep the changes, instance variables every time start from the default value
	 */
	static int counter = 0; // static variable  , 
	int age = 0;

	public Static03() {
		counter++;
		age++;
	}

	public static void main(String[] args) {

		Static03 obj1 = new Static03();
		Static03 obj2 = new Static03();
		Static03 obj3 = new Static03();

		System.out.println("The Number of Objects: "+ counter);
		System.out.println(obj1.counter);
		System.out.println(obj2.counter);
		System.out.println(obj3.counter);

		//System.out.println("The Number of Objects: "+ age);
		System.out.println(obj1.age);
		System.out.println(obj2.age);
		System.out.println(obj3.age);

	}

}
