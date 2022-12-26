package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AnimalsRunner {

	public static void main(String[] args) {
		
		String animal1 = "dog";
		String animal2 = "cow";
		String animal3 = "donkey";
		String animal4 = "tiger";
		String animal5 = "lion";
		String animal6 = "elephant";
		String animal7 = "cat";
		String animal8 = "horse";
		String animal9 = "hippopotamas";
		String animal10 = "fox";
	
	Collection<String> pets = new ArrayList<String>();
	pets.add(animal10);
	pets.add(animal5);
	pets.add(animal6);
	pets.add(animal1);
	pets.add(animal4);
	pets.add(animal3);
	pets.add(animal9);
	pets.add(animal2);
	pets.add(animal7);
	pets.add(animal8);
	pets.add(animal10);
	
	System.out.println("size is : " +pets.size());
	
	for (String string : pets) {
		System.out.println(string);
	}
	
	Iterator<String> iterator = pets.iterator();
	
	System.out.println("===============================");
	while (iterator.hasNext()) {
		String animal = iterator.next();
		System.out.println(animal);
	
		
	}
	
	
	}
}
