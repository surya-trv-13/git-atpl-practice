package com.aaslin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class IntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1 -  o2;
	}
	
}

public class ComapratorDemo {
	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<Integer>();
		list.add(2);
		list.add(20);
		list.add(200);
		list.add(2000);
		list.add(20000);
		list.add(200);
		list.add(299);
		
		System.out.println(list);
		
//		list.sort(null);
//		
//		System.out.println("natual Order:" + list);
		
		IntegerComparator integerComparator = new IntegerComparator();
		
		list.sort(integerComparator);
		
		System.out.println("Integer Comaparator:"+list);
		
		//2nd Way
		list.sort(Comparator.reverseOrder());
		
		System.out.println("Reverse Order:" + list);
		
		//3rd
		
		list.sort(integerComparator);
		
		
	}
	
	
	
}

