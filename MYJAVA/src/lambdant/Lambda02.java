package lambdant;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {

	// Create a method to print the squares of every element
	// on the console in the same line with a space between the elements

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
		sq1(list);
		System.out.println(list);
		System.out.println("+++++");
		sq2(list);
		System.out.println("========");
		sq3(list);
		System.out.println("========");
		sq4(list);
		System.out.println("========");
		sqofEven(list);
		System.out.println("========");
		cubeofEven(list);
		System.out.println("========");
		cubeofEven2(list);
		System.out.println(findOfAllSum(list));// Sum of All 77
		System.out.println("========");
		System.out.println(findOfAllSum2(list));
		System.out.println("========");
		System.out.println(findOfAllSum3(list));

		System.out.println("========");
		System.out.println(findSqrtOfEven(list));

		System.out.println("========");
		System.out.println(findMulOfAll(list));
		System.out.println("========");
		System.out.println(findMulOfAll2(list));
		System.out.println("========");
		System.out.println(findMulOfAll3(list));
	}

	// 1Way Lambda Expressions
	public static void sq1(List<Integer> list) {
		list.stream().map(t -> t * t).forEach(t -> System.out.print(t + " "));

	}


	// method reference with my own method
	public static void sq2(List<Integer> list) {
		list.stream().map(t -> t * t).forEach(Labmda02::print);

	}

	public static void sq3(List<Integer> list) {
		list.stream().map(Lambda02::findSq).forEach(Labmda02::print);

	}

	// my method
	public static int findSq(int t) {
		return t * t;
	}

	// Method Reference with Java method
	public static void sq4(List<Integer> list) {
		list.stream().map(Lambda02::findSq).forEach(System.out::print);

	}

	public static void sq5(List<Integer> list) {
		list.stream().map(Lambda02::findSq).forEach(System.out::print);

	}

	// Create a method to print the squares of odd elements
	// on the console in the same line with a space between the elements
	public static void sqofEven(List<Integer> list) {
		list.stream().filter(t -> t % 2 != 0).map(Lambda02::findSq).forEach(Labmda02::print);

	}

	// Create a method to print
	// the cubes of even elements on the console like “The cube of 4 is 64”
	public static int cube(int t) {
		return t * t * t;
	}

	public static void cubeofEven(List<Integer> list) {
		list.stream().filter(t -> t % 2 == 0).map(t -> "The cube of" + t + " is " + t * t * t)
		.forEach(System.out::println);
	}

	// Method reference
	public static void cubeofEven2(List<Integer> list) {
		list.stream().filter(t -> t % 2 == 0).map(Lambda02::findCube).forEach(System.out::println);
	}

	public static String findCube(int t) {
		return ("The Cube of " + t + " is " + t * t * t);
	}

	// Find the sum of all elements in the given list
	// Lambda Expression
	public static int findOfAllSum(List<Integer> list) {
		return list.stream().reduce(0, (x, y) -> x + y);
	}

	public static int findOfAllSub(List<Integer> list) {
		return list.stream().reduce(0, (x, y) -> x - y);
	}

	// Method Reference
	public static int findOfAllSum2(List<Integer> list) {
		return list.stream().reduce(0, Integer::sum);
	}

	public static int findOfAllSum3(List<Integer> list) {
		return list.stream().reduce(0, Math::addExact);
	}

	// find the sum of the square roots of the even elements in the given list
	public static double findSqrtOfEven(List<Integer> list) {
		return list.stream().filter(t -> t % 2 == 0).map(Math::sqrt).reduce((double) 0, Double::sum);

	}

	// find the multiplication of all add elements
	public static int findMulOfAll(List<Integer> list) {
		return list.stream().filter(t -> t % 2 != 0).reduce(1, (x, y) -> (x * y));

	}

	public static int findMulOfAll2(List<Integer> list) {
		return list.stream().filter(t -> t % 2 != 0).reduce(1, Math::multiplyExact);

	}

	public static int multiply(int x, int y) {
		return x * y;

	}

	public static int findMulOfAll3(List<Integer> list) {
		return list.stream().filter(t -> t % 2 != 0).reduce(1, Lambda02::multiply);

	}

}
