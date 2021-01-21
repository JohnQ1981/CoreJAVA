package day18Practice;
import java.util.Arrays;
import java.util.Scanner;
public class Question05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean isTrue=false;
		int i=0;
		
		do {
			System.out.println("Enter an number of elements you want to have in the Array");
			i = scan.nextInt();
			int arr[] = new int[i];
			int k=0;
			for(int j = 0; j<i;j++) {
				
				System.out.println("Enter An element for the Array, it should be integer");
				k= scan.nextInt();
				arr[j]=k;
				
			}
			System.out.println("Enter Two digist to check if your array has those");
			int a= scan.nextInt();
			int b = scan.nextInt();
			for(int v=0;v<arr.length;v++) {
				for(int h =0;h<arr.length;h++) {
				if(arr[v]==a && arr[h] ==b) {
					System.out.println("We found both of them and it is: " +a+ " or " + b);
				}
				 
				
						
			}
			}
			
			System.out.println("Your Array is \n");
			System.out.println(Arrays.toString(arr));
		}while(isTrue!=true);
		
		scan.close();

		
		
		
		

	}

}
