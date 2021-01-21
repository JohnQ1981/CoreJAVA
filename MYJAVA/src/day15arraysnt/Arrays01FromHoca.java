package day15arraysnt;

import java.util.Arrays;

public class Arrays01FromHoca {

	public static void main(String[] args) {
		// Create an array which has 4 integer elements with first way
		int a[] = new int[4];//[0, 0, 0, 0]
		a[0]=14;
		a[1]=12;
		a[2]=13;
		a[3]=11;
		System.out.println(Arrays.toString(a));
		
		//How to put elements in ascending order
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//Type a program to add all elements in the array "a"
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum: " + sum);
		
		
		//Create a char array which has 6 elements with second way
		char b[] = {'a', 'd', 'A', 'b', 'c', 'D'};
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		//Type a program to concatenate the elements in the array "b"
		String concat = "";
		for(int i=0; i<b.length; i++) {
			concat = concat + b[i];
		}
		System.out.println("Concatenated: " + concat);
		
		String c[] = {"Ali", "John", "ALI", "Brad", "Mary", "Angie"};
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);//[ALI, Ali, Angie, Brad, John, Mary]
		System.out.println(Arrays.toString(c));
		//Print the elements whose indexes are even on the console.
		for(int i=0; i<c.length; i++) {
			if(i%2==0) {
				System.out.print(c[i] + " ");
			}
		}
		
		//How to check if a specific element exists in the array or not
		
		//To check if an element exists in an array or not we use "binarySearch()"
		//Be Careful!!! ==> Before using "binarySearch()" method you HAVE TO use sort()
		//If you use "binarySearch()" without using sort(), you will get a result but 
		//it will not be meaningful
		
		int d[] = {3, 5, 2, 12, 4, 3, 6};
		//Check if 12 exists in the array "d"
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));//[2, 3, 3, 4, 5, 6, 12]
		//binarySearch() returns NON NEGATIVE values if the element exists
		System.out.println(Arrays.binarySearch(d, 12));//6
		//If the element does not exist, you will get NEGATIVE number. Negative sign displays
		//non-existance, the number displays the order number if the element exists
		System.out.println(Arrays.binarySearch(d, 9));//-7
		System.out.println(Arrays.binarySearch(d, 15));//-8
		//binarySearch() method cannot be used repeated elements, you can get some output but
		//it is not meaningful
		System.out.println(Arrays.binarySearch(d, 3));

	}

}