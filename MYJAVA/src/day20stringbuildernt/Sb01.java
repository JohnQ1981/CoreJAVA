package day20stringbuildernt;

public class Sb01 {
	/*
	 1) To create "Mutable Strings' Java Created " StringBuilder"
	 class, if you create String by using "Stringbuilder" class, the String
	 will be mutable. 
	  
	 2) there is another class to create "Mutable" Strings, which is
	  "StringBuffer".
	  	a) Stringbuffer runs slow,
	  	b)Stringbuffer can be used in "synchronization",
	  	but Stringbuilder cannot.
      */
	public static void main(String[] args) {

		String str = "Learn";
		concat(str);
		//because of the "pass by value" and immutability 
		//of Strings , you will get " Learn" in the
		//next line.
		
		System.out.println(str);
		//System.out.println(concat(str));
		
		//How to create String by using StringBuilder
		//1way
		
		StringBuilder sb1 = new StringBuilder();// Empty String
		//==> 16 character reserved in memory
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		// 2Way
		StringBuilder sb2 = new StringBuilder(9);//
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		sb2.trimToSize();
		System.out.println("After Trim "+ sb2.capacity());
		// if you want to remove unused reserved area
		//from Stringbuilder
		//use trimtoSize();
		
		//I want a String , its lengh will be 9
		// if you do not use "9"
		// in constructor , Java will reserve 
		//16 characters,
//		To save memory,
//		if you are sure about the lengh., use number in the constructor 
//		paranthesis.
		
		//3. Way
		StringBuilder sb3 = new StringBuilder("Learn");
		System.out.println(sb3);
		
		int i=sb3.capacity();
		int b= sb3.length();
		System.out.println(i+"-"+b);
		
		
		sb2.append("JohnJohnJohn");
		System.out.println(sb2);
		System.out.println(sb2.length());
		
		sb2.append("12345");
		System.out.println(sb2);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());//11+9  // 9is coming from set in the begining
		
		sb2.trimToSize();
		System.out.println(sb2);
		
		StringBuilder sb4 = new StringBuilder();
		sb4.append("Learn ").append("Java").trimToSize();;
		System.out.println(sb4);
		
		
		//to get a specific character
		System.out.println(sb4.charAt(6));
		
		//delete specific character at index number
		sb4.deleteCharAt(5);
		System.out.println(sb4);
		//if the return type of the method you used
		// is StringBuilder , it means your String is updated
		// method will update the original Stringbuilder value,
		
		
		//to delete multiple characters from StringBuilder
		
		sb4.delete(5, sb4.length());
		System.out.println(sb4);
		
		
		//To get index of a specific character/s
		
		System.out.println(sb4.indexOf("r"));//3
		System.out.println(sb4.indexOf("earn"));//1
		
		// To change a character at a specific index
		
		sb4.setCharAt(2, 'A');//LeArn
		System.out.println(sb4);
		
		
		//To Replace character/s 
		
		sb4.replace(0, 1, "I Want to L");
		System.out.println(sb4);
		
		// creat a string and print it in the revers
		
		String rv="Ali Can";
		String revers ="";
		for(int i1=rv.length()-1;i1>=0;i1--) {
			
			revers=revers+rv.charAt(i1);
			
		}
		System.out.println(revers);
		
		
		StringBuilder sb5 = new StringBuilder("Ali Can");
		
		sb5.reverse();
		System.out.println(sb5);
		
		//How to convert StringBuilder to String
		// if you want to use a StringBuilder like a String
		// you need to create a method chain,
		//toString(); cannot change original Stringbuilder
		String s=sb5.toString();
		System.out.println(s);
		
		//insert new character/s into StringBuilder
		
		sb5.insert(2, "Ali Can");
		
		System.out.println(sb5);
		
		
	}
	
	
	
	public static String concat(String str) {
		
		return str+"X";
		
	}
	
	
	
	
}
