package day02scanner;

import java.util.Scanner;

public class HourstoSecs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Hour/hour to calculate Seconds");
		long hours= scan.nextLong();
		long secs = hours*60*60;
		System.out.println(hours+ "  Hours make "+ secs+ " seconds.");
		scan.close();

	}

}
