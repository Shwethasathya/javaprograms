package com.xworkz.pizza.dto;

import com.xworkz.pizza.constant.PizzaSize;

public class PizzaDto extends AbstractAuditDTO {

	private String name;
	private String company;
	private PizzaSize size;
	private boolean cheese;
	private double price;
	private String flavour;
	private String type;

	public PizzaDto() {
		// TODO Auto-generated constructor stub
	}

	public PizzaDto(String name, String company, PizzaSize size, boolean cheese, double price, String flavour,
			String type) {
		super();
		this.name = name;
		this.company = company;
		this.size = size;
		this.cheese = cheese;
		this.price = price;
		this.flavour = flavour;
		this.type = type;
	}

	@Override
	public String toString() {
		return "PizzaDto [name=" + name + ", company=" + company + ", size=" + size + ", cheese=" + cheese + ", price="
				+ price + ", flavour=" + flavour + ", type=" + type + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
