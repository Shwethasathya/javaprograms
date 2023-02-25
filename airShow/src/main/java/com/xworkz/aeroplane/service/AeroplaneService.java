package com.xworkz.aeroplane.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.aeroplane.dto.AeroplaneDto;

public interface AeroplaneService {

	 Set<ConstraintViolation<AeroplaneDto>> validateAndSave(AeroplaneDto dto);
	 
	 default AeroplaneDto findById(int id) {
		 return null;
	 }
}
