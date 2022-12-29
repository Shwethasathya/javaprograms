package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.AirportDto;

public class AirportRunner {

	public static void main(String[] args) {

		AirportDto dto1 = new AirportDto("kempegowda international airport", "bangalore");
		AirportDto dto2 = new AirportDto("mangalore international airport", "mangalore");
		AirportDto dto3 = new AirportDto("chennai international airport", "chennai");

		boolean equals = dto1.equals(dto2);

		Collection<AirportDto> collection = new ArrayList<AirportDto>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);

		boolean contains = collection.contains(dto1);
		System.out.println("contains " + contains);
	}
}
