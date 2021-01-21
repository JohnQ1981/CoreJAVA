/**
 * 
 */
package day06;

import java.util.Scanner;

/**
 * @author jq
 *
 */
public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int i;	
for( i=0;i<=10;i++) {
	
	System.out.println("5*"+i+"="+i*5);
	
}
int a=1;
int b=2;
int c= 3;
int d=1;
if(a+b>c+d) {
	System.out.println("a+b is greater than c+d");
}
else {System.out.println("c+d is greater than a+b");
}
Scanner scan= new Scanner(System.in);
System.out.println("Enter three variables");
double f=scan.nextInt();
int g=scan.nextInt();
int h=scan.nextInt();
System.out.println("Their multiplacation is: "+f*g*h);
if(f%2!=0 && f%3 !=0) {
	System.out.println("It is Prime Number");
}
else if(f%2==0) {System.out.println("it is even");}
else {System.out.println("it is add");}	
	
	scan.close();
	}

}
