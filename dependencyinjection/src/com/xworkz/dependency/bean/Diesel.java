package com.xworkz.dependency.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dependency.rule.Fuel;

@Component
public class Diesel implements Fuel {

	
	@Override
	public void consume() {
		System.out.println("calling method from Fuel");

	}

}
