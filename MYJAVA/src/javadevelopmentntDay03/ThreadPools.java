package javadevelopmentntDay03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPools {

	public static void main(String[] args) {

		ExecutorService executorService =  Executors.newFixedThreadPool(2);

		ThreadCreator thread1 =  new ThreadCreator("Thread1");
		ThreadCreator thread2 =  new ThreadCreator("Thread2");
		ThreadCreator thread3 =  new ThreadCreator("Thread3");
		ThreadCreator thread4 =  new ThreadCreator("Thread4");
		ThreadCreator thread5 =  new ThreadCreator("Thread5");
		ThreadCreator thread6 =  new ThreadCreator("Thread6");
		ThreadCreator thread7 =  new ThreadCreator("Thread7");
		ThreadCreator thread8 =  new ThreadCreator("Thread8");
		ThreadCreator thread9 =  new ThreadCreator("Thread9");
		ThreadCreator thread10 =  new ThreadCreator("Thread10");

		//		thread1.start();
		//		thread2.start();
		//		thread3.start();
		//		thread4.start();
		//		thread5.start();
		//		thread6.start();
		//		thread7.start();
		//		thread8.start();
		//		thread9.start();
		//		thread10.start();
		executorService.execute(thread1);
		executorService.execute(thread2);
		executorService.execute(thread3);
		executorService.execute(thread4);
		executorService.execute(thread5);
		executorService.execute(thread6);
		executorService.execute(thread7);
		executorService.execute(thread8);
		executorService.execute(thread9);
		executorService.execute(thread10);

		executorService.shutdown();


	}

}

class ThreadCreator extends Thread{

	private String threadName;

	public ThreadCreator(String threadName) {

		this.threadName = threadName;
	}

	@Override
	public void run() {
		System.out.println(threadName+ " has started to run");
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(threadName+ " stopped running");
	}


}