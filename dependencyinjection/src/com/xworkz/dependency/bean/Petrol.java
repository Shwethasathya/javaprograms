package com.xworkz.dependency.bean;

import org.springframework.stereotype.Component;

import com.xworkz.dependency.rule.Fuel;

@Component
public class Petrol implements Fuel {

	
	@Override
	public void consume() {
		System.out.println("calling method from fuel");
	}

}
