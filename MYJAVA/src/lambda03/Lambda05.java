package lambda03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda05 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Alo");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Jackson");
		list.add("Jackson");
		list.add("Tucker");
		list.add("Christ");
		toUpp1(list);
		System.out.println();
		toUpp2(list);
		toUpp3(list);
		System.out.println();
		remGr5(list);
		System.out.println();
		remAN(list);
		System.out.println();
		sorWL(list);
		System.out.println("=====");
		sortLC(list);
		System.out.println("=====");
		sortLengthInitial(list);


	}

	//creat a method to print all list elements in uppder case
	public static void toUpp1(List<String> list) {
		list.stream().map(t->t.toUpperCase()).forEach(System.out::println);
	}
	public static void toUpp2(List<String> list) {
		list.stream().map(String::toUpperCase).forEach(System.out::println);
	}
	public static void toUpp3(List<String> list) {
		list.replaceAll(t->t.toUpperCase());
		System.out.println(list);
	}
	//remove the element if the length of the element is greater than 5
	public static void remGr5(List<String> list) {
		list.removeIf(t->t.length()>10);
		System.out.println(list);
	}
	//remove the elements if the element starting with A and N
	public static void remAN(List<String> list) {
		list.removeIf(t->t.startsWith("A")&& t.endsWith("N"));
		System.out.println(list);
	}
	//create a method to print element after 
	//ordering according to their length
	public static void sorWL(List<String> list) {
		list.stream().sorted(Comparator.comparing(t->t.length())).forEach(System.out::println);
	}
	//create a method to sort the distinct elements by using their last characters
	public static void sortLC(List<String>list) {
		list.stream().distinct().sorted(Comparator.comparing(t->t.toString().
				charAt(t.toString().length()-1))).forEach(System.out:: println);
	}

	public static void distinctSortedLastChar(List<String> list){
		list.stream().distinct().sorted(Comparator.comparing(t->t.substring(t.length()-1))).forEach(System.out::println);
	}
	//create a method to sort the elements according to their 
	//lengths and according to their first character
	public static void sortLengthInitial(List<String> list){
		list.
		stream().
		sorted(Comparator.
				comparing(t->t.toString().length()).
				thenComparing(t->t.toString().substring(0,1))).
		forEach(System.out::println);
	}



}
