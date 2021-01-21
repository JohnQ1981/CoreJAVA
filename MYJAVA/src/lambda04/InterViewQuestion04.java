package lambda04;

import java.util.Scanner;

public class InterViewQuestion04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("*");
		int line=1;
		int count =0;
		int side = 10;
		System.out.println("*");
		for(int i=1;i<side;i++){
			line =2*i-1;
			if(i<=line) {
				System.out.print("*");
				for(int k=0;k<line; k++) {
					if(i<side-1) {
						System.out.print(" ");
					}else if(i==side-1) {
						System.out.print(" *");
						count++;
						if(count==side-1) {
							break;

						}
					}
				}
				if(count<side-1) {
					System.out.println("*");
				}
			}


		}
		System.out.println();
	}

}
