package com.xworkz.terrorist.boot;

import com.xworkz.terrorist.dto.TerroristDto;
import com.xworkz.terrorist.service.TerroristService;
import com.xworkz.terrorist.service.TerroristServiceImplementation;

public class TerroristRunner {

	public static void main(String[] args) {

		TerroristDto dto = new TerroristDto();
		dto.setName("abc");
		dto.setAge(24);
		dto.setCountry("china");
		dto.setAlive(true);
		dto.setPrison(false);
		dto.setSpecialization("shooting");
		

		System.out.println(dto);

		TerroristService service = new TerroristServiceImplementation();
		service.validateAndSave(dto);
	}

}
