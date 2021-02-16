package datime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeFormats {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Date and lets compare");
		LocalDate ld= LocalDate.now();

		DateTimeFormatter dft=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		System.out.println(dft.format(ld));







	}

}
