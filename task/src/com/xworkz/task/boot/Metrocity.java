package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Metrocity {

	public static void main(String[] args) {

		String city1 = "bangalore";
		String city2 = "mumbai";
		String city3 = "delhi";
		String city4 = "kolkata";
		String city5 = "hyderabad";
		
		Collection<String> collection = new ArrayList<String>();
		
		collection.add(city5);
		collection.add(city3);
		collection.add(city1);
		collection.add(city4);
		collection.add(city2);
		
		System.out.println("size is : " +collection.size());
		
		for (String string : collection) {
			System.out.println(string);
		}
		
		Iterator<String> iterator = collection.iterator();
		
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
			
		}
	}
}
