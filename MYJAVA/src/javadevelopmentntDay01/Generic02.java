package javadevelopmentntDay01;




/*
 		Type Parameters have naming convention, it is commonly used , do not try 
 		to use different naming convention. 
 		T--> stands for Type.
 		E--> Element
 		K--> Key
 		V--> Value
 		N--> Number

 * */
public class Generic02 {

	public static void main(String[] args) {

		GenericNt012<String, Integer> obj1 = new GenericNt012<>("Ali", 33);

		obj1.display(true, 'C');
		obj1.display(12, "AliBaba");

		obj1.display('X', 122);

		obj1.display1("Hello");
		obj1.display1(12);
		obj1.display1(12.34f);
		obj1.display1('C');


	}

}

class GenericNt012<K , V>{
	private K key;
	private V value;
	public GenericNt012(K key, V value) {

		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "GenericNt012 [key=" + key + ", value=" + value + "]";
	}
	// Generic concept on a method. Generic Concept is to make flexible
	//public <E,N extends Number & Set> restriction(type bounded) for second parameter
	//First parameter should be class/abstract class
	//if you use interface, you can us multiple interfaces. 
	//if you use interfaces together with a class, class should be first interfaces should 
	//be after the class

	//After "N extends" you can use just one class/abstract class and it should be the first
	//If you use "interface" you can use multiple interfaces.
	//If you use interfaces together with a class, class should be first interfaces should be after
	//the class.

	public <E,N>void display(E element, N number){
		System.out.println("Element: " + element+ " Number: "+ number);

	}

	public <E>void display1(E element){
		System.out.println("Element: " + element);

	}


}

