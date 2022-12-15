package com.xworkz.pizza.service;

import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.HelmetType;
import com.xworkz.pizza.dto.HelmetDto;
import com.xworkz.pizza.repository.HelmetRepository;

public class HelmetServiceImplemen implements HelmetService {

	private HelmetRepository repository;

	public HelmetServiceImplemen(HelmetRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(HelmetDto dto) {
		System.out.println("validating method");
		Double price = dto.getPrice();
		String brand = dto.getBrand();
		Color color = dto.getColor();
		HelmetType type = dto.getType();
		boolean validatePrice = false;
		boolean validateBrand = false;
		boolean validateColor = false;
		boolean validateType = false;

		if (price != null) {
			System.out.println("valid price" + price);
			validatePrice = true;
		} else {
			System.out.println("invalid");
		}

		if (brand != null && brand.length() >= 4 && brand.length() <= 10) {
			System.out.println("valid brand" + brand);
			validateBrand = true;
		} else {
			System.out.println("invalid");
		}

		if (color != null) {
			System.out.println("valid color" + color);
			validateColor = true;
		} else {
			System.out.println("invalid");
		}

		if (type != null) {
			System.out.println("valid type" + type);
			validateType = true;
		} else {
			System.out.println("invalid");
		}

		if (validatePrice && validateBrand && validateColor && validateType) {
			System.out.println("helmetDto is valid and can save using Helmet repository");
			boolean save = repository.save(dto);
			return true;
		} else {
			System.out.println("helmetDto is not valid, cannot save");
		}
		return false;
	}

}
