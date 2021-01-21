package javadevelopmentntDay03;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {

	static public int counter =1;

	public static void main(String[] args) {

		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer> (10);
		Producer1 producer = new Producer1(queue);
		Thread producerThread = new Thread(producer);
		producerThread.start();

		Consumer1 consumer = new Consumer1(queue);
		Thread consumerThread = new Thread(consumer);
		consumerThread.start();



	}

}
class Producer1 implements Runnable{
	private ArrayBlockingQueue<Integer> queue;


	public Producer1(ArrayBlockingQueue<Integer> queue) {

		this.queue = queue;
	}


	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				queue.put(BlockingQueue.counter);
				System.out.println("Value of counter variable is added to the queue "+queue.toString()+ BlockingQueue.counter);
				BlockingQueue.counter++;
			} catch (InterruptedException e) {

				e.printStackTrace();
			}


		}

	}

}

class Consumer1 implements Runnable{
	private ArrayBlockingQueue<Integer> queue;

	public Consumer1(ArrayBlockingQueue<Integer> queue) {

		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				queue.take();
				BlockingQueue.counter--;
				System.out.println("Value of counter variable is removed from the queue "+queue.toString()+ BlockingQueue.counter);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
