package week3.day2.assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int count = 0, i = 0, j = 0;
		String duplicate = "", output = "";
		List<Integer> list = new ArrayList<Integer>();
		list.add(14);
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(15);
		list.add(14);
		list.add(18);
		list.add(16);
		list.add(17);
		list.add(19);
		list.add(18);
		list.add(17);
		list.add(20);
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int li : list) {
			set.add(li);
		}
		Set<Integer> duplicates = new LinkedHashSet<Integer>();
		for (i = 0; i < list.size(); i++) {
			for (j = 0; j < list.size(); j++) {
				if (i != j && list.get(i) == list.get(j)) {
					count++;
				}
			}
			if (count > 0) {
				duplicates.add(list.get(i));
			}
			count = 0;
		}
		List<Integer> dup = new ArrayList<Integer>();
		dup.addAll(duplicates);
		for (i = 0; i < duplicates.size(); i++) {
			duplicate = duplicate + dup.get(i) + " ";
		}
		List<Integer> out = new ArrayList<Integer>();
		out.addAll(set);
		for (i = 0; i < set.size(); i++) {
			output = output + out.get(i) + " ";
		}
		System.out.println("The Duplicate Elements are " + duplicate.trim());
		System.out.println("The List without Duplicates " + output.trim());
	}
}
