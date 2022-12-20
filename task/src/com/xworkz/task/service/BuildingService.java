package com.xworkz.task.service;

import com.xworkz.task.dto.BuildingDto;
import com.xworkz.task.exception.InvalidDataException;

public interface BuildingService {

	boolean validateAndSave(BuildingDto dto) throws InvalidDataException;
}
