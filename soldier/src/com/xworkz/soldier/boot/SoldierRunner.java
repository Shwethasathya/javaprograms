package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDto;
import com.xworkz.soldier.repository.SoldierRepoImplementation;
import com.xworkz.soldier.service.SoldierServiceImplementation;

public class SoldierRunner {

	public static void main(String[] args) {

		SoldierDto dto = new SoldierDto(-1, "sa", "to", "v", "i");
		System.out.println(dto);
		
		SoldierServiceImplementation service = new SoldierServiceImplementation();
		
		
		SoldierRepoImplementation implementation = new SoldierRepoImplementation();
		service.setSoldierRepo(implementation);
		service.validateAndSave(dto);
	}

}
