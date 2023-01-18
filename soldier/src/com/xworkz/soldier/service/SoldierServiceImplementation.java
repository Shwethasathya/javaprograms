package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.SoldierDto;

public class SoldierServiceImplementation implements SoldierService {

	@Override
	public boolean validateAndSave(SoldierDto dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDto>> constraintViolations = validator.validate(dto);
		if (!constraintViolations.isEmpty()) {
			System.err.println("There are violation errors...");

			constraintViolations.forEach(c -> {
				System.out.println("violating message " + c.getMessage());
			});
			return false;
		} else {
			System.out.println("Data is valid.." +dto);
			return true;
		}
	}
}