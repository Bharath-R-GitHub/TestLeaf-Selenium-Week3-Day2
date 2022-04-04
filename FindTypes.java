package week3.day2.assignments;

public class FindTypes {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] ch = test.toCharArray();
		for (int i = 0; i < test.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;
			} else if (Character.isDigit(ch[i])) {
				num++;
			} else {
				specialChar++;
			}
		}
		System.out.println("Letters = " + letter);
		System.out.println("Spaces = " + space);
		System.out.println("Numbers = " + num);
		System.out.println("Special Characters = " + specialChar);
	}
}
