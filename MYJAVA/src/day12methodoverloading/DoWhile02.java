package day12methodoverloading;
import java.util.Scanner;
public class DoWhile02 {

	public static void main(String[] args) {
		/*
		Ask user to enter his/her first name
		 If the initial is lower case print a message like
		  �Make the initial upper case�
		 If the initial is upper case 
		 print a message like �You did it right�
		
		
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter your first name");
		System.out.println("Enter your first name");
		
		char init = 'c';
		
		do {
			 init = scan.next().charAt(0);
			
			if(init >='A' && init <= 'Z') {
				System.out.println("Yo did it Right");
			}else {
				System.out.println("Enter one more time\nMake initial Uppercase");
			}
			
			
		}while(!(init >='A'&& init <='Z'));
		
		
		scan.close();

	}

}
