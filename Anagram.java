package week3.day2.assignments;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length() != text2.length()) {
			System.out.println(text1.toUpperCase() + " and " + text2.toUpperCase() + " is not an Anagram");
		} else {
			boolean flag = true;
			char[] char1 = text1.toLowerCase().toCharArray();
			char[] char2 = text2.toLowerCase().toCharArray();
			Arrays.sort(char1);
			Arrays.sort(char2);
			for (int i = 0; i < text1.length(); i++) {
				if (char1[i] == char2[i]) {
					continue;
				} else {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(text1.toUpperCase() + " and " + text2.toUpperCase() + " is an Anagram");
			} else {
				System.out.println(text1.toUpperCase() + " and " + text2.toUpperCase() + " is not an Anagram");

			}
		}
	}
}
