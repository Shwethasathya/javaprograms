package com.xworkz.auto.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	@Autowired
	private Experience experience;

	public void experience() {
		System.out.println(this.hashCode() + "experience ref");
	}
}
