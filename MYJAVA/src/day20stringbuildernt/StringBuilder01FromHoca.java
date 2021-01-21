package day20stringbuildernt;

public class StringBuilder01FromHoca {
	
	/*
	 1)To create "mutable Strings" Java created "StringBuilder" class. If you create String by
	   using "StringBuilder" class, the String will be mutable.
	 2)There is another class to create "mutable" Strings which is "StringBuffer".
	   a)StringBuffer runs slow 
	   b)StringBuffer can be used in "synchronization" but StringBuilder cannot.
	 */

	public static void main(String[] args) {
		
		String str = "Learn";
		concat(str);
		//because of the "pass by value" and immutablity of Strings, you will get "Learn" in the next line.
		System.out.println(str);//Learn
		
		//How to create String by using StrinBuilder
		//1.Way:
		StringBuilder sb1 = new StringBuilder();//Empty String ==> 16 characters reserved in memory
		System.out.println(sb1.length());//0
		System.out.println(sb1.capacity());//16
		
		//2.Way:
		StringBuilder sb2 = new StringBuilder(9);//I want a String, its length will be 9.
		//If you do not use "9" in constructor, Java will reserve 16 characters.  
		//To save memory, if you are sureabout the length, use number in constructor parenthesis.
		System.out.println(sb2.length());//0
		System.out.println(sb2.capacity());//9
		
		sb2.append("Animal");
		System.out.println(sb2);//Animal
		System.out.println(sb2.length());//6
		System.out.println(sb2.capacity());//9
		
		sb2.append("XXXXX");
		System.out.println(sb2);//AnimalXXXXX
		System.out.println(sb2.length());//11
		System.out.println("Before trim: " + sb2.capacity());// 11 + 9 = 20
		//If you want to remove unused reserved area from StringBuilder use trimToSize()
		sb2.trimToSize();
		System.out.println("After trim: " + sb2.capacity());
		
		//3.Way:
		StringBuilder sb3 = new StringBuilder("Learn");
		System.out.println(sb3);//learn
		System.out.println(sb3.length());//5
		System.out.println("Before trim: " + sb3.capacity());//16+5 = 21
		sb3.trimToSize();
		System.out.println("After trim: " + sb3.capacity());//5
		
		StringBuilder sb4 = new StringBuilder();
		sb4.append("Learn ").append("Java");
		System.out.println(sb4);//Learn Java
		
		//To get a specific character
		System.out.println(sb4.charAt(6));//J
		
		//To delete a specific character
		//If the return type of the method you used is StringBuilder, the method updates
		//your original StringBuilder value.
		sb4.deleteCharAt(5);
		System.out.println(sb4);//LearnJava
		
		//To delete multiple characters from StringBuilder
		sb4.delete(5, sb4.length());
		System.out.println(sb4);//Learn
		
		//To get index of a specific character/s
		System.out.println(sb4.indexOf("r"));//3
		System.out.println(sb4.indexOf("earn"));//1
		
		//To change a character at a specific index
		sb4.setCharAt(2, 'X');
		System.out.println(sb4);//LeXrn
		
		//To replace character/s into StringBuilder
		sb4.replace(2, 3, "ABC");
		System.out.println(sb4);//LeABCrn
		
		//Create a String and print it in reverse on the console
		String name = "Ali Can";
		for(int i = name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));//naC ilA
		}
		
		System.out.println();
		
		//Create a StringBuilder and print it on the console in reverse order
		StringBuilder sb5 = new StringBuilder("Ali Can");
		sb5.reverse();
		System.out.println(sb5);
		
		//How to convert StringBuilder to String.
		//If you want to use a StringBuilder like a String you need to create method chain.
		//toString() cannot update the original value of the StringBuilder.
		sb5.toString();
		
		//Insert new character/s into StringBuilder
		sb5.insert(3, "XXX");
		System.out.println(sb5);//naCXXX ilA

	}
	
	public static String concat(String str) {
		return str + "X";
	}

}