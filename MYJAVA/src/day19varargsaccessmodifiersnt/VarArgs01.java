package day19varargsaccessmodifiersnt;
//day19varargsaccessmodifersnt


public class VarArgs01 {

	/*
	 * 
	 * 1) if you want a method to run
	 * with different number of arguments,
	 * you can use "varargs"  (Variable Arguments)"
	 * 2) "varargs" can run from 0 argument to infinite
	 * arguments. no limits.
	 * 3) "varargs" should be the last argument inside the method
	 * 4) in a method as a parameter you can use just one "varargs"
	 * if you use more than one "varargs" at least one of them will not be
	 * the last element , this is 
	 * conflict with the third rule.
	 * 
	 * 
	 */


	public static void main(String[] args) {
		add();
		add(3);
		add(3,5,7,5,5,5);
		con("*","John","Can", "Mary");
		con("1","TG");

		m(5,6,7,8);
		m(11,12);
		//m(2);

	}

	//	public static void add(int a, int b) {
	//		
	//		System.out.println(a+b);
	//		
	//	}
	//	
	//	
	//public static void add(int a, int b , int c) {
	//		
	//		System.out.println(a+b+c);
	//		
	//	}

	public static void add(int... a) {
		int sum = 0;

		for(int w: a) {
			sum= sum+w;
		}

		System.out.println(sum);
	}

	public static void con(String x,String...  b) {

		String sum="";
		for(String w: b) {
			//x++;
			sum=sum+w+x;
		}
		System.out.println(sum);
	}


	public static void m(int x, int y, int ... z) {

		System.out.println(z.length);

	}




}
