package com.xworkz.auto.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	@Autowired
	private Assistant assistant;

	public void Assistant() {
		System.out.println(this.hashCode() + "assistant ref ");
	}
}
