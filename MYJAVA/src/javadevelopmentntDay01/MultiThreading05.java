package javadevelopmentntDay01;

public class MultiThreading05 {

	public static void main(String[] args) throws InterruptedException {

		long startingTime02 = System.currentTimeMillis();
		Brackets2 bracket = new Brackets2();
		//bracket.generateBrackets();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i =1;i<=5; i++) {
					bracket.generateBrackets();
				}

			}

		});
		thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i =1;i<=5; i++) {
					bracket.generateBrackets();
				}
			}

		});
		thread2.start();
		thread1.join();
		thread2.join();
		long endingTime02 = System.currentTimeMillis();
		//System.out.println("Duration of Synchronized "+(endingTime02-startingTime02));//3199
		System.out.println("Duration of Synchronized Block "+(endingTime02-startingTime02));//1611

	}

}


class Brackets2{

	public void generateBrackets() {
		synchronized(this) {
			for(int i=0; i<=10; i++) {
				if(i<=5) {
					System.out.print("[");
				}else {
					System.out.print("]");
				}

			}
			System.out.println();
		}



		for(int i=0; i<=5; i++) {

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}
}