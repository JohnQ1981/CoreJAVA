package javadevelopmentntDay01;

public class Generic01 {

	public static void main(String[] args) {


		//		ArrayList<String> list1 = new ArrayList<>();
		//		ArrayList<Integer> list2 = new ArrayList<>();
		//		ArrayList<Character> list3 = new ArrayList<>();


		/*

		  1)We have to type Explicit narrowing code
		  2) Java needs to do explicit narrowing operation all the time.
		  3)When you use Generic Concept, you will get CTE which is good,
		  because if you do not get RTE it is very hard to find the error,

		  to create a class that we can create object with different data types


		 */
		NonGeneric01 obj1 = new NonGeneric01("String object without using generic");

		System.out.println(obj1);

		String obj1Value = (String)obj1.getObj();

		System.out.println(obj1Value);//String object without using generic
		NonGeneric01 obj2 = new NonGeneric01(122);
		Integer obj2Value= (Integer)obj2.getObj();
		System.out.println(obj2Value);


		NonGeneric01 obj3 = new NonGeneric01('A');
		Character obj3Value = (Character) obj3.getObj();
		System.out.println(obj3Value);


		GenericNt01<String> obj4 = new GenericNt01<>("Ali Can");

		String obj4Value= obj4.getObj();
		System.out.println(obj4Value);


		GenericNt01<Integer> obj5 = new GenericNt01<>(123);
		Integer obj5Value = obj5.getObj();
		System.out.println(obj5Value);

		GenericNt01<Boolean> obj6 = new GenericNt01<>(true);
		Boolean obj6Value = obj6.getObj();
		System.out.println(obj6Value);


		GenericNt02<Float> obj7 =new GenericNt02<>(1.2f);
		Float obj7Value = obj7.getObj();
		System.out.println(obj7Value);
		GenericNt02<Double> obj8 =new GenericNt02<>(1.2);
		Double obj8Value = obj8.getObj();
		System.out.println(obj8Value);

		//GenericNt02<String> obj9 =new GenericNt02<>("Ali");//Restriction present in this class

		GenericNt02<Byte> obj9 = new GenericNt02<>((byte)122);
		Byte obj9Value = obj9.getObj();
		System.out.println(obj9Value);

		GenericNt02<Integer> obj10 = new GenericNt02<>(122);
		Integer obj10Value = obj10.getObj();
		System.out.println(obj10Value);




	}

}

class NonGeneric01{
	private Object obj;

	public NonGeneric01(Object obj) {

		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "NonGeneric01 [obj=" + obj + "]";
	}



}

// You can use GenericNt01 Class to create objects in every Data Type.
class GenericNt01<T>{
	private T obj;

	public GenericNt01(T obj) {

		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "GenericNt01 [obj=" + obj + "]";
	}



}


//Create a class which is able to create objects in every number data types
// but not in other data types.
class GenericNt02<T extends Number>{
	private T obj;

	public GenericNt02(T obj) {

		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "GenericNt02 [obj=" + obj + "]";
	}


}

