package com.xworkz.auto.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Autowired
	private Lens lens;
	@Autowired
	private Battery battery;

	public void lens() {
		System.out.println(this.hashCode() + "lens ref");

	}

	public void battery() {
		System.out.println(this.hashCode() + "battery ref");
	}
}
