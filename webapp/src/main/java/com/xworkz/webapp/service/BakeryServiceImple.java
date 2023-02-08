package com.xworkz.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.webapp.dto.BakeryDto;
import com.xworkz.webapp.repository.BakeryRepo;

@Service
public class BakeryServiceImple implements BakeryService {

	@Autowired
	private BakeryRepo bakeryRepo;

	@Override
	public boolean validateAndSave(BakeryDto bakeryDto) {
		System.out.println("running validating and save");
		boolean saved = this.bakeryRepo.save(bakeryDto);
		System.out.println("saved in repo " + saved);
		return false;
	}

}
