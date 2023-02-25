package com.xworkz.aeroplane.service;

import java.util.Collections;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.aeroplane.dto.AeroplaneDto;
import com.xworkz.aeroplane.entity.AeroplaneEntity;
import com.xworkz.aeroplane.repository.AeroplaneRepository;

@Service
public class AeroplaneServiceImple implements AeroplaneService {

	@Autowired
	private AeroplaneRepository aeroplaneRepository;

	public AeroplaneServiceImple() {
		System.out.println("created" + getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<AeroplaneDto>> validateAndSave(AeroplaneDto dto) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AeroplaneDto>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.out.println("violations " + dto);
			return violations;
		} else {

			System.out.println("no violations can save the data");
			AeroplaneEntity entity = new AeroplaneEntity();
			entity.setCompany(dto.getCompany());
			entity.setCost(dto.getCost());
			entity.setCountry(dto.getCountry());
			entity.setName(dto.getName());
			entity.setType(dto.getType());

			boolean saved = this.aeroplaneRepository.save(entity);
			System.out.println("saved " + saved);
			return Collections.emptySet();
		}
	}

	@Override
	public AeroplaneDto findById(int id) {
		if(id>0) {
			AeroplaneEntity entity = this.aeroplaneRepository.findById(id);
			if(entity!=null) {
				AeroplaneDto dto=new AeroplaneDto();
				dto.setCompany(entity.getCompany());
				dto.setName(entity.getName());
				dto.setCost(entity.getCost());
				dto.setType(entity.getType());
				dto.setCountry(entity.getCountry());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return AeroplaneService.super.findById(id);
   }
}

