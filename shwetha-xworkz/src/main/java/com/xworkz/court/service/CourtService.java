package com.xworkz.court.service;

import java.util.Set;


import javax.validation.ConstraintViolation;

import com.xworkz.court.dto.CourtDto;

public interface CourtService {

	Set<ConstraintViolation<CourtDto>> validateAndSave(CourtDto dto);
	
	default CourtDto findById(int id) {
		return null;
	}
	
	
}
