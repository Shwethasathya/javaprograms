package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.ResortDto;
import com.xworkz.soldier.repository.ResortRepo;

@Component
public class ResortServiceImplementation implements ResortService {
	@Autowired
	private ResortRepo resortRepo;
	private Validator validator;

	@Autowired
	public ResortServiceImplementation(Validator validator) {
		super();
		System.out.println("creating parameterized const..");
		this.validator = validator;
	}

	public void setResortRepo(ResortRepo resortRepo) {
		this.resortRepo = resortRepo;
	}

	@Override
	public boolean validateAndSave(ResortDto resortDto) {
		Set<ConstraintViolation<ResortDto>> violations = 
				validator.validate(resortDto);
		if (!violations.isEmpty()) {
			System.err.println("there are errors...");
			violations.forEach(c -> System.out.println(c.getMessage()));
			return false;
		} else {
			System.out.println("data is valid can save the data");
			boolean saved = this.resortRepo.save(resortDto);
			System.out.println("data saved " + saved);
			return true;
		}
	}

}
