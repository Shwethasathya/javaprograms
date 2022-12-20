package com.xworkz.task.repository;

import com.xworkz.task.dto.BuildingDto;
import com.xworkz.task.exception.InvalidStorageException;

public class BuildingRepositoryImple implements BuildingRepository {

	private BuildingDto[] dtos = new BuildingDto[5];
	int currentIndex = 0;

	@Override
	public boolean save(BuildingDto dto) {
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
