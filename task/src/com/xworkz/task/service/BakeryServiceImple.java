package com.xworkz.task.service;

import com.xworkz.task.dto.BakeryDto;
import com.xworkz.task.exception.SizeExceededExcepiton;
import com.xworkz.task.repository.BakeryRepository;

public class BakeryServiceImple implements BakeryService {

	private BakeryRepository repository;

	public BakeryServiceImple(BakeryRepository repository) {
		super();
		this.repository = repository;
	}

	public void setRepository(BakeryRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(BakeryDto dto) throws SizeExceededExcepiton {
		System.out.println("validating method");
		String name = dto.getName();
		String location = dto.getLocation();
		long contactNo = dto.getContactNo();
		String ownerName = dto.getOwnerName();
		boolean validateName = false;
		boolean validateLocation = false;
		boolean validateContactNo = false;
		boolean validateOwnerName = false;

		if (name != null) {
			System.out.println("valid name : " +name);
			validateName = true;
		}
		if (location != null) {
			System.out.println("valid location : " +location);
			validateLocation = true;
		}
		if (contactNo > 7) {
			System.out.println("valid contact number : " +contactNo);
			validateContactNo = true;
		}
		if (ownerName != null && ownerName.length() >= 4 && ownerName.length() <= 10) {
			System.out.println("valid owner name : "+ownerName);
			validateOwnerName = true;
		}

		if (validateName && validateLocation && validateContactNo && validateOwnerName) {
			System.out.println("BakeryDto is valid and can save using Bakery repository");
			boolean save = repository.save(dto);
			System.out.println("storong data " + save);
			return save;
		}
		throw new SizeExceededExcepiton();
	}

}
