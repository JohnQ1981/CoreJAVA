package myatm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuSelect {
	List<Integer> userAccountDeposit= new ArrayList<>();
	List<Integer> userAccountWithdraw= new ArrayList<>();
	List<Integer> userAccountBalance= new ArrayList<>();
	Scanner scan = new Scanner(System.in);

	public void menuSec(int m) {




		switch (m){
		case(1):
			System.out.println("Enter How much you want to Deposit");
		int deposit=scan.nextInt();
		userAccountDeposit.add(deposit);
		System.out.println("Deposit Sucess,Your balance is $"+ userAccountDeposit);
		break;
		case(2):
			System.out.println("Lest Check Your Balance First");
		int balance=userAccountDeposit.get(0)-userAccountWithdraw.get(0);
		System.out.println("Your Current balance"+ balance);
		if(balance<=0) {
			System.out.println("You cannot withdraw");

		}else if(balance>=0){
			System.out.println("You can withdraw only "+ balance + "amount of dollars");
		}
		break;
		case(3):
			System.out.println("Third Day");
		break;
		case(4):
			System.out.println("Fourth Day");
		break;


		default: System.out.println("Enter Only 1-2-3-4 Name");


		}
	}


}
