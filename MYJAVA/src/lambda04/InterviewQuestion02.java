package lambda04;

import java.util.ArrayList;
import java.util.List;

public class InterviewQuestion02 {

	public static void main(String[] args) {

		int arr[]= {4,5,7,11,9,13,8,12,16,10};

		List <Integer> list = new ArrayList<>();

		for(int i=0;i<arr.length;i++ ) {

			list.add(arr[i]);
		}
		System.out.println(list);
		int sum = 0;
		for(int j =0; j<list.size();j++) {
			System.out.println(list.get(j));
			sum = sum + list.get(j);
			//			if(sum==20) {
			//				System.out.println(list.indexOf(j));
			//				System.out.println(sum);
			//			}else {
			//				continue;
			//			}

		}
		System.out.println(sum);
		int x =20;
		findPairs(arr,x);


	}
	public static void findPairs(int arr[], int x) {
		for(int k=0;k<arr.length;k++) {
			for(int h=k+1;h<arr.length;h++) {
				if(arr[k]+arr[h]==x) {
					System.out.println(arr[k]+ "+"+arr[h]+"+"+"="+x);
				}
			}
		}

	}


}
