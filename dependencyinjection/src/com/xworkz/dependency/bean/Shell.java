package com.xworkz.dependency.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dependency.rule.Fuel;
import com.xworkz.dependency.rule.PetrolBunk;


@Component
public class Shell implements PetrolBunk{
	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;
	
	
	
	@Override
	public void purchase() {
		System.out.println("calling method from petrolBunk");
	fuel.consume();
	}
	
	
}
