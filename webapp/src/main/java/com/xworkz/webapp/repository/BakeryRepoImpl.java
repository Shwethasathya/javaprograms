package com.xworkz.webapp.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.webapp.dto.BakeryDto;
import com.xworkz.webapp.service.BakeryService;

@Repository
public class BakeryRepoImpl implements BakeryRepo {

	public BakeryRepoImpl() {
		System.out.println("created " + getClass().getSimpleName());
	}

	@Override
	public boolean save(BakeryDto bakeryDto) {
		System.out.println("running save in BakeryRepoImple");
		return false;
	}

}
