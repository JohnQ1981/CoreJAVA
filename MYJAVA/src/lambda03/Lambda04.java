package lambda03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda04 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		unqEl(list);
		System.out.println();
		unqElSq(list);
		System.out.println();
		sqrReverseAdd(list);
		List<Integer> list2 = new ArrayList<Integer>();
		System.out.println(halfOfDisRevList(list));
		System.out.println(halfOfDisRevSet(list));


	}
	// create a method to print list elements 
	//in natural order 
	//print the repeated elements just once
	public static void unqEl(List<Integer>list) {
		list.stream().sorted().distinct().forEach(Labmda02::print);
	}
	//create method to print the square 
	//of distinct , even elements in natural order
	public static void unqElSq(List<Integer>list) {
		list.stream()
		.filter(t->t%2==0)
		.distinct()
		.sorted()
		.map(t->t*t).forEach(Labmda02::print);

	}
	//create a method to print a method SqRoot
	// of add elements in reverse order
	public static void sqrReverseAdd(List<Integer> list) {
		list.
		stream().
		filter(t->t%2!=0).
		distinct().
		map(Math::sqrt).
		sorted(Comparator.
				reverseOrder()).
		forEach(System.out::println);
	}
	//create a method to print the half of distinct  
	//greater than 5  elements in reverse order in a list

	public static List halfOfDisRevList(List<Integer> list) {
		return list.
				stream().
				filter(t->t>5).
				map(t->t/2.0).
				distinct().
				sorted(Comparator.reverseOrder()).
				collect(Collectors.toList());
	}
	public static Set halfOfDisRevSet(List<Integer> list) {
		return list.
				stream().
				filter(t->t>5).
				map(t->t/2.0).
				collect(Collectors.toSet());
	}

}
