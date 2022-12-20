package com.xworkz.task.service;

import com.xworkz.task.dto.BakeryDto;
import com.xworkz.task.exception.SizeExceededExcepiton;

public interface BakeryService {

	boolean validateAndSave(BakeryDto dto) throws SizeExceededExcepiton;
}
