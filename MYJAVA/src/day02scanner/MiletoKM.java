package day02scanner;

import java.util.Scanner;

public class MiletoKM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Mile to Calculate KM");
		double ml = scan.nextDouble();
		double km = 1.61*ml;
		System.out.println(ml+ " miles make " + km + " Kilometers");
		scan.close();

	}

}
