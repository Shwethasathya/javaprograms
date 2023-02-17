package com.xworkz.programs;

public class Flower {

	static int quantity = 5;// static variable
	String name = "jasmin";// instance variable

	public static void main(String[] args) {

		double price = 30; // local variable
		// System.out.println(name);
		System.out.println(price);
		Flower flower = new Flower();
		System.out.println(flower.name);
		System.out.println(quantity);

	}

}
