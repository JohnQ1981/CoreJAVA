package projectatmnt;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

	private int accountNumber;
	private int pinNumber;
	private double checkingBalance;
	private double savingBalance;
	Scanner scan = new Scanner(System.in);

	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}

	// Withdraw from checking account
	public double withdrawFromChecking(double amount) {

		checkingBalance = checkingBalance - amount;

		return checkingBalance;
	}

	// Withdraw from saving account
	public double withdrawFromSaving(double amount) {

		savingBalance = savingBalance - amount;

		return savingBalance;
	}

	// Deposit to Checking Account
	public double depositToChecking(double amount) {
		checkingBalance = checkingBalance + amount;
		return checkingBalance;
	}

	//// Deposit to Saving Account
	public double depositToSaving(double amount) {

		savingBalance = savingBalance + amount;

		return savingBalance;
	}

	public void getCheckingWithdraw() {
		System.out.println("Your Checking Account Balance is: " + moneyFormat.format(getCheckingBalance()));
		System.out.print("Please enter the amount you want to withdraw: ");
		double amount = scan.nextDouble();
		if (amount <= 0) {
			System.out.println("Amount cannot be less than or equal to $0");
			getCheckingWithdraw();// recursive call
		} else if (checkingBalance >= amount) {
			withdrawFromChecking( amount);
			System.out.println("The amount you withdrew is: "+ moneyFormat.format(amount));
			System.out.println("Your remaining balance is: " + moneyFormat.format(getCheckingBalance()));
		}else {
			System.out.println("No enough balance in your checking account");
			getCheckingWithdraw();// recursive call
		}


	}

	public void getSavingWithdraw() {
		System.out.println("Your saving account balance: " + moneyFormat.format(getSavingBalance()));
		System.out.print("Please, enter the amount you want to withdraw: ");
		double amount = scan.nextDouble();
		if (amount <= 0) {
			System.out.println("Amount cannot be less than or equal to 0");
			getSavingWithdraw();// recursive call
		} else if (savingBalance >= amount) {
			withdrawFromSaving(amount);
			System.out.println("The amount you withdrew is " + moneyFormat.format(amount));
			System.out.println("Remaining balance is " + moneyFormat.format(getSavingBalance()));
		} else {
			System.out.println("Not enough money in your saving account...");
			getSavingWithdraw();// recursive call
		}
	}

	public void getDepositChecking() {
		System.out.println("Your Checking Account Balance is: " + moneyFormat.format(getCheckingBalance()));
		System.out.print("Please enter the amount you want to deposit: ");
		double amount = scan.nextDouble();
		if (amount <= 0) {
			System.out.println("Amount cannot be less than or equal to 0");
			getDepositChecking();// recursive call

		} else {
			depositToChecking(amount);
			System.out.println("The amount you deposited is " + moneyFormat.format(amount));
			System.out.println("Your New balance is " + moneyFormat.format(getCheckingBalance()));
		}
	}

	public void getDepositSaving() {
		System.out.println("Your Saving Account Balance is: " + moneyFormat.format(getSavingBalance()));
		System.out.print("Please enter the amount you want to deposit: ");
		double amount = scan.nextDouble();
		if (amount <= 0) {
			System.out.println("Amount cannot be less than or equal to 0");
			getDepositSaving();// recursive call

		} else {
			depositToSaving(amount);
			System.out.println("The amount you deposited is " + moneyFormat.format(amount));
			System.out.println("Your New balance is " + moneyFormat.format(getSavingBalance()));
		}

	}

}

