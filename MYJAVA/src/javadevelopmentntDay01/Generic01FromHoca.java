package javadevelopmentntDay01;

/*
 	1)We have to type explicit narrowing code
 	2)Java needs to do explicit narrowing operation every time
 	3)When you use Generic Concept, you will get CTE which is good. 
 	  Because, if you do not get CTE it means you will get Run Time Error.
 	  After getting Run Time Error it is very difficult to find the error.
 */

public class Generic01FromHoca {

	public static void main(String[] args) {

		NonGenericNt01 obj1 = new NonGenericNt01("String object without using generic");
		String obj1Value = (String)obj1.getObj();
		System.out.println(obj1Value);//String object without using generic

		NonGenericNt01 obj2 = new NonGenericNt01(122);
		Integer obj2Value = (Integer)obj2.getObj();
		System.out.println(obj2Value);

		NonGenericNt01 obj3 = new NonGenericNt01('A');
		Character obj3Value = (Character)obj3.getObj();
		System.out.println(obj3Value);

		GenericpNt1<String> obj4 = new GenericpNt1<>("Ali Can");
		String obj4Value = obj4.getObj();
		System.out.println(obj4Value);

		GenericpNt1<Integer> obj5 = new GenericpNt1<>(122);
		Integer obj5Value = obj5.getObj();
		System.out.println(obj5Value);

		GenericpNt1<Boolean> obj6 = new GenericpNt1<>(true);
		Boolean obj6Value = obj6.getObj();
		System.out.println(obj6Value);

		GenericNt2<Float> obj7 = new GenericNt2<>(1.2F);
		Float obj7Value = obj7.getObj();
		System.out.println(obj7Value);

		GenericNt2<Double> obj8 = new GenericNt2<>(1.45);
		Double obj8Value = obj8.getObj();
		System.out.println(obj8Value);

		GenericNt2<Integer> obj9 = new GenericNt2<>(12);
		Integer obj9Value = obj9.getObj();
		System.out.println(obj9Value);
	}

}

class NonGenericNt01{

	private Object obj;

	public NonGenericNt01(Object obj) {
		this.obj = obj;
	}
	public Object getObj() {
		return obj;
	}
	@Override
	public String toString() {
		return "NonGenericNt01 [obj=" + obj + "]";
	}

}
//You can use GenericNt01<T> class to create objects in every data type
class GenericpNt1<T>{

	private T obj;

	public GenericpNt1(T obj) {
		this.obj = obj;
	}
	public T getObj() {
		return obj;
	}
	@Override
	public String toString() {
		return "GenericpNt1 [obj=" + obj + "]";
	}

}

//Create a class which is able to create objects in every number data types 
//but not in other data types
class GenericNt2<T extends Number>{

	private T obj;

	public GenericNt2(T obj) {
		this.obj = obj;
	}
	public T getObj() {
		return obj;
	}
	@Override
	public String toString() {
		return "GenericNt2 [obj=" + obj + "]";
	}
}