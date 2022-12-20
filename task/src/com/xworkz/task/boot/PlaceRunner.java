package com.xworkz.task.boot;

import com.xworkz.task.dto.PlaceDto;
import com.xworkz.task.exception.InvalidDataException;
import com.xworkz.task.repository.PlaceRepository;
import com.xworkz.task.repository.PlaceRepositoryImplementation;
import com.xworkz.task.service.PlaceService;
import com.xworkz.task.service.PlaceServiceImplementation;

public class PlaceRunner {

	public static void main(String[] args) throws InvalidDataException {

		PlaceDto place = new PlaceDto("Gokarna", "beach", 486, "shiva", "Karnataka");
		PlaceDto place1 = new PlaceDto("Mysore", "heritage places", 144, "Chamundeshwari", "Karnataka");
		

		PlaceRepository repository = new PlaceRepositoryImplementation();

		PlaceService service = new PlaceServiceImplementation(repository);

		service.validateAndSave(place);
		service.validateAndSave(place1);
	}
}
