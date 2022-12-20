package com.xworkz.task.service;

import com.xworkz.task.dto.PlaceDto;
import com.xworkz.task.exception.InvalidDataException;
import com.xworkz.task.repository.PlaceRepository;

public class PlaceServiceImplementation implements PlaceService {

	private PlaceRepository repository;

	public PlaceServiceImplementation(PlaceRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(PlaceDto dto) throws InvalidDataException {
		System.out.println("running vadate method");
		String name = dto.getPlaceName();
		String famousFor = dto.getFamousFor();
		double distanceFromBangalore = dto.getDistanceFromBangalore();
		String mainTemple = dto.getMainTemple();
		String locatedIn = dto.getLocatedIn();

		boolean validateName = false;
		boolean validateFamousFor = false;
		boolean validateDistanceFromBangalore = false;
		boolean validateMainTemple = false;
		boolean validateLocatedIn = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("valid name " + name);
			validateName = true;
		} else {
			System.out.println("invalid name");
		}

		if (famousFor != null && famousFor.length() >= 4 && famousFor.length() <= 20) {
			System.out.println("valid " + famousFor);
			validateFamousFor = true;
		} else {
			System.out.println("invalid");
		}

		if (distanceFromBangalore > 0) {
			System.out.println("valid " + distanceFromBangalore);
			validateDistanceFromBangalore = true;
		} else {
			System.out.println("invalid");
		}

		if (mainTemple != null && mainTemple.length() >= 4 && mainTemple.length() <= 20) {
			System.out.println("valid " + mainTemple);
			validateMainTemple = true;
		} else {
			System.out.println("invalid");
		}

		if (locatedIn != null && locatedIn.length() >= 6 && locatedIn.length() <= 20) {
			System.out.println("valid " + locatedIn);
			validateLocatedIn = true;
		} else {
			System.out.println("invalid");
		}

		if (validateName && validateFamousFor && validateDistanceFromBangalore && validateMainTemple
				&& validateLocatedIn) {
			System.out.println("data is valid can store");
			boolean save = this.repository.save(dto);
			System.out.println("data is saved " + save);
			return save;
		}
		throw new InvalidDataException();
	}

}