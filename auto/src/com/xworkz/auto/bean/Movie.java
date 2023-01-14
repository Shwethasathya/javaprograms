package com.xworkz.auto.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	@Autowired
	private Director director;
	@Autowired
	private Producer producer;

	public void director() {
		System.out.println(this.hashCode() + "director ref");
	}
	
	public void producer() {
		System.out.println(this.hashCode() + "producer ref");
	}

}
