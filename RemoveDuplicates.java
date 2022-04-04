package week3.day2.assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		String output = "";
		Set<String> set = new LinkedHashSet<String>();
		for (String word : words) {
			set.add(word);
		}
		List<String> list = new ArrayList<String>();
		list.addAll(set);
		for (int i = 0; i < set.size(); i++) {
			output = output + list.get(i);
			if (i < set.size() - 1) {
				output = output + " ";
			}
		}
		System.out.println(output);
	}
}