package com.xworkz.bean.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired
	@Qualifier("pencilName")
	private String name;
	@Autowired
	@Qualifier("pencilType")
	private String type;
	@Autowired
	@Qualifier("pencilPrice")
	private Double price;
	@Autowired
	@Qualifier("color")
	private String color;
	@Autowired
	@Qualifier("sharp")
	private boolean sharp;
	@Autowired
	@Qualifier("stolen")
	private boolean stolen;

	public Pencil() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + "]";
	}

}
