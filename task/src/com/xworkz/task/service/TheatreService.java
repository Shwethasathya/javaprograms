package com.xworkz.task.service;

import com.xworkz.task.dto.TheatreDto;
import com.xworkz.task.exception.InvalidDataException;

public interface TheatreService {

	boolean validateAndSava(TheatreDto dto) throws InvalidDataException;
}
