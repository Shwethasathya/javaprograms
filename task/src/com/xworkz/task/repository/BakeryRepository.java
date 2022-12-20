package com.xworkz.task.repository;

import com.xworkz.task.dto.BakeryDto;
import com.xworkz.task.exception.InvalidStorageException;
import com.xworkz.task.exception.SizeExceededExcepiton;

public interface BakeryRepository {

	boolean save(BakeryDto dto) throws SizeExceededExcepiton;
}
