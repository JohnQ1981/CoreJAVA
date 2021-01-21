package day02scanner;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		
		/* Increment means increase the value of a variables
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		int num01 = 12;
System.out.println("Before Increment "+num01);
		num01 = num01 +5;
		num01++;
		
System.out.println("after increment "+num01);

// create an int variable and increate its
//value by 3
//then by then 4 , then by 5;
//First Solution
int i = 35;
 i= i +3;
 System.out.println(i);
 i= i +4;
 System.out.println(i);
 i= i +5;
 System.out.println(i);
 // Second solution
 int v = 300;
 v += 3; //no space between operation sign and equal sign
 System.out.println(v);
 v += 4;
 System.out.println(v);
 v += 5;
 System.out.println(v);

 //third solution
 int t = 100; // increase only by 1.
 t ++;
 System.out.println(t);
 
 //create an int variable and increase
 //its value by multiplication
 
 //first way
 int c =10;
 c = c*6;
 System.out.println(c);
 
 //second way. 
 c *= 3;
 System.out.println(c);

 // the Same logic is Valid for Decrement
 int e = 35;
 e= e-5;
 System.out.println(e);
 
 e -=3;
 System.out.println(e);
 
 e--;
 System.out.println(e);

 
 // for the division the same way
 int x = 50;
 x=x/2;
 System.out.println(x);
 
 x /= 3;
 System.out.println(x);
 
 
 // Post and Pre Increment and Decrement 
 //Two Types of Increments and Two Types of Decrements
int j = 12;
j ++; // Post Increment
j--; // post decrement
++j; // Pre increment
--j; // Pre decrement
// Java Reads from top to Down and From Left to right

System.out.println(j);
System.out.println(++j);
int o= 12;

System.out.println(o++ +" Post Increment");
System.out.println(++o + " Pre-Increment");

// What do you see on the console?

int p= 15;
System.out.println(++p + " Pre"); //16
System.out.println(p++ + " Post"); //16
System.out.println(p); //17

//what is do you see on the console?

int z = 21;
System.out.println(--z);//20
System.out.println(z--);//20
System.out.println(--z);// 18

	}

}
