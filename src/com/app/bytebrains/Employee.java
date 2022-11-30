package com.app.bytebrains;

public class Employee implements Comparable<Employee>{
	String name;
	int age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	public int compareTo(Employee emp) {
		return this.name.compareTo(emp.name);
	}

}
