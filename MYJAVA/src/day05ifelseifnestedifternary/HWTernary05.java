/**
 * 
 */
package day05ifelseifnestedifternary;

import java.util.Scanner;

/**
 * @author IK
 *
 */
public class HWTernary05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int y = 112;
		System.out.println((y>5) ? (21): ("Zebra"));

		System.out.println((y<91) ? 9: "Horse");
		
		int t = 1;
		int z =1;
		//int result = t<10? t++ : z++;
		System.out.println(t+"," +z);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Width and Length");
		int w = scan.nextInt();
		int l = scan.nextInt();
		String r = w==l ? "It is Square " : "It is Rectangle "  ;
		System.out.println("Shape is: " + r+ "Width is: "+w + " and Length is "+ l);
		
	System.out.println("Enter a String");
	
	String S = scan.next();		
	
	System.out.println(S.length()==2? "It is valid for state abbreviations":"It is not valid for state abbreviations");
		
	System.out.println("Enter an Integer");	
	int k = scan.nextInt();
	int l1 = k<10 && k>= 0? k*k*k: k*k;
	System.out.println(k<10 && k>= 0? "Cube: "+(k*k*k) : "Square "+ (k*k));
	System.out.println(l1);	
	scan.close();
		
	}

}
