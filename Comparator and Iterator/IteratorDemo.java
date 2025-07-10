package com.aaslin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Shyam");
		list.add("Jerusha");
		list.add("Harika");
		list.add("Surya");

		list.add("Gyanesh");

		list.add("Aditya");

		list.add("Aditya Murali");
		
//		for(String name: list) {
//			System.out.println(name);
//		}
//		
		
		Iterator<String> iterator = list.iterator();
				while(iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				
				
				
				ListIterator<String> listIterator = list.listIterator();
				while(listIterator.hasNext()) {
					listIterator.set("Surya");
					System.out.println(listIterator.next());
				}
				
				
	}

}
