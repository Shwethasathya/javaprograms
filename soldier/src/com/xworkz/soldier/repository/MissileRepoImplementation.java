package com.xworkz.soldier.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class MissileRepoImplementation implements MissileRepo {

	@Override
	public boolean save(MissileDto dto) {
		System.out.println("saving...");
		System.out.println("dto " + dto);
		return false;
	}

}
