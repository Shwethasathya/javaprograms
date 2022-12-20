package com.xworkz.task.service;

import com.xworkz.task.dto.BuildingDto;
import com.xworkz.task.exception.InvalidDataException;
import com.xworkz.task.repository.BuildingRepository;

public class BuildingServiceImple implements BuildingService {

	private BuildingRepository repository;

	public BuildingServiceImple(BuildingRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(BuildingDto dto) throws InvalidDataException {
		System.out.println("calling validating method");
		String name = dto.getName();
		String location = dto.getLocation();
		int noOfFloors = dto.getNoOfFloors();
		int no = dto.getNo();
		boolean isLiftAvailable = dto.isLiftAvailable();
		boolean validateName = false;
		boolean validateLocation = false;
		boolean validateNoOfFloors = false;
		boolean validateNo = false;

		if (name != null && name.length() <= 6 && name.length() <= 20) {
			System.out.println("valid name " + name);
			validateName = true;
		} else {
			System.err.println("name is invalid " + name);
		}
		if (location != null && location.length() >= 5 && location.length() <= 20) {
			System.out.println("valid location " + location);
			validateLocation = true;
		} else {
			System.err.println("location is invalid");
		}

		if (noOfFloors != -1 && noOfFloors >= 3 && noOfFloors <= 16) {
			System.out.println("valid floor " + noOfFloors);
			validateNoOfFloors = true;
		} else {
			System.err.println("invalid floor");
		}
		if (no >= 100 && no <= 3000) {
			System.out.println("valid no " + no);
			validateNo = true;
		} else {
			System.err.println("invalid no");
		}

		if (validateLocation && validateName && validateNoOfFloors && validateNo) {
			System.out.println("data is valid");

		} else {
			throw new InvalidDataException();
		}

		return false;
	}

}
