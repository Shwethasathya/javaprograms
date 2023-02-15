package com.xworkz.display.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.display.dto.ValentineDto;

public interface ValentineService {

	Set<ConstraintViolation<ValentineDto>> validateAndSave(ValentineDto dto);
}
