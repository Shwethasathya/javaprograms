package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ChacolateRunner {

	public static void main(String[] args) {

		Map<String, Double> map = new HashMap<String, Double>();

		map.put("kinder joy", 45d);
		map.put("Dairymilk", 30d);
		map.put("kitkat", 10d);
		map.put("munch", 5d);
		map.put("perk", 10d);
		map.put("temptation", 100d);
		map.put("ferrero roncher", 144d);
		map.put("snickers", 20d);
		map.put("milkybar", 15d);
		map.put("eclairs", 1d);
		
		System.out.println(map.size());
		System.out.println("===============================");
		System.out.println("accessing only keys");
		Set<String> set = map.keySet();
		set.forEach(e -> System.out.println(e));

		System.out.println("================================");
		System.out.println("accessing only values");
		Collection<Double> collection = map.values();
		collection.forEach(ele -> System.out.println(ele));

		System.out.println("================================");
		System.out.println("accessing key value pair");
		Set<Entry<String, Double>> entries = map.entrySet();
		entries.forEach(ele -> System.out.println(ele));

	}

}
