package com.app.bytebrains;

import java.util.Comparator;

public class SortByAge implements Comparator<Employee>{
	
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.age>emp2.age)
			return 1;
		else if(emp1.age<emp2.age)
			return -1;
		else
			return 0;
	}

}
