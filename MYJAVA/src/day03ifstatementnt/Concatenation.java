package day03ifstatementnt;

public class Concatenation {

	public static void main(String[] args) {
		/*
		 Concatenation: it joins two or more strings
		 concatenate means join string
		 adding string means : Concatenation
		 */
		
		String s = "Java";
		String t = "is easy";
		System.out.println(s +" "+ t);
		
		int a = 2;
		int b = 3;
		String c = "A";
		//
		System.out.println(c+a+b);  
		
		System.out.println(c+(a+b));
		System.out.println(a+c+b);//concatenation
			
		System.out.println(a+b+c);
		
		int d = 2;
		int e = 3;
		String f = "Java";// by using d, e and f Print 61Java-1
		 System.out.println((((d*e))*10)+1+f+"-1");
		 System.out.println((d*e)*(d+e)*d+(e-d)+f+(d-e));
		 
		 //int t=4;
		 //int h = 5;
		// String str5 = "Ali";
		 //System.out.println(str5 + (t+h));
				

	}

}
