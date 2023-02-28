package com.xworkz.court.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.court.dto.CourtDto;
import com.xworkz.court.entity.CourtEntity;
import com.xworkz.court.repository.CourtRepository;

@Service
public class CourtServiceImple implements CourtService {

	@Autowired
	private CourtRepository courtRepository;

	public CourtServiceImple() {
		System.out.println("created" + getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<CourtDto>> validateAndSave(CourtDto dto) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<CourtDto>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.out.println("violations " + dto);
			return violations;
		} else {

			System.out.println("no violations can save the data");
			CourtEntity entity = new CourtEntity();
			entity.setName(dto.getName());
			entity.setLocation(dto.getLocation());
			entity.setType(dto.getType());
			entity.setNoOfCases(dto.getNoOfCases());
			entity.setEstablishedYear(dto.getEstablishedYear());

			boolean saved = this.courtRepository.save(entity);
			System.out.println("saved " + saved);
			return Collections.emptySet();
		}
	}

	public CourtDto findById(int id) {
		if (id > 0) {
			CourtEntity entity = this.courtRepository.findById(id);
			if (entity != null) {
				CourtDto dto = new CourtDto();
				dto.setName(entity.getName());
				dto.setLocation(entity.getLocation());
				dto.setType(entity.getType());
				dto.setNoOfCases(entity.getNoOfCases());
				dto.setEstablishedYear(entity.getEstablishedYear());
				return dto;
			}
		}
		return CourtService.super.findById(id);
	}

}
