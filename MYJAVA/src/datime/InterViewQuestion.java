package datime;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InterViewQuestion {

	public static void main(String[] args) {



		String test = "abc";
		test = test + test;
		System.out.println(test);

		System.out.println("&&&&&&&&&&&&&");
		for(int i = 1; i < 3; i++)
			for(int j = 3; j >= 1; j--)
				assert i!=j : i; 
		int x,y;
		x = 3 & 5;
		y = 3 | 5;
		System.out.println(x + " -----" + y);

		System.out.println("------------------------");
		for(int i = 1; i < 4; i++)
			for(int j = 1; j < 4; j++)
				if(i < j)
					assert i!=j : i; 

		int I = '1';
		System.out.println(I);
		short s = 28;
		System.out.println(s);
		System.out.println("(((((((((((((((((((");
		int i=0;
		do {
			i++;
		}
		while(i < 0);
		System.out.println(i);

		String kl="Ikram Can";
		System.out.println(kl.indexOf("Ikram")+"<======>");
		byte xp = 3;
		xp = (byte)~xp;
		System.out.println(xp);

		String names3[] = {"Ava", "Emma", "Olivia"};
		String names4[]= {"Olivia", "Sophia", "Emma"};
		System.out.println(Arrays.toString(names3));
		System.out.println(Arrays.toString(names4));
		Arrays.sort(names3);
		int tL= names3.length+ names4.length;

		String allNames[] = new String[tL];
		Set<String> narrndp= new HashSet<>();
		Set<String> neres= new HashSet<String>();
		noDup(names3,names4,neres);
		System.out.println("-------");
		String str = Arrays.toString(names3);
		String str2= Arrays.toString(names4);
		System.out.println(str+ str2+ " ==> this si coming from string");
		int o , j;
		o = j = 3;
		int n = 2 * ++o;
		int m = 2 * j++;
		System.out.println(o + " " + j + " " + n + " " + m);

		String jh= "John";
		String q0= "Qosimi";

		String mn=jh+" "+ q0;
		System.out.println(mn);


	}
	public static  void noDup(String n[], String n2[], Set<String> neres) {

		for(int j=0;j<n.length;j++) {
			neres.add(n[j]);
		}
		for(int l=0;l<n2.length;l++) {
			neres.add(n2[l]);
		}
		System.out.println(neres);


	}

}
