package datime;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InterViewQuestion {

	public static void main(String[] args) {



		String names3[] = {"Ava", "Emma", "Olivia"};
		String names4[]= {"Olivia", "Sophia", "Emma"};
		System.out.println(Arrays.toString(names3));
		System.out.println(Arrays.toString(names4));

		int tL= names3.length+ names4.length;

		String allNames[] = new String[tL];
		Set<String> narrndp= new HashSet<>();
		Set<String> neres= new HashSet<String>();
		noDup(names3,names4,neres);
		System.out.println("-------");
		String str = Arrays.toString(names3);
		String str2= Arrays.toString(names4);
		System.out.println(str+ str2+ " ==> this si coming from string");


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
