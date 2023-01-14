package com.xworkz.auto.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Assistant {
	@Autowired
	private Company company;

	public Assistant() {
	System.out.println("calling Aiisistant constructor");
	}
	
	public void Company() {
		System.out.println(this.hashCode()+"company ref");
	}
}
