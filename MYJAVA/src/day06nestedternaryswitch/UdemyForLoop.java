/**
 * 
 */
package day06nestedternaryswitch;

/**
 * @author IK
 *
 */
public class UdemyForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
		for(i=1;i<=10;i++) {
			
			System.out.printf("%d*%d==%d",5,i,5*i).println();
			
		}

		int b;
		for(b=1;b<=10;b++) {
			System.out.printf("%d*%d==%d",6,b,6*b).println();
			
		}
		
		int d;
		int table=1;
		for(d=1; d<=10;d++) {
			System.out.printf("%d*%d==%d",table,d,table*d).println();
			table++;
		}
		
		int e;
		for(e=10;e>=0;e--)
		{
			System.out.printf("%d-- ",e);
			
		}
		int f;
		for(f=1;f<=10;f++)
		{
			System.out.printf("%d --- ",f);
			
		}
		int g;
		for(g=1;g<=10;g++) {
			System.out.printf("%d-" , g*g).println();
			
		}
		
		int h;
		for(h=1;h<=10;h++) {
			if(h%2==0) {
				System.out.println("Square of Even numbers between 1 and 10 "+h+"\" square is "+ h*h);
			}
			else if(h%2!=0) {
				System.out.println("Square of odd numbers between 1 and 10 "+h+"\" square is "+ h*h);
				
			}
			
		}
		
	}

}
