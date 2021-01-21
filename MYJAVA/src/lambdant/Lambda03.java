package lambdant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Lambda03 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(233);
		list.add(4);
		list.add(10);
		list.add(12);
		list.add(-12);
		list.add(15);
		list.add(43);
		System.out.println(maxEl(list));
		System.out.println("======");
		maxEl1(list);
		System.out.println("======");
		maxEl2(list);
		maxEl3(list);
		System.out.println("======");
		minEl(list);
		System.out.println("======");
		minEl1(list);
		minEl2(list);
		printAllSorted(list);
		maxValSort(list);
		minValSort(list);

	}

	/// Create a method
	// to find the maximum value from the list, use “Structured Programming”
	public static int maxEl(List<Integer> list) {
		Collections.sort(list);
		int max = list.get(list.size() - 1);
		return max;
	}

	/// Create a method
	// to find the maximum value from the list, use “functional Programming”
	public static void maxEl1(List<Integer> list) {
		int max = list.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y);
		System.out.println(max);
	}

	// method Reference
	public static void maxEl2(List<Integer> list) {
		int max = list.stream().reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println(max);
	}

	public static void maxEl3(List<Integer> list) {
		int max = list.stream().reduce(Integer.MIN_VALUE, Math::max);
		System.out.println(max);
	}

	public static void maxEl4(List<Integer> list) {
		int max = list.stream().reduce(Integer.MIN_VALUE, Lambda03::maxEl6);
		System.out.println(max);
	}

	public static int maxEl6(int x, int y) {
		return x > y ? x : y;
	}

	// find minimum value with functional programming and lambda expression
	public static void minEl(List<Integer> list) {
		int min = list.stream().reduce(Integer.MAX_VALUE, Math::min);
		System.out.println(min);
	}

	// method reference
	public static void minEl1(List<Integer> list) {
		int min = list.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y);
		System.out.println(min);
	}

	// find minimum greater than 7 and even
	public static void minEl2(List<Integer> list) {
		int min = list.
				stream().
				filter(t -> t > 7 && t % 2 == 0).
				reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y);
		System.out.println(min);
	}

	// create a method to print a list element in natural order
	public static void printAllSorted(List<Integer> list) {
		list.
		stream().
		sorted().
		forEach(Labmda02::print);

	}

	// find max value by sorting
	public static void maxValSort(List<Integer> list) {
		Optional max = list.
				stream().
				sorted().
				reduce((x, y) -> y);
		System.out.println();
		System.out.println(max);
	}

	public static void minValSort(List<Integer> list) {
		Optional max = list.
				stream().
				sorted().
				reduce((x, y) -> x);
		System.out.println();
		System.out.println(max);
	}

}
