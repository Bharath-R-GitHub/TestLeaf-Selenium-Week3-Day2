package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
public static void main(String[] args) {
	int length=0;
	String output="";
	List<Integer> list1=new ArrayList<Integer>();
	list1.add(3);
	list1.add(2);
	list1.add(11);
	list1.add(4);
	list1.add(6);
	list1.add(7);
	List<Integer> list2=new ArrayList<Integer>();
	list2.add(1);
	list2.add(2);
	list2.add(8);
	list2.add(4);
	list2.add(9);
	list2.add(7);
	if(list1.size()<=list2.size()) {
		length=list1.size();
	}
	for(int i=0;i<length;i++) {
		if(list1.get(i)==list2.get(i)) {
			output=output+list1.get(i)+" ";
		}
	}
	System.out.println("The Intersection Elements are "+output.trim());
}
}
