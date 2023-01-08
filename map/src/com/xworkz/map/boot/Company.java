package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Company {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("google", "gmail");
		map.put("amazon", "amazon software");
		map.put("meta", "instagram");
		map.put("microsoft", "microsoft office");
		map.put("IBM", "watson assistant");
		map.put("flipcart", "shopping software");
		map.put("oracle", "SQL");
		map.put("firefox", "mozilla firefox");
		map.put("videoLan", "VLC media player");
		map.put("Hcl", "appscan");

		System.out.println(map.size());
		System.out.println("===============================");
		System.out.println("accessing only keys");
		Set<String> set = map.keySet();
		set.forEach(e -> System.out.println(e));

		System.out.println("================================");
		System.out.println("accessing only values");
		Collection<String> collection = map.values();
		collection.forEach(ele -> System.out.println(ele));

		System.out.println("================================");
		System.out.println("accessing key value pair");
		Set<Entry<String, String>> entries = map.entrySet();
		entries.forEach(ele -> System.out.println(ele));

	}

}
