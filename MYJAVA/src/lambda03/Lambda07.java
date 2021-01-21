package lambda03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lambda07 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Mariano");
		list.add("Alberto");
		list.add("Tucker");
		list.add("Christ");
		sqG(list);
		System.out.println();
		lessT8(list);
		iniNotX(list);
		endR(list);
		getFirstAfterSort(list);
		getLast(list);
	}

	//create a method which takes the square of the length of every element in
	// in the list, prints distincly in reverse order if square is greater than 20
	public static void sqG(List<String> list) {

		list.
		stream().
		map(t-> t.length()*t.length()).filter(t->t>20).
		distinct().sorted(Comparator.reverseOrder()).
		forEach(System.out::println);

	}
	//create a method to check if the lengths of all elements are less than
	//8
	public static void lessT8(List<String> list) {
		boolean result =list.stream().allMatch(t->t.length()<8);
		System.out.println(result);
	}
	//create a method to check if the initials of any elements are not X
	public static void iniNotX(List<String> list) {
		boolean result=list.stream().noneMatch(t->t.startsWith("X"));
		System.out.println(result);
	}
	//create a method to check if at least of the elements ending with R
	public static void endR(List<String> list) {
		boolean result = list.stream().anyMatch(t->t.endsWith("x"));
		System.out.println(result);
	}
	//create a method to get the first element after sorting
	// the elements by using their second last character
	public static void getFirstAfterSort(List<String> list) {
		Optional<String> firstEl = list.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-2))).findFirst();
		System.out.println(firstEl);
	}
	//create a method to get the last element after sorting
	// the elements by using their length
	public static void getLast(List<String> list) {
		Optional <String> l=list.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).findFirst();
		System.out.println(l);
	}

}
