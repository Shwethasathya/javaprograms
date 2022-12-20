package com.xworkz.task.repository;

import com.xworkz.task.dto.BakeryDto;
import com.xworkz.task.exception.SizeExceededExcepiton;


public class BakeryRepositoryImple implements BakeryRepository {

	private BakeryDto[] dtos = new BakeryDto[5];
	int currentIndex = 0;

	@Override
	public boolean save(BakeryDto dto) throws SizeExceededExcepiton   {
		if (this.currentIndex >= dtos.length) {
			System.out.println("Size is exceeded");
			throw new SizeExceededExcepiton();
		}
		this.dtos[currentIndex] = dto;
		System.out.println(dto + "in the index" + this.currentIndex);
		this.currentIndex++;
		return true;
	}

}
