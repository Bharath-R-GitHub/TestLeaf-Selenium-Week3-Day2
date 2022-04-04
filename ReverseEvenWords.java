package week3.day2.assignments;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		String output = "";
		String[] words = test.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (i % 2 != 0) {
				char[] ch = words[i].toCharArray();
				String word = "";
				for (int j = ch.length - 1; j >= 0; j--) {
					word = word + ch[j];
				}
				output = output + word;
			} else {
				output = output + words[i];
			}
			if (i < words.length - 1) {
				output = output + " ";
			}
		}
		System.out.println(output);
	}
}
