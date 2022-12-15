package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.HelmetDto;

public class HelmetRepositoryImplemen implements HelmetRepository {

	private HelmetDto[] dtos = new HelmetDto[5];
	int currentIndex = 0;

	@Override
	public boolean save(HelmetDto dto) {
		if (this.currentIndex >= dtos.length) {
			System.out.println("size exceeded");
			return false;
		}
		this.dtos[currentIndex] = dto;
		System.out.println(dto + "in the index" + this.currentIndex);
		this.currentIndex++;
		return true;

	}
}
