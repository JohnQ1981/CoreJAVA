package lambda04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LambdaQ01 {

	public static void main(String[] args) {
		/*
		 Type program that counts the number of every word in a string
		 Example: "Ali, do you know Ali. Ali said you know him"



		 */

		List <String> list = new ArrayList<>();

		String st="Ali, do you know Ali. Ali said you know him";
		String arr[] = new String[st.length()];
		System.out.println(st.length());
		String ch[] = st.split(" ");
		st =st.trim();
		System.out.println(st);
		//Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));

		int counter = 0;

		for(int i = 1; i< ch.length; i++) {

			if(ch[i-1].equals(ch[i])) {
				counter++;
			}else {

				System.out.println("The number of " + ch[i-1] + " is: " + (counter + 1));
				counter = 0;

			}
			if(i==ch.length-1) {

				System.out.println("The number of " + ch[i] + " is: " + (counter + 1));
			}
		}




	}

}
