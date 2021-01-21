package day14staticblockarrays;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		double balance = 5000;
		Scanner scan = new Scanner(System.in);
		
		int a;
		
		do {
			System.out.println("Welcome to Bank of America. What operation you want to perform? \n 1 for Withdraw \n 2 for Deposit \n 3 for checking \n 4 for Exit");
			 a = scan.nextInt();
			atm(a);
			
		}while(a<=4);

		scan.close();

	}
	
	
	public static int atm(int a) {
		double balance =5000;
		Scanner scan = new Scanner(System.in);
		
		switch(a) {
		case 1:
			System.out.println("You choose to Withdraw how much money do you want to withdraw You have available balance of" + balance);
			double withdraw = scan.nextDouble();
			if(balance>withdraw) {
				System.out.println("You can get your "+ withdraw + " money");
				System.out.println("Your new balance is " +(balance-withdraw));
				}
			break;
		case 2:
			System.out.println("You choose to deposit, how much you want to deposit, Your Have available balance of"+ balance );
			double deposit = scan.nextDouble();
			System.out.println("Your total new Balance is $"+ (deposit + balance)+ "dollars");
			break;
		case 3:
			System.out.println("You choose to check your balance");
			System.out.println("Your Balance is " + balance);
			break;
		case 4:
			System.out.println("You choose to exit");
			break;
			default:
				System.out.println("Choose from the list below\n 1 or\n 2 or \n 3 or \n 4 only");
		
		
		
		
		}
			return a;	
		
		
	}

}
