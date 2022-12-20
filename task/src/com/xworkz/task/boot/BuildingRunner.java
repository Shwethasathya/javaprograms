package com.xworkz.task.boot;

import com.xworkz.task.dto.BuildingDto;
import com.xworkz.task.exception.InvalidDataException;
import com.xworkz.task.repository.BuildingRepository;
import com.xworkz.task.repository.BuildingRepositoryImple;
import com.xworkz.task.service.BuildingService;
import com.xworkz.task.service.BuildingServiceImple;

public class BuildingRunner {
	public static void main(String[] args) {

		System.out.println("running main method");
		BuildingDto dto = new BuildingDto("vijaynagr", "krishna", 3, false, 1079); 
		BuildingRepository repository = new BuildingRepositoryImple();

		BuildingService service = new BuildingServiceImple(repository);

		try {
			System.out.println("after validating");
			service.validateAndSave(dto);

		} catch (InvalidDataException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}

}
