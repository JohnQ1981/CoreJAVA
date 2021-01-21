package day35;

import java.math.BigInteger;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Question01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to sum until");
		int num = scan.nextInt();
		sum1(num);
		System.out.println(sum2(num));
		System.out.println(sum3(num));

		System.out.println(sumOfEven(7,13));
		System.out.println(sum5(1,99));
		System.out.println(sum6());

		powerOf3(4);
		System.out.println(powerOf3(4));


		System.out.println(exponents(2,3));

		//System.out.println(anyExponent(-2,10));
		System.out.println(factorial(5));// int max Factorial is 12!

		System.out.println(factorial2(51));//1551118753287382280224243016469303211063259720016986112000000000000
	}



	//Structured
	public static int sum1(int x) {

		int sum =0;
		for(int i=0; i<=x; i++) {
			sum = sum +i;
		}

		System.out.println(sum);
		return sum;
	}
	//Functional
	public static int sum2(int x) {
		//IntSream is the same with for loop
		return IntStream.range(1, x+1).sum();

	}
	public static int sum3(int x) {
		return IntStream.rangeClosed(1, x).sum();
	}
	//Create a method to find the sum of even integers 
	//from x to y by using "functional programming"
	public static int sumOfEven(int x, int y) {

		return IntStream.rangeClosed(x, y).filter(t->t%2==0).sum();

	}

	//Create a method to find the sum of first 50 odd positive integers 
	//by using "functional programming"// not recommended
	public static int sum5(int x,int y) {

		return IntStream.rangeClosed(1, 99).filter(t->t%2!=0).sum();
	}
	//2nd way: Recommended
	public static int sum6() {
		return IntStream.iterate(1, t->t+2).limit(50).sum();
	}
	//Create a method to find the any power of 3 by using
	//"functional programming" (Ex: 4th power of 3 is 3*3*3*3)

	public static OptionalInt powerOf3(int numOfPow) {
		return IntStream.iterate(3,t->t*3).limit(numOfPow).reduce((x,y)->y);
	}
	//
	public static OptionalInt exponents(int pow, int num) {
		return IntStream.iterate(num, t->t*num).limit(pow).reduce((x, y)->y);
	}

	//	public static OptionalDouble anyExponent(int pow, int num) {
	//		OptionalDouble result =IntStream.iterate(num, t->t*num).limit(Math.abs(pow)).sorted(Comparator.reverseOrder()).fi;
	//		return (1.0/result);
	//	}
	//Create a method to calculate the factorial of any number (5!=1x2x3x4x5)
	//1st way
	public static OptionalInt factorial(int x) {
		return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact);//max 12! since it is int

	}
	//2nd Way works for all numbers
	public static BigInteger factorial2(int x) {
		return IntStream.rangeClosed(1, x).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply);
	}




}
