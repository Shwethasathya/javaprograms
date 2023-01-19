package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDto;
import com.xworkz.soldier.repository.FirstAidRepo;

@Component
public class FirstAidServiceImplementation implements FirstAidService {
	
	@Autowired
	private FirstAidRepo firstAidRepo;
	private Validator validator;

	
@Autowired
	public FirstAidServiceImplementation(Validator validator) {
		super();
		this.validator = validator;
	}

	public void setFirstAidRepo(FirstAidRepo firstAidRepo) {
		this.firstAidRepo = firstAidRepo;
	}

	@Override
	public boolean validateAndSave(FirstAidDto firstAidDto) {
		System.out.println("running validate and save");
		//System.out.println("firstAidDto " + firstAidDto);

		Set<ConstraintViolation<FirstAidDto>> constraintViolations = validator.validate(firstAidDto);
		if (!constraintViolations.isEmpty()) {
			System.err.println("there are errors...");

			constraintViolations.forEach(c -> {
				System.out.println(c.getMessage());
			});
			return false;
		} else {
			System.out.println("data is valid can save the data");
			boolean saved = this.firstAidRepo.save(firstAidDto);
			System.out.println("data is saved ");
			return true;
		}

	}

}
