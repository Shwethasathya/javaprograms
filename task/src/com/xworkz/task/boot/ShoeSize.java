package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {

	public static void main(String[] args) {

		int size1 = 8;
		int size2 = 9;
		int size3 = 10;
		int size4 = 11;
		int size5 = 12;
		int size6 = 13;
		int size7 = 14;
		int size8 = 15;
		int size9 = 5;
		int size10 = 6;
		int size11 = 7;
		int size12 = 4;
		int size13 = 3;
		int size14 = 1;
		int size15 = 2;

		
		Collection<Integer> collection = new ArrayList<Integer>();
		
		collection.add(size1);
		collection.add(size2);
		collection.add(size3);
		collection.add(size4);
		collection.add(size5);
		collection.add(size6);
		collection.add(size7);
		collection.add(size8);
		collection.add(size9);
		collection.add(size10);
		collection.add(size11);
		collection.add(size12);
		collection.add(size13);
		collection.add(size14);
		collection.add(size15);
		
		System.out.println("size is :" +collection.size());
		
		for (Integer integer : collection) {
			System.out.println(integer);
		}
		
		Iterator<Integer> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Integer animal = iterator.next();
			System.out.println(animal);
		
			
		}
		
		
	}

}
