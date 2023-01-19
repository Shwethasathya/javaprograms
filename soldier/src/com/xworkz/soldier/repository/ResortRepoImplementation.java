package com.xworkz.soldier.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.ResortDto;
@Component
public class ResortRepoImplementation implements ResortRepo {

	@Override
	public boolean save(ResortDto resortDto) {
		System.out.println("saving the data");
		System.out.println("resortDto " + resortDto);
		return false;
	}

}
