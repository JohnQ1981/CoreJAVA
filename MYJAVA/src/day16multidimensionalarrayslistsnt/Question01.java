package day16multidimensionalarrayslistsnt;

import java.util.Arrays;
import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {

String s = "I like Java but Java needs to study hard to learn so study hard";
		
		String words[] = s.split(" ");
		System.out.println(Arrays.toString(words));//[I, like, Java, but, Java, needs, to, study, hard, to, learn, so, study, hard]
		System.out.println(words.length);//14
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String s2 = scan.nextLine();
		
		String st[] = s2.split("");
		
		
		Arrays.sort(st);
		
		System.out.println(Arrays.toString(st));
		
		int counter =0;
		//int c2=0;
		for(int i=1; i<st.length; i++) {
			
			if(st[i-1].equals(st[i])) {
				counter++;
				
			}else {
				System.out.println("The number of "+ st[i-1]+" is "+ (counter+1));
			    counter =0;
			}
			
			if(i==st.length-1) {
				
				System.out.println("The number of "+ st[i]+" is "+ (counter+1));
				
			}
			//if(st[i].equals("a")) {
				//c2++;
				
			//}
			
		}
		//System.out.println(counter);
		
		
		

	}

}
