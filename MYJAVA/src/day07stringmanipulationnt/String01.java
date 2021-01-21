package day07stringmanipulationnt;
import java.util.Scanner;
public class String01 {

	public static void main(String[] args) {
		/*
		 How to use methods in non Primitive Data Types
		 there are many useful methods in String Class to manipulate
		 Strings
		 
		 
		 1st create a String
		 */
String s1 = "Java is easy.";
 System.out.println(s1.charAt(0)); //J==> to get first character in a String use 0 as index
 System.out.println(s1.charAt(4));	// i will get space on the console
 System.out.println(s1.charAt(s1.length()-1));	//. ==> length()-1   this statement will always return last char of the String
 //System.out.println(s1.charAt(23));// if you use non-existing index , you will get Exception( kind of Error)

 
 // 2nd Method for String
 String s2 = "Learn Java earn Money";
 System.out.println(s2.concat(" Really")); // concat adds String to String/ concat is better
	
 
 //3.rd Method  Contains
 String s3 = "Study hard stay humble";
 System.out.println(s3.contains("s"));// looks for string if it contains specific character
 System.out.println(s3.contains("hard"));
 System.out.println(s3.contains(" "));
 System.out.println(s3.contains("hard"));
 System.out.println(s3.contains(""));// nothing is the first character in ASCII table
 System.out.println(s3.contains("T"));// contains methos is using Just String Data type
 System.out.println(s3.contains(s3));
 
 
 //4th Method  endsWith
 String s4 = "Study hard get offer in a week";
 
 System.out.println(s4.endsWith("k"));// check the last character of the String and returs boolean
 System.out.println(s4.endsWith(""));// nothing is the last character
 System.out.println(s4.endsWith("m"));	// false since last is k or nothing
 System.out.println(s4.endsWith("week"));
 
 
 //5th method : equals :case sensitive 
 String s5 = "Fast is slow , slow is fast in IT";
 System.out.println(s5.equals("Fast is slow , slow is fast in IT"));//true since case sensitive
 System.out.println(s5.equals("Fast is slow , Slow is fast in IT"));//false since case sensitive
 
 
 // 6ht method equalsIgnoreCase
 
 System.out.println(s5.equalsIgnoreCase("Fast is Slow , Slow Is Fast in IT"));//True
 
 System.out.println("a".equalsIgnoreCase("A"));
 
 
 //7th method  
 String s6 = "Learn coding by typing";
 System.out.println(s6.indexOf("i"));// returns first , index of first occurrence
	
 System.out.println(s6.indexOf("ing"));// always it will look for the first occurrence regardless of number of characters being checked.
 System.out.println(s6.indexOf('l')); // if you look for non existing character/s it returns -1 , means this
 //character is not contain in the string, can be used for char
 System.out.println(s6.indexOf("Coding"));//-1 not matching
 System.out.println(s6.indexOf(""));
 System.out.println(s6.indexOf(" "));
 System.out.println(s6.indexOf("i", 11));// find i after 11th character
 System.out.println(s6.indexOf('n', 6));
 System.out.println(s6.indexOf("", 5));
 System.out.println(s6.indexOf(" ", 5));
 
 
 //8th method 
 System.out.println(s6.isEmpty());//false is it empty?
 System.out.println("".isEmpty());// true since no any characters 
 System.out.println("".length());// 0 is the length is zero , empty=0, 0=empty
 
 //9th method lastIndexOf
 
 System.out.println(s6.lastIndexOf("n"));// we can use strings or char
 System.out.println(s6.length());
 System.out.println(s6.lastIndexOf('y'));
 System.out.println(s6.lastIndexOf(""));
 System.out.println(s6.lastIndexOf("ing"));
 System.out.println(s6.lastIndexOf("xx")); //if do not exist it returns -1
 // String s6 = "Learn coding by typing";
 System.out.println(s6.lastIndexOf('n', 15));
 System.out.println(s6.lastIndexOf('i', 14));
 System.out.println(s6.lastIndexOf("ing", 7));
 
 
 
 
 //10th method  ==> replace method, changes are Temporary.
 String s7 = "Java is OOP Language";
 System.out.println(s7.length());
 System.out.println(s7.replace("O", "O-"));
 System.out.println(s7.replace("a", "A"));
 System.out.println(s7.replace(" ", "*"));
 System.out.println(s7.replace("Language","concept"));
 System.out.println(s7.replace("i","code"));
 // 
 //System.out.println(s7.replace('a',''));// nothing is not character
 System.out.println(s7.replace("a", "@"));
 System.out.println(s7.replace("","!"));
 
 //11th method startsWith
 //String s7 = "Java is OOP Language";
 System.out.println(s7.startsWith("J"));//true
 System.out.println(s7.startsWith("Java"));//true
 System.out.println(s7.startsWith(""));//nothing only for strings
 System.out.println(s7.startsWith("is", 5));
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter Price of the Product");
 String pr = scan.nextLine();
 
 if(pr.startsWith("$")) {
	 System.out.println("Price is in expected format");
	  }
 else if(pr.endsWith("$")) {
	 System.out.println("Price is in good format");
 }
 
 else {
	 System.out.println(" Price is not in Expected format");
	 }
 
 scan.close();
 
	}

}
