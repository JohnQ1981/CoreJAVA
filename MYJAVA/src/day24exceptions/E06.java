package day24exceptions;

import java.io.FileInputStream;

public class E06 {
		/*
		 	In Java some Exceptions are Compile Time Exceptions
		 	itmes when you type code Java will inform you about the Exceptions
		 	by putting red underline
		 	Compile Time Exceptions: FileNotFoundException, IOException
		 	other name for Compile Time Exception is Checked Exception
		 		
		 		
		 	
		 	but for Run time Exceptions you have to run the code
		 	to see Run time Exceptions: 
		 	Run Time Exception: ArithmeticException: ArrayIndexOutOfBoundsException
		 						NullPointerException, IllegalArgumentException, ClassCastException
								NumberFormatException
			other name for Run Time Exception is UnChecked Exception
 				
 				
 			Note: YOU HAVE TO HANDLE CHECKED EXCEPTIONS BEFORE YOU TYPE NEXT CODES
 			BY THROWING EXCEPTIONS OR BY USING TRY CATCH BLOCK.	
 			But for Unchecked Exceptions if you do not type anything JAVA will throw exception
 			in Run Time
 
		 */
	public static void main(String[] args) {
		//FileNotFoundException : compile Time Exception
		//FileInputStream fis = new FileInputStream("src/day24exceptions/TextFile");
		
		//ArithmeticException: Run Time Exception
		try {
		System.out.println(12/0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		  String s = "123";
		  //IF YOU TRY TO CONVERT A STRING WHICH HAS AT LEAST ONE NON DIGIT CHARACTERS
		  // BY USING parseInt() YOU WILL GET " NumberFormatException" 
		  String s2="123s";
		  int i = Integer.parseInt(s) ;
		  System.out.println(Integer.parseInt(s));//123
		  System.out.println(i+2);//125
		  
		  try {
		  System.out.println(Integer.parseInt(s2));
		  }catch(NumberFormatException e) {
			  e.getMessage();
			  System.out.println(" NumberFormatException "+e.getMessage());
			  //e.printStackTrace();
		  }
		
		
	}

}
