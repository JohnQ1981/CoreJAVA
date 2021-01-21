package day02scanner;

import java.util.Scanner;

public class HomeWorkDay2 {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner scan= new Scanner(System.in);
		double side= scan.nextDouble();
		System.out.println("Now we will calculate the Cube of the number");
		
		double cubearea= side*side*side;
		System.out.println("The Cube of the number entered is " + cubearea);
		//scan.close();
		
		
			System.out.println("Enter width of the Rectangular Prism");
			double width = scan.nextDouble();
			System.out.println("Enter length of the Rectangular Prism");
			double length = scan.nextDouble();
			System.out.println("Enter height of the Rectangular Prism");
			double height = scan.nextDouble();
			System.out.println("We will calculate the Volume");
			double vol= width*length*height;
			System.out.println("The Volume of the Shape is "+ vol);
			//scan.close();
			
			System.out.println("please enter Radius of the Circle");
			float rofc = scan.nextFloat();
			float areaofc = rofc* 3.14159F;
			float perofc =2*3.14159F*rofc;
			System.out.println(" Area of the Circle is " + areaofc+ " And perimeter of the circle is "+ perofc);
			//scan.close();
		System.out.println("Enter 1st side of the Triangle ");
		 byte s1= scan.nextByte();
		 
		 System.out.println("Enter 2nd side of the Triangle ");
		 byte s2= scan.nextByte();
		 
		 System.out.println("Enter 3rd side of the Triangle ");
		 byte s3= scan.nextByte();
		  int poft =  (s1+s2+s3);
		  System.out.println("Perimeter of the Triange is "+ poft);
		  scan.close();
		 
		
		

	}

}
