package com.xworkz.auto.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	@Autowired
	private Skill skill;

	public void skill() {
		System.out.println(this.hashCode() + "sill ref");
	}
}
