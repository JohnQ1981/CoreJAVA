package day17listsforloops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ForEachLoop03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		 boolean isTrue = false;
		 List<String> str = new ArrayList<>();
		 do {
			 System.out.println("Enter a String");
			 String s = scan.nextLine().toLowerCase();
			 String ch[] = s.split("");
			 //str.add(scan.nextLine());
			
			 System.out.println(Arrays.toString(ch));
			 int aCount = 0;
			 int eCount =0;
			 int iCount =0;
			 int oCount = 0;
			 int uCount = 0;
			 for(String w: ch) {
				 switch(w) {
				 case "a":
					 aCount++;
					break;		
				 case "e":
					 eCount++;
					break;		
				 case "i":
					 iCount++;
					break;		
				 case "o":
					 oCount++;
					break;		
				 case "u":
					 uCount++;
					break;		
				 
				 }
			 }
			  System.out.println("The Number of a " + aCount);
			  System.out.println("The Number of e " + eCount);
			  System.out.println("The Number of i " + iCount);
			  System.out.println("The Number of o " + oCount);
			  System.out.println("The Number of u " + uCount);
			 
		 }while(isTrue!=true);
		 
		
		
		

	}

}
