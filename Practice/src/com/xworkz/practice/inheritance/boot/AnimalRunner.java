package com.xworkz.practice.inheritance.boot;

import com.xworkz.practice.inheritance.child.Dog;
import com.xworkz.practice.inheritance.thing.Animal;

public class AnimalRunner {

	public static void main(String[] args) {
	
		Dog dog = new Dog();
		
		System.out.println("accessing methods of child and oparent class from child class");
		dog.eat();
		dog.sound();
		
		System.out.println("accessing from parent class");
		Animal animal = new Animal();
		animal.sound();
		
	}

}
