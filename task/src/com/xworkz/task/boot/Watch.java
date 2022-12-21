package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {

	public static void main(String[] args) {

		String name = "Titan";
		String name1 = "Sonata";
		String name2 = "HMT";
		String name3 = "Fastrack";
		String name4 = "Mi";
		
		Collection<String> collec = new ArrayList<String>();
		
		collec.add(name4);
		collec.add(name3);
		collec.add(name2);
		collec.add(name1);
		collec.add(name);
		
		System.out.println("size is " +collec.size());
		
		for(String str:collec) {
			System.out.println(str);
		}
		
		System.out.println("============while loop==============");
		Iterator<String> iterator = collec.iterator();
		while(iterator.hasNext()) {
			String watch = iterator.next();
			System.out.println(watch);
		}
	}
}
