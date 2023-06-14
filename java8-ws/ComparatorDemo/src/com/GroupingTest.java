package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//import java.util.Map;
import java.util.stream.Collectors;

public class GroupingTest {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			    new Employee("John", "Accounting", "Doe"),
			    new Employee("Jane", "Marketing", "Doe"),
			    new Employee("Bob", "IT", "Smith"),
			    new Employee("Alice", "IT", "Johnson"),
			    new Employee("Charlie", "Sales", "Brown"),
			    new Employee("Dave", "Accounting", "Williams"),
			    new Employee("Eve", "Marketing", "Jones"),
			    new Employee("Frank", "IT", "Taylor"),
			    new Employee("Grace", "Sales", "Anderson"),
			    new Employee("Hank", "Accounting", "Thomas")
			);
		
		
		// employee by depart
		
		//Map<String, List<Employee>> byDepts = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		//System.out.println(byDepts);
		//System.out.println(byDepts.get("Marketing"));
		
		List<Employee> sortByLsstName = employees.stream().sorted(Comparator.comparing(Employee::getLastName)).collect(Collectors.toList());
		System.out.println(sortByLsstName);
		
		String s1="Abc";
		
		//String::toUpperCase();

	}

}
