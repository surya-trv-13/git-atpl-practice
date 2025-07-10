package com.aaslin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.length() - o1.length();
	}
	
}


public class ComparatorStirngJava {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Shyam");
		list.add("Jerusha");
		list.add("Harika");
		list.add("Surya");

		list.add("Gyanesh");

		list.add("Aditya");

		list.add("Aditya Murali");
		
		list.sort(null);
		
		System.out.println(list);
		
		list.sort(new StringComparator());
		
		System.out.println("Length Sort::"+ list);

		
	}
}
