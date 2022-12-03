package com.app.bytebrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "ABC");
		map.put(20, "XYZ");
		map.put(40, "ABC");
		map.put(50, "MNO");
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(100, "abc");
		map2.put(200, "xyz");
		map2.put(400, "zbc");
		map2.put(500, "mno");
		map2.putAll(map);
		
		System.out.println(map2);
	}
}
