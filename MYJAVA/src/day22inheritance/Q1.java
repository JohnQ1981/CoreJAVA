package day22inheritance;

import java.util.Scanner;

public class Q1 {
	static int a =0;
	static int b = 0;
	
	public static void main(String[] args) {
		Q1 obj = new Q1();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Two integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("what operation do you want to do?");
		String op= scan.next().trim();
		
		if(op.equals("+")) {
			System.out.println("Addition "+ obj.add(a,b));
		}else if(op.equals("-")) {
			System.out.println("Sub "+ substract(a,b));
		}else if(op.equals("*")) {
			System.out.println("Mul "+ mul(a,b));
		}else if(op.equals("/")) {
			System.out.println("div "+ dv(a,b));
		}else {
			System.out.println("Please enter a valid operation symbol");
		}
scan.close();
	}
	
	
	public  int add (int a,int b) {
		return a+b;
	}
	
	public static int substract( int a,int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	
	public static int dv(int a, int b) {
		return a/b;
	}
	
	
}
