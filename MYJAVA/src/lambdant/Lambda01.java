package lambdant;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
	/*
	 * 1.) Lambda is "Functional(means you will use methods)" programming.
	 * "we will focus on what to do" instead of "how to do" Lambda only can be used
	 * in Collections. 2.) Until now we used "Structured" Programming" in
	 * "Structured Programming" most of the times, we think how to do? not what to
	 * do?
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		// create a method to print the list elements on the console in the same line
		// with a space within the elements
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		print1(list);
		System.out.println("");
		printf(list);
		System.out.println("");
		printEven(list);
		System.out.println("");
		printLess10(list);
		System.out.println("");
		printLess0(list);
		System.out.println("");
		printLess102(list);
	}

	public static void print1(List<Integer> list) {
		for (Integer w : list) {
			System.out.print(w + " ");
		}

	}

	public static void printf(List<Integer> list) {

		list.stream().forEach(t -> System.out.print(t + " "));

	}

	// create a method to print an even elements on the console
	public static void printEven(List<Integer> list) {
		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
	}

	// create a method to print an less than elements on the console
	/*
	 * Instead of using Lambda Expression, if it is possible we use
	 * "Method Reference" What is "Method Reference" means ==> Class Name :: Method
	 * Name
	 */
	public static void printLess10(List<Integer> list) {
		list.stream().filter(t -> t < 10).forEach(t -> System.out.print(t + " "));
	}

	public static void printLess103(List<Integer> list) {
		list.stream().filter(t -> t < 10).forEach(System.out::print);
	}

	public static void printLess0(List<Integer> list) {
		list.stream().filter(t -> t < 10).forEach(System.out::print);
	}

	public static void print(int a) {
		System.out.print(a + "*");

	}

	public static void printLess102(List<Integer> list) {
		list.stream().filter(t -> t < 10).forEach(Lambda01::print);
	}

}
