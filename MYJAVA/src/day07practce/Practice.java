package day07practce;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scan.nextLine();
		
		System.out.println("What is your address?");
		String addrs = scan.nextLine();
		
		System.out.println("Waht is your age?");
		int age= scan.nextInt();
		
		
		
		System.out.println("The name is " + name+ " Age "+ age+" \nAddress is:" +addrs );
		
		System.out.println("How did you like Java So Far?");
		String jl = scan.next();
		System.out.println("Answer is :"+ " "+ jl);
		
		
		
		scan.close();

	}

}
