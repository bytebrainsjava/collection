package com.app.bytebrains;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();
		set.add("Xyz");
		set.add("Java");
		set.add("Jsp");
		set.add("Abc");
		set.add(null);
		System.out.println(set);
	}
}