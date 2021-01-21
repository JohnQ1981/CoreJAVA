package javadevelopmentday04;

import java.util.concurrent.ForkJoinPool;

public class UnderstandingDeadLock {

	public static void main(String[] args) {

		System.out.println(ForkJoinPool.commonPool());
		String lock1 = "lock1";
		String lock2 = "lock2";

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {

				synchronized(lock1) {
					System.out.println("I am in thread-1 on lock1");
					synchronized(lock2) {
						System.out.println("I am in thread-1 on lock2");
					}

				}

			}

		});
		thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				synchronized(lock2) {
					System.out.println("I am in thread-2 on lock1");
					synchronized(lock1) {
						System.out.println("I am in thread-2 on lock2");
					}

				}

			}

		});
		thread2.start();
	}

}