package com.app.bytebrains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author ByteBrainsTechnology
 *
 */
public class ListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ABC");
		list.add("MNO");
		list.add("PQR");
		list.add("XYZ");

		// Using for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// Using For each
		for (String element : list) {
			System.out.println(element);
		}

		// By Using Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// It returns an index of first occurrence of passed object.
		System.out.println(list.indexOf("MNO"));
		
		// Checks whether this collection has specified element.
		System.out.println(list.contains("MNO"));
		
		// Checks whether this collection is empty or not. If collection is empty, it
		// returns true otherwise it returns false
		System.out.println(list.isEmpty());
		
		// Returns the number of elements in this collection
		System.out.println(list.size());

		// How do you convert an ArrayList to Array?
		Object[] arr = list.toArray();
		for (Object obj : arr) {
			System.out.println(obj);
		}

		// How to reverse an ArrayList?
		Collections.reverse(list);
		System.out.println(list);

	}
}
