package com.xworkz.display.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.display.dto.ValentineDto;

@Service
public class ValentineServiceImple implements ValentineService {

	public ValentineServiceImple() {
		System.out.println("created" + getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDto>> validateAndSave(ValentineDto dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDto>> violations = validator.validate(dto);
		if(violations!=null && !violations.isEmpty()) {
			System.out.println("violations " +dto);
			return violations;
		}else {
			
			System.out.println("no violations can save the data");
			return Collections.emptySet();
		}
	}

}

