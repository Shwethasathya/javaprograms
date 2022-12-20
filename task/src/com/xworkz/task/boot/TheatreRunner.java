package com.xworkz.task.boot;

import java.time.LocalDateTime;

import com.xworkz.task.dto.TheatreDto;
import com.xworkz.task.exception.InvalidDataException;
import com.xworkz.task.repository.TheatreRepository;
import com.xworkz.task.repository.TheatreRepositoryImple;
import com.xworkz.task.service.TheatreService;
import com.xworkz.task.service.TheatreServiceImple;

public class TheatreRunner {

	public static void main(String[] args) {

		TheatreDto dtos = new TheatreDto();
		dtos.setBrand("dolby");
		dtos.setName("urvashi");
		dtos.setId(43);
		dtos.setSeatsAreGood(true);
		dtos.setCreatedDate(LocalDateTime.now());
		dtos.setCreatedy("SYSTEM");
		
		TheatreDto dtos1 = new TheatreDto();
		dtos1.setBrand("dolby");
		dtos1.setName("urvashi");
		dtos1.setId(43);
		dtos1.setSeatsAreGood(true);
		dtos1.setCreatedDate(LocalDateTime.now());
		dtos1.setCreatedy("SYSTEM");
		

		TheatreRepository repository = new TheatreRepositoryImple();

		TheatreService service = new TheatreServiceImple(repository);
		
		try {
			service.validateAndSava(dtos1);
		} catch (InvalidDataException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			service.validateAndSava(dtos);
		} catch (InvalidDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
