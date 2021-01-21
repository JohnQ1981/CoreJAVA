package novemberpractice;

public class Runner {

	public static void main(String[] args) {


		Mul table = new Mul();

		//table.mult();
		//table.mult(3);
		table.mult(6);
		table.mult(6, 1, 10);
		System.out.println(table.sum(4, 6));
		table.sum(4, 6);
	}

}
