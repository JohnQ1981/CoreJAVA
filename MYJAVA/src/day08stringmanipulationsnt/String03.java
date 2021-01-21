package day08stringmanipulationsnt;
import java.util.Scanner;
public class String03 {

	public static void main(String[] args) {
		/*
		Ask user to enter a password
		1)Remove all spaces from the password
		2)Make the first character uppercase 'A' 
		3)Make the last 2 characters '*'
		check if password is at least 6 character
		4)Then give the password to the user
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Password");
		
		String psw = scan.nextLine().trim();
		
		if(psw.length()>5) {
		
		//psw.trim();
		psw = psw.replace(psw.charAt(0), 'A');
		//psw = psw.replace(psw.substring(psw.length()-2), "**");
		//psw = psw.replace(psw.charAt(psw.length()-1), '*');
		//psw = "A" + psw;
		psw=psw.substring(0, psw.length()-5)+"*****";
		//psw.replace(psw.charAt(psw.length()-1), '*');
		//String newp = psw;
		//System.out.println(psw.replace(psw.charAt(0), 'A').replace(psw.charAt(psw.length()-1), '*'));
		System.out.println(psw);
		
		}
		else {
			System.out.println("enter password at least with 6 chars");
			
		}
		scan.close();
		
		
		

	}

}
