package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.WarDTO;

public class WarRepositoryImpl implements WarRepository {

	private WarDTO[] warDtos = new WarDTO[10];

	private int warIndex = 0;

	@Override
	public boolean create(WarDTO dto) {
		if (this.warIndex >= warDtos.length) {
			System.out.println("size exceed");
			return false;
		}
		this.warDtos[warIndex] = dto;
		this.warIndex++;
		return true;
	}

	@Override
	public boolean create(WarDTO[] dtos) {

		return false;
	}

	@Override
	public WarDTO findByStartedBy(String startedBy) {visua
		return WarRepository.super.findByStartedBy(startedBy);
	}
}
