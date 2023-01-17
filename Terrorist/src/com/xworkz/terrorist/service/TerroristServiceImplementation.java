package com.xworkz.terrorist.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.terrorist.dto.TerroristDto;

public class TerroristServiceImplementation implements TerroristService {

	@Override
	public boolean validateAndSave(TerroristDto dto) {
		System.out.println("executing validateAndSave");
		System.out.println("Dto saved :" + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TerroristDto>> violConstraintViolations = validator.validate(dto);
		if (!violConstraintViolations.isEmpty()) {
			System.err.println("error is present");
			violConstraintViolations.forEach(c -> System.out.println(c.getMessage()));
			return false;
		}
		System.out.println("no validation error");
		return false;
	}

}
