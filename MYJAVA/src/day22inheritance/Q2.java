package day22inheritance;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s= "";

		String arr[] = {"Ali", "Veli","Deli","Celi"};
		String arr2[] = {"Orman","corba","torba","HelloWordls"};
		
		int i = arr.length;
		int b = arr2.length;
		
		if(i == b) {
			System.out.println("Arrays have the same number of elements");
		}
		
		System.out.println(Arrays.equals(arr, arr2));//
		
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		String arr3[] = new String[arr.length];
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(arr2));
		
		for(int i2 =arr.length-1;i2>=0;i2--) {
			
			//arr3[i2]= arr3[i2]+arr[i2];
			arr3[i2]= arr[i2];
			
		}
		System.out.println(Arrays.toString(arr3));
		
		//System.out.println(arr.);
		
		System.out.println(Arrays.binarySearch(arr2,"corba"));
		//System.out.println(Arrays.binarySearch(arr2,0));
		
		
		int arr4[] = {5,0,-1,0,13};
		
		int min = Integer.MAX_VALUE;
		int max = arr4[0];
		int arr5[] = new int[arr4.length];
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));
		int sum =0;
		for(int j = arr4.length-1;j>=0;j--) {
			if(min>= arr4[j]) {
				min =arr4[j];
				
				if(max<=arr4[j]) {
					max=arr4[j];
				}
			}
			sum = sum+ arr4[j];
			arr5[j]= arr5[j]+arr4[j];
			System.out.println(arr4[j]);
		}
		System.out.println(" Max " +max);
		System.out.println(" Minimum " +min);
		System.out.println("Sum is :" + sum);
		System.out.println(Arrays.toString(arr5));

		System.out.println("Enter size of the array");
		int t = scan.nextInt();
		
		String arr6[] = new String[t];
		
		for(int y= 0; y<t;y++) {
			System.out.println("Enter Strings to be in the Array");
			arr6[y]= scan.next().trim();
		}
		System.out.println(Arrays.toString(arr6));
		
		System.out.println("Now lets print it in opposite order");
		String arr7[] = new String[arr6.length];
		int g=0;
		for(int h=arr6.length-1;h>=0;h--) {
			
			arr7[g]=arr7[g]+arr6[h];
			System.out.println(arr6[h]);
			g++;
		}
		System.out.println(Arrays.toString(arr7));
		
		String a[]= {"Ahmet","Can","Mehmet"};
		int l=0;
		for(int k=a.length-1;k>=0;k--) {
			a[l]=a[l]+a[k];
			l++;
		}
		System.out.println(Arrays.toString(a));
		
	}

}
