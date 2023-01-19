package com.xworkz.soldier.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.SoldierDto;
@Component
public class SoldierRepoImplementation implements SoldierRepo {

	public SoldierRepoImplementation() {
		System.out.println("created SoldierRepoImplementation using no-arg constructoe...");
	}

	@Override
	public boolean save(SoldierDto dto) {
		System.out.println("saving");
		System.out.println("Dto " + dto);
		return false;
	}

}
