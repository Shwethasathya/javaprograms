package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.SoldierDto;
import com.xworkz.soldier.repository.SoldierRepo;
@Component
public class SoldierServiceImplementation implements SoldierService {

	private SoldierRepo soldierRepo;

	public SoldierServiceImplementation() {
		System.out.println("created SoldierServiceImplementation using no-arg...");
	}

	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo = soldierRepo;
	}

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
			System.out.println("Data is valid.." + dto);
			boolean saved = soldierRepo.save(dto);
			System.out.println("data saved " + saved);
			return true;
		}
	}
}