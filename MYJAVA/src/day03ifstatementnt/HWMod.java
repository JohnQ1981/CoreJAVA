package day03ifstatementnt;

import java.util.Scanner;

public class HWMod {

	public static void main(String[] args) {
		int n =45;
		int n2 = 13;
		int remainder = n % n2;
		System.out.println("remainder is :" + remainder);
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Two Int, first should be greated than second:");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int w = a % b;
	//System.out.println(w);
	int l = a+b;
	int area=l*w;
	int per = 2*(l+w);
	System.out.println("the remainder is "+ w +  " \nand Area of the Rectangle is "+ area +" and The Perimeter is: " + per );
	
	
	System.out.println("Enter Two Integers");
	int c = scan.nextInt();
	int d = scan.nextInt();
	int e = c;
	System.out.println("You entered : " + c + " and " + d +" but i swapped them as"+ "\n" + d+ " and "+ e );
	
	System.out.println("Enter Two Integers");
	int c1 = scan.nextInt();
	int d1 = scan.nextInt();
	
	System.out.println("You entered : " + c1 + " and " + d1 +" but i swapped them as"+ "\n" + d1 + " and "+ c1 );
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
	}

}
