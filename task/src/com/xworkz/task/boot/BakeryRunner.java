package com.xworkz.task.boot;

import com.xworkz.task.dto.BakeryDto;
import com.xworkz.task.exception.InvalidStorageException;
import com.xworkz.task.exception.SizeExceededExcepiton;
import com.xworkz.task.repository.BakeryRepository;
import com.xworkz.task.repository.BakeryRepositoryImple;
import com.xworkz.task.service.BakeryService;
import com.xworkz.task.service.BakeryServiceImple;

public class BakeryRunner {

	public static void main(String[] args) {

		System.out.println("running bakery");
		BakeryDto dto = new BakeryDto("sri venkateshwara", "magadi road", 9876543213L, "venkatesh");
		BakeryDto dto1 = new BakeryDto("varrior bakery", "vijaynagar", 7866540981L, "Govinda varior");
		BakeryDto dto2 = new BakeryDto("Bakes180", "Hoshalli", 9986306655L, "venkatesh");
		BakeryDto dto3 = new BakeryDto("sri venkateshwara", "magadi road", 9876543213L, "venkatesh");
		BakeryDto dto4 = new BakeryDto("sri venkateshwara", "magadi road", 9876543213L, "venkatesh");
		BakeryDto dto5 = new BakeryDto("sri venkateshwara", "magadi road", 9876543213L, "venkatesh");

		BakeryRepository repository = new BakeryRepositoryImple();
		BakeryService service = new BakeryServiceImple(repository);

		try {
			System.out.println("after validation");
			service.validateAndSave(dto);
			System.out.println("after validation");
			service.validateAndSave(dto1);
			System.out.println("after validation");
			service.validateAndSave(dto2);
			System.out.println("after validation");
			service.validateAndSave(dto3);
			System.out.println("after validation");
			service.validateAndSave(dto4);
			System.out.println("after validation");
			service.validateAndSave(dto5);

		} catch (SizeExceededExcepiton e) {
			System.out.println(e.getMessage());
		}
	}
}
