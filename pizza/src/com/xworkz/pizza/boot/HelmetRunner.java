package com.xworkz.pizza.boot;

import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.HelmetType;
import com.xworkz.pizza.dto.HelmetDto;
import com.xworkz.pizza.repository.HelmetRepository;
import com.xworkz.pizza.repository.HelmetRepositoryImplemen;
import com.xworkz.pizza.service.HelmetService;
import com.xworkz.pizza.service.HelmetServiceImplemen;

public class HelmetRunner {

	public static void main(String[] args) {

		HelmetDto helmet = new HelmetDto(750, "vega", Color.BLACK, HelmetType.FULL);

		HelmetRepository repository = new HelmetRepositoryImplemen();
		HelmetService service = new HelmetServiceImplemen(repository);
		boolean success = service.validateAndSave(helmet);
		System.out.println("success " + success);

	}

}
