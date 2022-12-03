package com.app.bytebrains;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();
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
