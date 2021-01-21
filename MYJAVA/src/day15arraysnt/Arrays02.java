package day15arraysnt;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
				
		int a[] = {2,7,1,5};
		int b[] = {1,7,5,2};
		int c[] = {2,7,1,5};
		
		
		System.out.println(Arrays.equals(a, c));//true
		System.out.println(Arrays.equals(a, b));// false
		System.err.println(a==c);
		// how to check if Two Arrays have the same element
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		System.out.println(Arrays.equals(a, b));// if after sorting we are getting True
		// it means Arrays have the same elements.
		System.out.println(Arrays.equals(a,c));

		// one more String method==> split()
		// if you use split method with  char,  char will be omited
		String s ="I like Java but Java needs to study hard to learn so study hard";
		String words[] =s.split(" ");
		System.out.println(Arrays.toString(words));
		
		System.out.println(words.length);
		
		String words2[] =s.split("Java");
		System.out.println(Arrays.toString(words2));
		System.out.println(words2.length);
		
		
		//how many characters are used in string s by using split()?
		String words3[] =s.split("");
		System.out.println(Arrays.toString(words3));
		System.out.println(words3.length);//63
		
		// print the number of characters except the space
		String words4[] = s.replace(" ", "").split("");
		System.out.println(Arrays.toString(words4));
		System.out.println(words4.length);//50
		
	
		
		// count , how many times "a" is used in the String "s"
		String words5[] = s.split("a");
		System.out.println(Arrays.toString(words5));
		System.out.println(words5.length-1);
		// 2nd way
		
		String words6[] = s.split("");
		System.out.println(Arrays.toString(words6));
		int counter = 0;
		for(int i = 0;i<s.length();i++) {
		if(words6[i].equals("a")) {
			counter++;
			
		} 
		}
		System.out.println(counter);
		
		// homework, count the number of occurrence of every character in a string
		
		
		
		
		
		
		

		
		
		
	}

}
