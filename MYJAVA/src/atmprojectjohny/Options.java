package atmprojectjohny;

import java.util.Scanner;

public class Options extends Accounts{
	Scanner scan = new Scanner(System.in);
	public void checkingOperations() {
		do {

			System.out.println("Select option:");
			System.out.println("1:View Balance");
			System.out.println("2:Withdraw");
			System.out.println("3:Deposit");
			System.out.println("4:Exit");
			int option= scan.nextInt();
			if(option==4) {
				System.out.println("Goodbye, Thanks");
				break;
			}

			switch(option) {
			case 1:
				System.out.println("Your Balance is "+ getCheckingAccount());
				break;
			case 2:
				if(getCheckingAccount()>0) {
					checkingWithdrawAccount();

				}else {
					System.out.println("No enough balance, please deposit first");
				}
				break;

			case 3:
				depositToCheckingAccount();
				break;
			default:
				System.out.println("Please only select 1, 2, 3 or 4 .");
			}



		}while(true);
	}

	// saving operations
	public void savingOperations() {

		do {
			System.out.println("Select option:");
			System.out.println("1:View Balance");
			System.out.println("2:Withdraw");
			System.out.println("3:Deposit");
			System.out.println("4:Exit");
			int option= scan.nextInt();
			if(option==4) {
				System.out.println("Goodbye, Thanks");
				break;
			}
			switch(option) {
			case 1:
				System.out.println("Your Current Balance of Saving Account is "+ getSavingAccount());
				break;
			case 2:
				if(getSavingAccount()>0) {
					withdrawSavingAccount();

				}else {
					System.out.println("You do not have enough funds, deposit first. Your balance is "+ getSavingAccount());
				}
				break;
			case 3:
				depositToSavingAccount();


			}



		}while(true);

	}



}
