package com;

public class Employee {

	private String name;
	private String department;
	private String lastName;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String department, String lastName) {
		super();
		this.name = name;
		this.department = department;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", lastName=" + lastName + "]";
	}

}
