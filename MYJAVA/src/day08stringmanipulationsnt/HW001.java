/**
 * 
 */
package day08stringmanipulationsnt;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class HW001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int i;
for(i=10;i<=75;i++) {
System.out.println("The number is "+i);	
}


for(int j=100;j>=43;j--) {
	
	//System.out.println(j%2);
	if(j%2==0) {
		System.out.print(j+" ");
	}
}
System.out.println();
for(int k=200;k>=33;k--) {
	
	if(k%2!=0) {
		System.out.print(k+" ");
	}
}
System.out.println();
int r=0;
for(int t=24; t<=57;t++) {
	r = r+t;
}
		System.out.println(r);
		double m = 1;
for(double l=7;l<=10;l++) {
	m = m*l;
}
System.out.println(m);
		
	int cd = 0;
	for(int a=200;a>=5;a--) {
		if(a%5==0) {
			cd++;
			System.out.print(a+" divisible by 5 ");
		}
		
	}
	System.out.println();
	System.out.println(cd);
	System.out.println();
		
	int y= 1;	
	while(y<=5) {
		System.out.print(y+ " ");
		y++;
	}
	System.out.println();
	int w = 30;
	
	while(w>=0){
		if(w%2!=0) {
			System.out.print(w+" ");
			
		}
		w--;
	}
	System.out.println();
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter an Integer");
	int h = scan.nextInt();
	
	int mr= 0;
	while(mr<=10) {
		
		System.out.println(h+"multiplied by"+mr+" is"+mr*h);
		mr++;
	}
	System.out.println(mr);
	
	
	System.out.println("Enter an Integer");
	int o = scan.nextInt();
	int fac= 1;
	int fr= 1;
	while(fac<=o) {
		
		fr= fr*fac;
		
		fac++;
	}
	System.out.println("Factorial of "+ o+"!:" + " is = " +fr);
	
	
	System.out.println("enter Integer to find factors");
	int i2 = scan.nextInt();
	int i3 = 1;
	
	while(i3<=i2) {
		if(i2%i3==0) {
			
			System.out.println("Factors are "+i3);
		}
		if(i2%i3!=0) {
			System.out.println("These are non "+i3);
		}
		i3++;
	}
	
	
	
	
	
	
	scan.close();
	}

}
