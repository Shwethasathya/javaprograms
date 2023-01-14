package com.xworkz.auto.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Autowired
	private Location location;

	public Company() {
		System.out.println("calling default constructor");
	}

	public void location() {
		System.out.println(this.hashCode() + "location ref");
		
	}
}
