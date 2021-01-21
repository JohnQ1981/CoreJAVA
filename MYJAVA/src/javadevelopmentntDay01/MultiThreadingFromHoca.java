package javadevelopmentntDay01;



public class MultiThreadingFromHoca {

	public static void main(String[] args) throws InterruptedException {

		long startingTime01 = System.currentTimeMillis();
		CounterWithoutMultiThread12 counter1 = new CounterWithoutMultiThread12(1);
		CounterWithoutMultiThread12 counter2 = new CounterWithoutMultiThread12(2);

		counter1.countMe();
		System.out.println("=======================");
		counter2.countMe();
		long endingTime01 = System.currentTimeMillis();
		System.out.println(endingTime01 - startingTime01);

		System.out.println("*******************************");

		long startingTime02 = System.currentTimeMillis();
		CounterWithMultiThread123 counter3 = new CounterWithMultiThread123(1);
		CounterWithMultiThread123 counter4 = new CounterWithMultiThread123(2);

		counter3.start();
		System.out.println("================");
		counter4.start();

		//Thread.sleep(5000); // ==> To make Java wait for printing the duration of execution sleep() can be used but it is not good
		//     practice. Instead of using sleep() we can use join() method.

		counter3.join();
		counter4.join();

		long endingTime02 = System.currentTimeMillis();
		System.out.println(endingTime02-startingTime02);

	}

}

class CounterWithoutMultiThread12{

	private int threadNum;

	public CounterWithoutMultiThread12(int threadNum) {
		this.threadNum = threadNum;
	}

	public void countMe() {
		for(int i=1; i<=9; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i=" + i + " Thread Number:" + threadNum);
		}
	}

}

class CounterWithMultiThread123 extends Thread{

	private int threadNum;

	public CounterWithMultiThread123(int threadNum) {
		this.threadNum = threadNum;
	}

	public void countMe() {
		for(int i=1; i<=9; i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i= " + i + " Thread Number: " + threadNum );
		}
	}

	@Override
	public void run() {
		countMe();
	}

}