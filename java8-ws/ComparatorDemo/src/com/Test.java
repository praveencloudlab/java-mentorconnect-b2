package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Ajai", 34), new Student(102, "James", 44), new Student(103, "Bob", 31),
				new Student(103, "Kiran", 24));
		
		System.out.println(students);
		
		Collections.sort(students,Comparator.comparingInt(Student::getAge));
		System.out.println(students);
		Collections.sort(students,Comparator.comparing(Student::getName));
		System.out.println(students);
		Collections.sort(students,Comparator.comparing(Student::getName).reversed());
		System.out.println(students);
		//==========================================
		

		
		
		
		
		

	}

}
