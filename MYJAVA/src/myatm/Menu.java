package myatm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Menu {


	public void bankMenu() {
		//Random accounts= new Random();
		//int accountNum= accounts.nextInt(5);
		//int pinNum= accounts.nextInt(15);
		System.out.println("Welcome to Your ATM:");
		HashMap<Integer,Integer> accountsCreated= new HashMap<>();
		HashSet<Integer> userAccounts= new HashSet<Integer>();
		HashSet<Integer> userPins= new HashSet<Integer>();

		for(int i=0;i<5;i++) {
			Random accounts= new Random();
			int accountNum= accounts.nextInt(500);
			int pinNum= accounts.nextInt(5000);
			accountsCreated.put(accountNum, pinNum);
			userAccounts.add(accountNum);
			userPins.add(pinNum);
		}




		Scanner scan = new Scanner(System.in);
		String exit = "";


		System.out.println("Please Select from Menu below");
		System.out.println("A: Enter Your Account\nB: Enter Your Pin");
		System.out.println(accountsCreated+"<==== HashMap");
		System.out.println("Accounts: "+ userAccounts +"\n"+"User Pins:"+ userPins);
		int userAccount= scan.nextInt();
		int userPin= scan.nextInt();
		if(userAccounts.contains(userAccount) && userPins.contains(userPin)) {
			System.out.println("Account and Pin Verified");
			System.out.println("Select Menu from below:\n 1:Deposit\n2:Withdraw:3:Check Balance:4Exit");
			int uM= scan.nextInt();
			MenuSelect m = new MenuSelect();
			m.menuSec(uM);
		}else {
			System.out.println("Try again");
		}



		scan.close();

	}
}
