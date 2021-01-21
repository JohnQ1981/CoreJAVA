package javadevelopmentntDay03;



import java.util.concurrent.CountDownLatch;

public class LatchFromHoca {
	/*
	 * 1) if you want to run all threads before the other non-thread coded in main method
	 * use latch.
	 * 2) when we use latch, we need to use 2 methods, await() and countDown() methods.
	 * await()==> it makes non-thread codes in main method wait for the thread execution.
	 * countDown()==> it counts the threads , if all the threads are executed then non-thread codes
	 * will execute without any more wait.
	 * 3) await()==> should be used just after the thread start() methods. do not put await() after the non thread code.
	 * it should be before non-thread codes.
	 * 
	 * countDown()==> should be used inside the run() method. 
	 * 
	 * 
	 * 
	 * */

	public static void main(String[] args) {

		CountDownLatch latch = new CountDownLatch(4);

		ThreadCreator3 thread1 = new ThreadCreator3(latch);
		ThreadCreator3 thread2 = new ThreadCreator3(latch);
		ThreadCreator3 thread3 = new ThreadCreator3(latch);
		ThreadCreator3 thread4 = new ThreadCreator3(latch);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		try {
			latch.await();//await() makes the codes different from threads wait for the threads
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("First code inside the main method");
		System.out.println("Second code inside the main method");



	}

}

class ThreadCreator3 extends Thread{

	private CountDownLatch latch;

	public ThreadCreator3(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " thread is running");
		System.out.println(Thread.currentThread().getName() + " thread execution stopped");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		latch.countDown();

	}
}
