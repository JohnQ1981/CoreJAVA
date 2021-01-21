package lambda04;

public class YorkinsSolution {

	public static void main(String [] args)
	{
		//		int i=5;
		//		String A1="* ";
		//		String A2="  ";
		//		for(int a=1; a<i; a++ ) {
		//			if(a==1) {
		//				System.out.println(A1);
		//				}
		//			if(a==(i-1)) {
		//				System.out.println(A1.repeat(i));
		//				}
		//			else {
		//				System.out.println(A1+A2.repeat(a-1)+A1);
		//				}
		//		}
		rT(7);

	}	


	public static void rT(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print("*");
			if(i>1) {
				for (int j = 0; j < i -2; j++) {

					if(i == num )
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
