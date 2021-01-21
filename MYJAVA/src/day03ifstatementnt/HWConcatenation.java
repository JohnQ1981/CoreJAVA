package day03ifstatementnt;

public class HWConcatenation {

	public static void main(String[] args) {
		
		String str1 = "Learn" + "Java";
		System.out.println(str1);
		
		String str2 = "Learn" + " " + "Java";
		System.out.println(str2);
		
		String str3 = "Learn " + "Java";
		System.out.println(str3);
		
		String str4 = "2" + "5";
		System.out.println(str4);
		
		String str5 = 2 + 3 +"4";
		System.out.println(str5);
		
		String str6 = "2" + (5+1);
		System.out.println(str6);

		
		int numA = 2;
		int numB = 3;
		String st1 = "Study";
		String st2 = "Hard";
		System.out.println(st1 + " " + st2);
		System.out.println(numA + numB + " " + st2 );
		System.out.println(st2+numA+numB);
		System.out.println(st2+(numB-numA));
		
		int n2 = 2;
		int n3 = 3;
		String st3 = "Study"; 
		String st4 = "Hard";
		System.out.println((n2*n3)*(n3+n2)*n2+(n3-n2) +" "+st3+(n2-n3));
		
		
		
	}

}
