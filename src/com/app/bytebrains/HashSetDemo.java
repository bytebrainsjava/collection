package com.app.bytebrains;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("Java");
		set.add("Spring");
		set.add("Hibernate");
		set.add(null);
		set.add(null);
		System.out.println(set);
		Collections.synchronizedSet(set);
	}
}
