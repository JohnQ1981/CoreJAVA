package day26exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sumof1dArray {

	public static void main(String[] args) {
		 int nums[] = {1,2,3,4};
	        int sum = 0;
	        boolean r= true;
	        int ls=0;
	        
	        List<Integer> list = new ArrayList<>();
	        List<Integer> list2 = new ArrayList<>();
	        Scanner scan =new Scanner(System.in);
	        
	       
	        System.out.println("Enter size of the List");
	        ls=scan.nextInt();
	        System.out.println("Now Enter Elements of the List integer");
	        for(int l = 0; l<=ls; l++) {
	        	list2.add(scan.nextInt());
	        }
	        System.out.println("Your List is"+ list2);
	        for(int k = 0; k<nums.length;k++){
	            
	            sum = sum + nums[k];
	            list.add(k);
	        }
	        System.out.println("The sum of the 1d array is: " + sum);
	        System.out.println(list);
	        List<Integer> list1 = new ArrayList<>();
	        for(int i = list.size()-1;i>=0;i--) {
	        	list1.add(list.get(i));
	        }
	        
	        System.out.println(list1);
	}

}
