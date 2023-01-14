package com.xworkz.auto.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	@Autowired
	private Capacity capacity;

	public void capacity() {
		System.out.println(this.hashCode() + "capacity ref");
	}
}
