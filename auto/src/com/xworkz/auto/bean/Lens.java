package com.xworkz.auto.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lens {
	@Autowired
	private Battery battery;

	public void battery() {
		System.out.println(this.hashCode() + "battery ref");
	}

}
