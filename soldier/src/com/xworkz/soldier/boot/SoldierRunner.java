package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDto;
import com.xworkz.soldier.service.SoldierService;
import com.xworkz.soldier.service.SoldierServiceImplementation;

public class SoldierRunner {

	public static void main(String[] args) {

		SoldierDto dto = new SoldierDto(1, "santosh", "top rank", "xworkz", "india");
		System.out.println(dto);
		SoldierService service = new SoldierServiceImplementation();
		service.validateAndSave(dto);

	}

}
