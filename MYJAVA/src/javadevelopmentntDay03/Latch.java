package javadevelopmentntDay03;

import java.util.concurrent.CountDownLatch;

public class Latch {

	public static void main(String[] args) {

		CountDownLatch latch = new CountDownLatch(4);
		ThreadCreator2 thread1 = new ThreadCreator2(latch);
		ThreadCreator2 thread2 = new ThreadCreator2(latch);
		ThreadCreator2 thread3 = new ThreadCreator2(latch);
		ThreadCreator2 thread4 = new ThreadCreator2(latch);


		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		System.out.println("First Code inside the main method");
		System.out.println("Second Code inside the main method");
		//		System.out.println("Third  Code inside the main method");
		//		System.out.println("Fourth  Code inside the main method");
		try {
			latch.await();// await() makes the codes different from threads waits for the threads
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
class ThreadCreator2 extends Thread{

	private CountDownLatch latch;
	public ThreadCreator2 (CountDownLatch latch) {
		this.latch = latch;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " Thread is running");
		System.out.println(Thread.currentThread().getName()+ " Thread execution stopped");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		//System.out.println("===================");
		latch.countDown();
	}
}