package com.xworkz.soldier.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDto;
@Component
public class FirstAidRepoImplementation implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDto firstAidDto) {
		System.out.println("saving...");
		System.out.println("FirstAidDto " + firstAidDto);
		return false;

	}

}
