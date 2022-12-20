package com.xworkz.task.service;

import com.xworkz.task.dto.TheatreDto;
import com.xworkz.task.exception.InvalidDataException;
import com.xworkz.task.repository.TheatreRepository;

public class TheatreServiceImple implements TheatreService {

	private TheatreRepository repository;

	public TheatreServiceImple(TheatreRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public boolean validateAndSava(TheatreDto dto) throws InvalidDataException {
		System.out.println("validating method");
		String name = dto.getName();
		int id = dto.getId();
		String brand = dto.getBrand();

		boolean validateName = false;
		boolean validateId = false;
		boolean validateBrand = false;
		boolean validateSeates = false;

		if (name != null && name.length() <= 4 && name.length() >= 20) {
			System.out.println("valid name " + name);
			validateName = true;
		}

		if (id >= 1 && id <= 100) {
			System.out.println("valid id " + id);
			validateId = true;
		}

		if (brand != null && brand.length() >= 4 && brand.length() <= 20) {
			System.out.println("valid brand " + brand);
			validateBrand = true;
		}

		if (validateName && validateId && validateBrand && validateSeates) {
			System.out.println("data is valid");
		} else {
			System.out.println("data is invalid");
		}
		return false;
	}

}