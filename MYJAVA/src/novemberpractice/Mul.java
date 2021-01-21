package novemberpractice;

public class Mul {

	void mult(){
		mult(5);

	}




	void mult(int input){

		mult(input, 1, 10);

	}
	void mult(int input, int from , int to){

		for(int i=from ; i<=to; i++) {

			System.out.printf("%d * %d = %d", input,i,input*i).println();

		}
	}

	int sum(int a, int b) {
		return a+b;
	}

}
