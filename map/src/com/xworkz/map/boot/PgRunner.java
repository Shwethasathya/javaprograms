package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PgRunner {

	public static void main(String[] args) {

		Map<String, Double> map = new HashMap<String, Double>();

		map.put("Lakshmi", 4500d);
		map.put("royal", 6000d);
		map.put("sree durga", 5500d);
		map.put("gravity", 5000d);
		map.put("durgaparameshwari", 4500d);
		map.put("mallikarjuna", 4500d);
		map.put("lahari", 7000d);
		map.put("spandana", 4500d);
		map.put("maruthi", 5400d);
		map.put("balaji", 3500d);
		map.put("luxury", 4500d);

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
