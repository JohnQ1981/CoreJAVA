package day17listsforloops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachLoop02 {
	/*
	 * 
	 * get 10 names, get initials and concatenate and then
	 * Store them in a list and print on the console
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		List<String> names = new ArrayList<>();
			int c=0;
		do {
			
			System.out.println("Enter"+(c+1)+"." +"full name");
			
			names.add(scan.nextLine());
			
			c++;
		}while(c<5);
		
		System.out.println(names);
		List<String> initials = new ArrayList<>();
		// how to get initials.
		for(String w: names) {
			
			initials.add(""+w.charAt(0) + w.charAt(w.indexOf(" ")+1));
			
		}
		System.out.println(initials);
		scan.close();
	}

}
