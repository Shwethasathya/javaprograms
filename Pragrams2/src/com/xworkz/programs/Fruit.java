package com.xworkz.programs;

public class Fruit {

	public String name;
	public double price;

	public Fruit(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void sell() {
		System.out.println("selling a fruit");
	}

	public void buy() {
		System.out.println("buying a fruit");
	}
}
