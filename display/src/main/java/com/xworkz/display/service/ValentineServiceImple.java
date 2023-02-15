package com.xworkz.display.service;

import java.util.Collections;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.display.dto.ValentineDto;
import com.xworkz.display.entity.ValentineEntity;
import com.xworkz.display.repository.ValentineRepo;

@Service
public class ValentineServiceImple implements ValentineService {

	@Autowired
	private ValentineRepo valentineRepo;

	public ValentineServiceImple() {
		System.out.println("created" + getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDto>> validateAndSave(ValentineDto dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDto>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.out.println("violations " + dto);
			return violations;
		} else {

			System.out.println("no violations can save the data");
			ValentineEntity entity = new ValentineEntity();
			entity.setName(dto.getName());
			entity.setValentineName(dto.getValentineName());
			entity.setPlaces(dto.getPlaces());
			entity.setGifts(dto.getGifts());

			boolean saved = this.valentineRepo.save(entity);
			System.out.println("saved " + saved);
			return Collections.emptySet();
		}
	}
}
