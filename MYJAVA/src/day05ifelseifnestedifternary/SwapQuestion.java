package day05ifelseifnestedifternary;

import java.util.Scanner;

public class SwapQuestion {

	public static void main(String[] args) {
/*
  how to switch the values of 2 Variables?
  Example:  int a =12; and int b = 13; swap their values
   */
		
		// 1st way: by using 3rd variable.
int a = 12;
int b = 13;
int c ;
c = a;
a= b;
b =c;
System.out.println(a +" and " + b);


Scanner scan = new Scanner(System.in);
System.out.println(" Enter Two ints to swap");
int int1= scan.nextInt(); //12
int int2 = scan.nextInt();//13
System.out.println("initial values are: "+ int1+ " and " + int2 );
int temp=0;		
temp = int1;
int1 = int2;
int2 =temp;

System.out.println("After Swap is done "+ int1 +" is " + int2);
		
		// Java has garbage collector, constantly checks the memory
		// Java will understand temps and will clear the memory
// all variables use memory, so Java constantly looks for temp.

//2nd way without 3rd using variable.
System.out.println("===========================");
int a1 = 12;
int b2 = 13;
System.out.println("initial Values" +a1+" and " + b2);
a1=a1+b2;
b2=a1-b2;
a1=a1-b2;
System.out.println("After swappnig"+a1+" and "+ b2);

scan.close();

	}

}
