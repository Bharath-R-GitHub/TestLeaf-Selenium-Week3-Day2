package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(3);
		set.add(2);
		set.add(11);
		set.add(4);
		set.add(6);
		set.add(7);
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(set);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println("The Second Largest Element is " + list.get(1));
	}
}
