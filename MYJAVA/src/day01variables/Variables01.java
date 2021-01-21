package day01variables;

public class Variables01 {
  public static void main(String[] args) {
	  /*
	    Variable is the name of the reserved area in the 
	    memory.
	    to create a variable you need to declare 
	    1. data type
	    2. variable name
	    3. semi colon
	    int stands for integer
	    in java when we finish our sentence we put semicolon
	    it is like period in English Language.
	    Term: "i assigned a value to variable"
	    
	   */
	  int age = 39;
	  int weight = 83;
	  String firstName = "John";
	  // typing codes short is very important in coding area
	  // if it is possible to type codes short type short. do not
	  // type long.
	  // if the data type of the variable is the same use it in one line
	  // each variable is saved in memory so think well and efficient when creating variable
	  
	  int height = 11, length = 12, money = 50, salary = 500;
	  char mynumber = '1';
	  boolean retired = true;
	  /*
	   Data Types: There are two Main Data types
	   1. Primitive Data Types
	   2. Non Primitive Data Types
	   *Primitive Data Types: 
	   *          a)boolean: used for  (true or false)options
	   *           returns "True" or "False"
	   *                     example:  boolean retired = true;
	   *          			 boolean data types use 1 bit in memory.
	   *          	
	   *          b)char: char is used just for single characters.
	   *              example: char a = A; char mynum = '1'; 
	   *              do not use space since space is a character in java          
	   *            when we use char as data type , we have to put
	   *            value between single quotes  char mynumber = '1';
	   *             char num2 = ' ' ;
	   *             char can be used only with single characters.
	   *             if we do not assign anything between the single quote 
	   *             we will get an error.
	   *             error: char num3 = '' ; 
	   *          Every char variable uses 16 bits/2 bytes in memory.
	   *          
	   *          c)byte
	   *           from integer  -128 to 127 it is used for the values in between
	   *           inclusive -128 and 127 included
	   *          byte age = 39;
	   *          byte length = 12;
	   *          all values must be integer.
	   *          byte uses 8 bits in memory.
	   *          
	   *          
	   *          d)short: it is used for the integers between -32768 to
	   *          32767 inclusive
	   *          short population = 12522;
	   *           short uses 16bits/2 bytes in memory.
	   *          
	   *          *             
	   *          e)int: it is used for integers between
	   *     -2,147,483,648 to 2,174,483,647
	   *     it uses 32 bits for every integer variable.
	   *     
	   *          f)long : it is used for integers between -9,223,372,036,854,755,808 
	   *          to 9,223,372,036,854,755,807
	   *          it uses 64 bits for every integer variable.
	   *          
	   *          g)float: it is used for a decimal numbers, 
	   *          it uses 32 bits , 
	   *          and if you use float, you need to put 'f' or'F'
	   *          at the end of the number.
	   *          float num = 3.2f;
	   *      for float after the whole number you can use 7 digits.
	   *      float num5 = 2.3253256f;
	   *      
	   *      
	   *      
	   *          h)double: used for decimal numbers.
	   *          uses 64 bits in memory. 
	   *          double sal2 = 69,5456.33;
	   *          in decimal part you can use 16 digits.
	   *          
	   *          
	   *
	   *
	   *NON PRIMITIVE DATA TYPES:
	   *        A)String is a non-primitive data type. it is used for words, sentences, paragraphs or multiple characters
	   *        single or multiple characters which are put in double Quotes
	   *        String firstName = "John";	
	   *        String Weather = "It is Hot";
	   *          String initial = "A"; 
	   *          in string you can use anything in between the Double Quotes. 
	   *           String std = "";
	   *           
	   *           
	   *    WHAT IS THE DIFFERENCE BETWEEN PRIMITVE AND NON PRIMITIVE DATA TYPES?
	   *             1) Primitive data type names can be typed by using lower cases.
	   *             but initial of the Non-Primitive data types must be Upper case.
	   *             
	   *             2) in primitive Data types each data types use different amount of memory.
	   *             but for Non Primitive we have fixed amount of memory.
	   *           3) primitive Data types are Created by JAVA , and we cannot create a new primitive data types.
	   *           however we can create non primitive data types.
	   *           
	   *           4) the most important one is: In Primitive Data Types we have just values but for Non-primitive ones
	   *           we have Value and Methods(Functionalities) inside the Memory reserved Area. Functionalities 
	   *           5) Primitive data types are stored in "Stack" memory, while Non-Primitive Data Types are stored in "Heap" memory.
	   *           
	   *           Stack and Heap memory Types.  Stack is Small memory , Heap is Huge memory. 
	   *           Stack keeps Primitive Data Types and stores Reference(address) of the Non Primitive Data Types. 
	   *          
	   *           
	   *            what is the difference between Stack and Heap memory:
	   *            	1) Stack is small, Heap is Huge.
	   *                2) Stack can only store Primitive Data Types and References of Non Primitive Data Types.
	   *                3) Heap can store only Non Primitive Data Types. 
	   *           
	   *           
	   */   
	  
	  
	  
	  
	  //float num = 3.2f;
	  double sal2 = 5456.33;
	  int math = 2+2;
	  String std = ""; // you can leave blank between the double quotes. 
	  String my= "Hello All and is it time to end:)";
	  char mynameinitial = 'J';
	  System.out.println("Java is Easy:) ins");
	  System.out.println(sal2); 
	  System.out.println(mynameinitial); 
	  System.out.println("John Qosimi");
	  System.out.println("Awesome short cut- Syso+ctrl+space");
	  System.out.println("USA- :)");
	  System.out.println("Hello wordl");
	  System.out.println(mynumber); //to print the value of the variable on the console just put name of the variable.
	  System.out.println("Hi");
	  String my5= "Hello All and is it time to end:)";
	  System.out.println(math);
	  System.out.println(my);
	  //int math = 2+2;

  }
}
