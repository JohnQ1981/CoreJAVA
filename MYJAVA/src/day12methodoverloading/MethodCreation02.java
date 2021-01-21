package day12methodoverloading;

public class MethodCreation02 {

	public static void main(String[] args) {

		add(6,5);
		add(6.0,5);
		System.out.println(multiply(3,5));
		
		
		
		
		int m = 10; 

		int n = 2;

		int sum = 0; 

				

		while(m > n) {

				m--;

				n = n + 2;

				sum = sum + m + n;

		} 

		System.out.println(sum);
		
		
		int i = 1;

		int x = 2;

		while(i < 4){

			  x = x + i;

			  i++;

		}

		System.out.print(x);


	}
// auto widening and explicit narrowing 
	// create2 methods, name them ad,
	// one should add int,
	// other should add double
	public static void add(double n1,double n2) {
		System.out.println(n1+n2);
	}
	
	public static void add(int n1,int n2) {
		System.out.println(n1+n2);
	}
	
	//create multiplication method with two parameters
	// and make the return type double
	// if return type of the methods is different 
	// than void, we must use " return"  keyword
	public static double multiply(double n1, double n2) {
		//System.out.println(n1*n2*3);
		return n1*n2;
	}
	
	
	
	
}
