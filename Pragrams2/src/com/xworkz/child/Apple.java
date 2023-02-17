package com.xworkz.child;

import com.xworkz.programs.Fruit;

public class Apple extends Fruit {

	
	public Apple(String name, double price) {
		super(name, price);
		
	}

	public void sell() {
		super.sell();
		System.out.println("calling selling method from parent class");
	}

	public void display()
	{
		System.out.println("name of the fruit :" +this.name);
		System.out.println(this.price);
		
	}
}
