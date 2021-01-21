package javadevelopmentntDay01;

public class MultiThreading02 {

	public static void main(String[] args) throws InterruptedException {

		long startingTime01 = System.currentTimeMillis();

		Thread thread1 =new Thread(new CounterMultiThread(1));
		Thread thread2 =new Thread(new CounterMultiThread(2));
		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();
		long endingTime01 = System.currentTimeMillis();
		System.out.println("Duration of thread1 and thread2 "+(endingTime01-startingTime01));


		// this way is used more to achieve multi-threading 
		long startingTime02 = System.currentTimeMillis();
		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1 ; i<=9; i++) {

					System.out.println("i= " + i + " Thread Number = 3");

				}

			}

		});
		thread3.start();

		Thread thread4 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1 ; i<=9; i++) {

					System.out.println("i= " + i + " Thread Number = 4");

				}

			}

		});
		thread4.start();
		thread3.join();
		thread4.join();
		long endingTime02 = System.currentTimeMillis();
		System.out.println("Duration of thread3 and thread4 "+(endingTime02-startingTime02));

	}

}

class CounterMultiThread implements Runnable{
	private int threadNumber;

	public CounterMultiThread(int threadNumber) {

		this.threadNumber = threadNumber;
	}
	@Override
	public void run() {

		for(int i=1 ; i<=9; i++) {

			System.out.println("i= " + i + " Thread Number = "+ threadNumber);

		}

	}



}