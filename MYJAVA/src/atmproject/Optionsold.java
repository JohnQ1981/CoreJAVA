package atmproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Optionsold extends Account {

	Scanner scan = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	HashMap<Integer, Integer> accountNoPin = new HashMap<>();

	public void checkingOperations() {
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Choose from the list operations below: ");
			System.out.println("1:Check Your Balance");
			System.out.println("2:Withdraw");
			System.out.println("3:Deposit");
			System.out.println("4:Exit");
			int option = scan.nextInt();
			if (option == 4) {
				System.out.println("Thank you and Bye Now!");
				break;
			}
			switch (option) {

			case 1:
				System.out.println("Your checking account balance is : " + moneyFormat.format(getCheckingBalance()));
				break;
			case 2:
				if (getCheckingBalance() > 0) {
					getCheckingWithdraw();
				} else {
					System.out.println("When the balance is 0 it is impossible to withdraw");
					System.out.println("You need first deposit...");
				}
				break;
			case 3:
				getDepositChecking();
				break;
			default:
				System.out.println("Invalid option, please select 1,2,3 or 4");
				// checkingOperations();

			}

		} while (true);
	}

	public void savingOperations() {
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Choose from the list operations below: ");
			System.out.println("1:Check Your Balance");
			System.out.println("2:Withdraw");
			System.out.println("3:Deposit");
			System.out.println("4:Exit");
			int option = scan.nextInt();
			if (option == 4) {
				System.out.println("Thank you and Bye Now!");
				break;
			}
			switch (option) {

			case 1:
				System.out.println("Your saving account balance is : " + moneyFormat.format(getSavingBalance()));
				break;
			case 2:
				if (getSavingBalance() > 0) {
					getSavingWithdraw();
				} else {
					System.out.println("When the balance is 0 it is impossible to withdraw");
					System.out.println("You need first deposit...");
				}
				break;
			case 3:

				getDepositSaving();

				break;
			default:
				System.out.println("Invalid option, please select 1,2,3 or 4");
				// checkingOperations();

			}

		} while (true);
	}

	public void selectAccount() {
		do {
			System.out.println("Select option: ");
			System.out.println("1: Checking Account Operations");
			System.out.println("2: Saving Account Operations");
			System.out.println("3: Exit");
			int option = scan.nextInt();
			if (option == 3) {
				System.out.println("Thank you and Bye!");
				break;
			}
			if (option == 1) {
				checkingOperations();
			} else if (option == 2) {
				savingOperations();

			} else {
				System.out.println("Invalid option,Please Select only 1,2, or 3");
			}

		} while (true);

	}

}
