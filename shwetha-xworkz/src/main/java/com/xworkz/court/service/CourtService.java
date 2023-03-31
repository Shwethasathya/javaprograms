package com.xworkz.court.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.court.dto.CourtDto;

public interface CourtService {

	Set<ConstraintViolation<CourtDto>> validateAndSave(CourtDto dto);

	default CourtDto findById(int id) {
		return null;
	}

	default List<CourtDto> findByLocation(String location) {
		return Collections.emptyList();
	}
	
	Set<ConstraintViolation<CourtDto>> validateAndUpdate(CourtDto dto);

	default CourtDto deleteById(int id) {
		return null;
	}

	default List<CourtDto> findAll() {
		return Collections.emptyList();
	}
	
	default List<CourtDto> findByProperty(String name, String type) {
		return Collections.emptyList();
	}
	

}
