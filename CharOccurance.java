package week3.day2.assignments;

import java.util.Scanner;

public class CharOccurance {
	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		System.out.println("Enter the Character for which the Occurances need to be found");
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == input) {
				count++;
			}
		}
		if (count != 0) {
			System.out.println("The Character " + input + " is having " + count + " Occurances in the String " + str);
		} else {
			System.out.println("The Character " + input + " is not Available in the String " + str);
		}
		sc.close();
	}
}
