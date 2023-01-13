package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {

	private String name;
	@Autowired
	@Qualifier("snakeLength")
	private double length;
	@Autowired
	@Qualifier("snakeColor")
	private String color;
	private String type;
	private boolean poisionous;

	public Snake() {
		System.out.println("calling default constructor...");
	}

	public Snake(@Qualifier("snakeName") String name, double length, String color, @Qualifier("snakeType") String type,
			@Qualifier("poisionous") boolean poisionous) {
		super();
		this.name = name;
		this.length = length;
		this.color = color;
		this.type = type;
		this.poisionous = poisionous;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisionous="
				+ poisionous + "]";
	}

}
