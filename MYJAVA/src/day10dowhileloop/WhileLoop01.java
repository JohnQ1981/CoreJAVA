package day10dowhileloop;
import java.util.Scanner;
public class WhileLoop01 {

	public static void main(String[] args) {
		/*
		1)Create a class. name it as "WhileLoop01"
		2)Ask user to get the number of the rows to create the following image
		For example; if user enters 5 the image 
		*1
		**2
		***3
		****4
		*****5
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int num=scan.nextInt();
		
		int i=0;
		  if(num<=0) {
			  System.out.println("Enter greater than 0");
		  }
		  else {
			  
			  
		while(i<num) {
			
			for(int n=i; n>=0;n--) {
				
				System.out.print("*");
			}
			i++;
			System.out.println(i);
			
			//i++;
			
		}
		  }
		scan.close();
		
		
	}

}
