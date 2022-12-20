package com.xworkz.task.repository;

import com.xworkz.task.dto.PlaceDto;
import com.xworkz.task.exception.InvalidStorageException;

public class PlaceRepositoryImplementation implements PlaceRepository {

	private PlaceDto[] dtos = new PlaceDto[10];
	private int currentIndex = 0;

	@Override
	public boolean save(PlaceDto dto) {
		if (this.currentIndex >= dtos.length) {
			System.out.println("Size is exceeded");
			throw new InvalidStorageException("storage is full");
		}
		this.dtos[currentIndex] = dto;
		System.out.println(dto + "in the index" + this.currentIndex);
		this.currentIndex++;
		return true;

	}
}
