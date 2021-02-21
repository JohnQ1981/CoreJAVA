package atmprojectjohny;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Accounts {

	private double checkingAccount;
	private double savingAccount;
	Scanner scan = new Scanner(System.in);


	public double getCheckingAccount() {
		return checkingAccount;
	}
	public void setCheckingAccount(double amount) {
		this.checkingAccount = amount;
	}
	public double getSavingAccount() {
		return savingAccount;
	}
	public void setSavingAccount(int savingAccount) {
		this.savingAccount = savingAccount;
	}

	public void verifyAccountandPin() {
		HashMap<Integer,Integer> accountsCreated= new HashMap<>();
		HashSet<Integer> userAccounts= new HashSet<Integer>();
		HashSet<Integer> userPins= new HashSet<Integer>();
		Scanner scan= new Scanner(System.in);

		for(int i=0;i<5;i++) {
			Random accounts= new Random();
			int accountNum= accounts.nextInt(500);
			int pinNum= accounts.nextInt(5000);
			accountsCreated.put(accountNum, pinNum);
			userAccounts.add(accountNum);
			userPins.add(pinNum);
		}
		do {
			System.out.println("Welcome to Your Bank please Select \n1: For Checking Account\n2: for Saving Account\n3: To Exit");
			int mainselect=scan.nextInt();
			if(mainselect ==3) {
				System.out.println("Bye and come back soon...");
				break;
			}
			if(mainselect==1) {
				System.out.println(userAccounts+" <==User Accounts are\n and Pins are===>"+ userPins);
				System.out.println("enter account and pin");
				int account =scan.nextInt();
				int pin = scan.nextInt();
				if(userAccounts.contains(account)&& userPins.contains(pin)) {
					System.out.println("Thanks for verification now you can continue with your Checking account");
					Options st= new Options();
					st.checkingOperations();

				}else
				{
					System.out.println("Try the account and pin again");
					verifyAccountandPin();
				}


			}if(mainselect==2) {
				System.out.println(userAccounts+" <==User Accounts are\n and Pins are===>"+ userPins);
				System.out.println("enter account and pin");
				int account =scan.nextInt();
				int pin = scan.nextInt();
				if(userAccounts.contains(account)&& userPins.contains(pin)) {
					System.out.println("Thanks for verification now you can continue with your Saving account");
					Options st= new Options();
					st.savingOperations();
				}else
				{
					System.out.println("Try the account and pin again");
					verifyAccountandPin();
				}


			}else {
				verifyAccountandPin();
			}
		}while(true);
		/*
 if(mainselect!=1 || mainselect !=2) {
			System.out.println("Select 1 or two Only");
			verifyAccountandPin();
		}else
		 */

	}	  

	//withdraw from Checking
	public double withdrawFromChecking(double amount) {
		checkingAccount=checkingAccount-amount;
		return checkingAccount;

	}
	//withdraw from Saving
	public double withdrawFromSaving(double amount) {
		savingAccount=savingAccount-amount;
		return savingAccount;
	}

	//deposit to checking
	public double depositToChecking(double amount) {
		checkingAccount=checkingAccount+amount;
		return checkingAccount;
	}

	//deposit to saving
	public double depositToSaving(double amount) {
		savingAccount=savingAccount+amount;
		return savingAccount;
	}
	//withdraw from checking Account
	public void checkingWithdrawAccount() {
		System.out.println("Your Current balance in Checking Account is $ "+ getCheckingAccount());
		System.out.println("Enter Amount you want to withdraw");
		double amount = scan.nextDouble();
		if(amount<=0) {
			System.out.println("You cannot Withdraw 0 or less, try again...");
			checkingWithdrawAccount(); //recursive call
		}else if(checkingAccount>=amount) {
			withdrawFromChecking(amount);
			System.out.println("The Amount you withdrew is:$"+ amount);
			System.out.println("The Remaining Current Balance is:$ "+ getCheckingAccount());

		}else {
			System.out.println("You do not have enough funds to withdraw");
			checkingWithdrawAccount();//recursive call
		}

	}
	// withdraw savings Account
	public void withdrawSavingAccount() {
		System.out.println("Your Current balance inSaving account is $:"+ getSavingAccount());
		System.out.println("Enter Amount you want to withdraw");
		double amount =scan.nextDouble();
		if(amount <=0) {
			System.out.println("You cannot withdraw 0 or less, try again...");
			withdrawSavingAccount();//recursive call
		}else if(savingAccount>=amount) {
			withdrawFromSaving(amount);
			System.out.println("The amount you withdrew is:$ "+ getSavingAccount());
		}else {
			System.out.println(" You do not have enough funds to withdraw from saving account");
			withdrawSavingAccount();
		}
	}



	//  deposit to checking
	public void depositToCheckingAccount() {
		System.out.println("You current balance is "+ getCheckingAccount());
		System.out.println("How Much you want to Deposit?");
		double amount = scan.nextDouble();
		if(amount<=0) {
			System.out.println("You cannot deposit 0 or less, try againg");
			depositToCheckingAccount();//recursive call

		}else {
			depositToChecking(amount);
			System.out.println("Your new Current balance is "+ getCheckingAccount());
		}
	}

	//deposit to saving
	public void depositToSavingAccount() {
		System.out.println("Your Current Saving account balance is "+ getSavingAccount());
		System.out.println("How Much you want to deposit?");
		double amount = scan.nextDouble();
		if(amount<=0) {
			System.out.println("You cannot depost 0 or less, try again...");
			depositToSavingAccount();//recursive call

		}else {
			depositToSaving(amount);
			System.out.println("Your new Current balance is "+ getSavingAccount());
		}
	}


}
