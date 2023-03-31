package com.xworkz.court.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
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
			entity.setId(dto.getId());
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

	@Override
	public CourtDto findById(int id) {
		if (id > 0) {
			CourtEntity entity = this.courtRepository.findById(id);
			if (entity != null) {
				CourtDto dto = new CourtDto();
				dto.setId(entity.getId());
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

	@Override
	public List<CourtDto> findByLocation(String location) {

		System.out.println("running findByLocation in service");
		if (location != null && !location.isEmpty()) {

			List<CourtEntity> entities = this.courtRepository.findByLocation(location);

			List<CourtDto> courtDtos = new ArrayList<CourtDto>();
			for (CourtEntity entity : entities) {
				CourtDto dto = new CourtDto();
				BeanUtils.copyProperties(entities, courtDtos);
				courtDtos.add(dto);
			}
			System.out.println("size of dto " + courtDtos.size());
			System.out.println("size of entries " + entities.size());

			return courtDtos;

		} else {
			System.out.println("location is invalid");
		}
		return CourtService.super.findByLocation(location);
	}

	@Override
	public Set<ConstraintViolation<CourtDto>> validateAndUpdate(CourtDto dto) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<CourtDto>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.out.println("violations " + dto);
			return violations;
		} else {

			System.out.println("no violations can save the data");
			CourtEntity entity = new CourtEntity();
			/*
			 * entity.setId(dto.getId()); entity.setName(dto.getName());
			 * entity.setLocation(dto.getLocation()); entity.setType(dto.getType());
			 * entity.setNoOfCases(dto.getNoOfCases());
			 * entity.setEstablishedYear(dto.getEstablishedYear());
			 * 
			 */
			BeanUtils.copyProperties(dto, entity);

			boolean saved = this.courtRepository.update(entity);
			System.out.println("saved " + saved);
			return Collections.emptySet();
		}

	}

	@Override
	public CourtDto deleteById(int id) {

		System.out.println("running onDelete");
		CourtEntity entity = this.courtRepository.deleteById(id);

		if (entity != null) {
			CourtDto dto = new CourtDto();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		} else {

			return CourtService.super.deleteById(id);
		}

	}

	@Override
	public List<CourtDto> findAll() {
		System.out.println("running find in service");
		List<CourtEntity> entities = this.courtRepository.findAll();
		List<CourtDto> list = new ArrayList<CourtDto>();
		if (entities != null && !entities.isEmpty()) {
			for (CourtEntity entity : entities) {
				CourtDto dto = new CourtDto();
				BeanUtils.copyProperties(entity, dto);
				list.add(dto);
			}
			System.out.println("size of dto " + list.size());
			System.out.println("size of entries " + entities.size());
			return list;
		} else {
			System.out.println("no data found");
			return Collections.emptyList();

		}
	}
	
	
}