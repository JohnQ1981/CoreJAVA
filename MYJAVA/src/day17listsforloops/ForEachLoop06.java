package day17listsforloops;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachLoop06 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer and i will create multi dim"
				+ "ensional array");
		
		int a = scan.nextInt();
		
		int ma[][] = new int[a][a];
		
		for (int i= 0; i<a;i++) {
			
			for(int j=0; j<ma[i].length;j++) {
			ma[i][j]= a;	
			System.out.print(ma[i][j]);
			}
		}
		System.out.print(Arrays.deepToString(ma));

	}

}
