package lambda04;

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


}
