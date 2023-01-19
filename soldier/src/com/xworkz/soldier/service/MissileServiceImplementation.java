package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDto;
import com.xworkz.soldier.repository.MissileRepo;

@Component
public class MissileServiceImplementation implements MissileService {
	@Autowired
	private MissileRepo missileRepo;
	private Validator validator;

	@Autowired
	public MissileServiceImplementation(Validator validator) {
		super();
		this.validator = validator;
	}

	public void setValidator(Validator validator) {
		this.validator = validator;
	}

	@Override
	public boolean validateAndSave(MissileDto dto) {
		System.out.println("running validate and save");
		Set<ConstraintViolation<MissileDto>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("there are errors...");
			violations.forEach(c -> System.out.println(c.getMessage()));
			return false;
		} else {
			System.out.println("data is valid and can save the data");
			boolean saved = this.missileRepo.save(dto);
			System.out.println("data is saved " + saved);
			return true;
		}
	}

}
