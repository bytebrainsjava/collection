package com.app.bytebrains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComparatorTest {
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		Employee emp1 = new Employee("Sachin", 30);
		Employee emp2 = new Employee("Ram", 40);
		Employee emp3 = new Employee("Ganesh", 20);
		Employee emp4 = new Employee("Abc", 25);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);

		System.out.println("Before Sorting \n" + empList);
		Collections.sort(empList, new SortByName());
		System.out.println("After Sorting \n" + empList);
		System.out.println("*******************************************************");
		System.out.println("Before Sorting \n" + empList);
		Collections.sort(empList, new SortByAge());
		System.out.println("After Sorting \n" + empList);
	}

}
