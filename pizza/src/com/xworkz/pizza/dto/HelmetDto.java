package com.xworkz.pizza.dto;

import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.HelmetType;

public class HelmetDto extends AbstractAuditDTO {

	private Double price;
	private String brand;
	private Color color;
	private HelmetType type;

	public HelmetDto() {

	}

	public HelmetDto(double price, String brand, Color color, HelmetType type) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
		this.type = type;
	}

	@Override
	public String toString() {
		return "HelmetDto [price=" + price + ", brand=" + brand + ", color=" + color + ", type=" + type + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public HelmetType getType() {
		return type;
	}

	public void setType(HelmetType type) {
		this.type = type;
	}

}
