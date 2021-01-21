package javadevelopmentntDay03;

public class WaitInterrupt {

	static double balance =0;

	public static void main(String[] args) {

		WaitInterrupt obj= new WaitInterrupt();
		//WaitNotify obj = new WaitNotify();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				obj.withdraw(800);


			}

		});
		thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				obj.deposit(2000);
				thread1.interrupt();


			}

		});
		thread2.start();



	}


	public void withdraw(double amount) {
		synchronized(this) {
			if(balance<=0 || balance <amount) {
				try {
					System.out.println("Wait is working-waiting for the Balance Update");
					wait();
				} catch (InterruptedException e) {

					//balance= balance-amount;
					System.out.println("Exception is caught");
					balance= balance-amount;
					System.out.println("Withdrawal is successful and the current balance is "+ balance);
					//e.printStackTrace();
				}

			}
			//balance= balance-amount;
			//System.out.println("Withdrawal is successful and the current balance is "+ balance);
		}


	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("The amount is being deposited.Your new Balance is: " + balance);


	}

}
