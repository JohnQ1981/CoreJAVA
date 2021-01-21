package javadevelopmentntDay01;

public class MultiThread06 {

	public static void main(String[] args) {

		Brackets3 bracket1 = new Brackets3();
		Brackets3 bracket2 = new Brackets3();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {

				for(int i=1; i<10;i++) {
					bracket1.generateBrackets("thread1");
				}
				System.out.println("thread1 is completed");
			}

		});
		thread1.start();


		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				for(int i=1; i<10;i++) {
					bracket2.generateBrackets("thread2");
				}
				System.out.println("thread2 is completed");
			}

		});
		thread2.start();






	}

}

class Brackets3{

	/*
	 1)if you use different objects in different threads, sometimes you may get different
	 outputs in every execution.
	 2)to solve this issue, we use static synchronization.
	 the steps to apply the static synchronization are:
	 	a) Type 'synchronized static' before access modifier 
	 	b) Create a parameter for the Method
	 	c) When you call the method use arguments.
	 * */
	synchronized static public void generateBrackets(String threadName) {
		for(int i=0; i<=10; i++) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			if(i<=5) {
				System.out.print("[");
			}else {
				System.out.print("]");
			}

		}
		System.out.println("Thread executed: "+ threadName);
	}
}
