/**
 * 
 */
package day10dowhileloop;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class DoWhileHW {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

int i= 1;
do {
	System.out.println(i);
	i++;
}while(i<=5);


int j=10;
do {
	System.out.print(j+" ");
	j--;
}while(j>=3);
System.out.println();
int q = 1;
do {
	if(q%5==0) {
		System.out.print(q+" ");
	}
	q++;
}while(q<=100);
System.out.println();
char g = 'c';

do {
	System.out.print(g+" ");
	g++;
}while(g<='m');
System.out.println();
Scanner scan = new Scanner(System.in);

int n=1;
do {
	System.out.println("Enter number");
	 n = scan.nextInt();
}while(n %10!=0);

System.out.println("You Won");

String s = "";
//boolean isTrue = s.contains("b"); 
do {
	
	System.out.println("Enter Name");
	s= scan.next().trim().toLowerCase();
	if(s.contains("a")) {
		System.out.println("your name has a");
	}
	System.out.println(s);
}while(!s.contains("a"));

System.out.print(" you won");
System.out.println();

System.out.println("Enter Sctring");
String h= scan.next().trim().toUpperCase();
int l=0;
do {
	
	System.out.print(h.charAt(h.length()));
	
	l++;
} while(h.charAt(h.length())%2==1 && l<=h.length());











scan.close();

	}

}
