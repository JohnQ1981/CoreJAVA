package day10dowhileloop;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
		 type a code do while loop
		 to print odd integers
		 between 0 and 100
		 
		 
		 */
		int i= 0;
		
		do {
			if(i%2!=0) {
			System.out.println("ODD number"+ i);
			}
			else {
				System.out.println("Even number"+i);
			}
			i++;
		} while(i<=100);
		/*
		for the String "1234_?!abcdef" type a
		code to count number of letter and
		number of digits
		and number of others
		
		 * 
		 */
		String s = "!!!21234_?!abcssdefA";
		s = s.trim().toUpperCase();
				int j = 0;
				int lc= 0;
				int dc = 0;
				int oc = 0;
		do {
			boolean isLetter =(s.charAt(j)>='A' && s.charAt(j)<='Z');
			boolean isDigit = (s.charAt(j)>='0' && s.charAt(j)<='9');
			boolean isFigure = !isLetter && !isDigit; 		
					if(isLetter) {
				lc++;
			}
			if(isDigit) {
				dc++;
			}
			if(isFigure) {
				oc++;
			}
			
			j++;
		} while(j<s.length());
		System.out.println("number of letter"+ lc);
		System.out.println("Number of digits"+dc);
		System.out.println("Number of other Chars"+oc);
		

	}

}
