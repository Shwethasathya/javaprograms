package com.xworkz.task.service;

import com.xworkz.task.dto.PlaceDto;
import com.xworkz.task.exception.InvalidDataException;

public interface PlaceService {
	
	boolean validateAndSave(PlaceDto dto) throws InvalidDataException;

}
