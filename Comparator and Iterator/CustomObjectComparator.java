package com.aaslin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class ComparatorStudent implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getAge() - o2.getAge() > 0) {
			return 1;
		} else if(o1.getAge() - o2.getAge() < 0 ) {
			return -2;
			
		}else {
//			return o1.getName().compareTo(o2.getName());
			
			return 0;
		}
		
//		return o1.getAge() - o2.getAge();
	}
	
}

public class CustomObjectComparator {
	public static void main(String[] args) {
		Student studentA = new Student("Shyam", 23);
		Student studentB = new Student("Murali", 23);
		Student studentC = new Student("Varma", 53);
		Student studentD = new Student("Preneet", 13);
		Student studentE = new Student("Gautam", 3);
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(studentA);
		students.add(studentD);
		students.add(studentC);
		students.add(studentB);
		students.add(studentE);
		
		
//		System.out.println(students);
//		
//		// Java 8
//		Comparator<Student> comparator = Comparator
//				.comparing(Student::getAge)
//				.thenComparing(Student::getName);
//				
		students.sort(null);
		
		System.out.println(students);
	}
}
