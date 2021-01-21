package day22inheritance;

import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		String a[]= {"Ahmet","Can","Mehmet"};
		String a3[]= {"Ahmet","Can","Mehmet"};
		String r[]= new String[a.length];
		
		for(int k=a.length-1;k>=0;k--) {
			
			r[a.length-1-k]=a[k];
			
			
		}
				
		System.out.println(Arrays.toString(r));
		
		
		String a2[]= new String[a3.length];
		
		for(int r1 = 0; r1<a.length;r1++) {
			a2[r1]= a3[a3.length-1-r1];
		}
		//System.out.println(Arrays.toString(a2));

	}

}
