package com.xworkz.pizza.service;

import com.xworkz.pizza.dto.PizzaDto;
import com.xworkz.pizza.constant.PizzaSize;

public class PizzaServiceImple implements PizzaServices {

	@Override
	public boolean pizzaServices(PizzaDto dto) {
		System.out.println("validating method");
		String name = dto.getName();
		String company = dto.getCompany();
		PizzaSize size = dto.getSize();
		double price = dto.getPrice();
		String flavour = dto.getFlavour();
		String type = dto.getType();
		boolean validateName = false;
		boolean validateCompany = false;
		boolean validateSize = false;
		boolean validatePrice = false;
		boolean validateflavour = false;
		boolean validateType = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("valid :" + name);
			validateName = true;
		} else {
			System.out.println("invalid name");
		}

		if (company != null && company.length() >= 4 && company.length() <= 20) {
			System.out.println("valid :" + company);
			validateCompany = true;
		} else {
			System.out.println("invalid");
		}

		if (size != null) {
			System.out.println("valid :" + size);
			validateSize = true;
		} else {
			System.out.println("invalid");
		}

		if (price > 50 && price < 2000) {
			System.out.println("valid price :" + price);
		} else {
			System.out.println("price is too much");
		}

		if (flavour != null && flavour.length() >= 3 && flavour.length() <= 20) {
			System.out.println("flavour :" + flavour);

		} else {
			System.out.println("flavor invalid");
		}

		if (type != null && type == "veg" || type == "non-veg") {
			System.out.println("type is valid:" + type);

		} else {
			System.out.println("invalid type");
		}
		return false;
	}

}
