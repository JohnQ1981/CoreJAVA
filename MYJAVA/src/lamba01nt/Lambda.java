package lamba01nt;

import java.util.Arrays;
import java.util.Scanner;

public class Lambda {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Strings ");
		String s;
		String s2;
		isAnagram(s = scan.next(), s2 = scan.next());

	}

	public static void isAnagram(String s1, String s2) {

		if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty()) {
			System.out.println("They are not Anagram Strings, Try again");
		} else {
			String a1[] = s1.toLowerCase().split("");
			Arrays.sort(a1);
			String a2[] = s2.toLowerCase().split("");
			Arrays.sort(a2);
			if (Arrays.equals(a1, a2)) {
				System.out.println(s1 + " and " + s2 + " are Anagrams");
			} else {
				System.out.println("They are not Anagram Strings");
			}
		}

	}

}

