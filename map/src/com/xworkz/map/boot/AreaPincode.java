package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class AreaPincode {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(560023, "Agrahara");
		map.put(560040, "vijaynagar");
		map.put(560010, "rajajinagar");
		map.put(560041, "jaynagar");
		map.put(560051, "shivajinagar");
		map.put(560050, "srinagar");
		map.put(560004, "basavangudi");
		map.put(560086, "mahalakshmi layout");
		map.put(560060, "kengeri");
		map.put(560098, "rr nagar");

		System.out.println(map.size());
		System.out.println("===============================");
		System.out.println("accessing only keys");
		Set<Integer> set = map.keySet();
		set.forEach(e -> System.out.println(e));

		System.out.println("================================");
		System.out.println("accessing only values");
		Collection<String> collection = map.values();
		collection.forEach(ele -> System.out.println(ele));

		System.out.println("================================");
		System.out.println("accessing key value pair");
		Set<Entry<Integer, String>> entries = map.entrySet();
		entries.forEach(ele -> System.out.println(ele));

	}

}
