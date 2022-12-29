package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.CalenderDto;

public class CalenderRunner {

	public static void main(String[] args) {

		CalenderDto calenderDto = new CalenderDto("bengaluru mudranalaya", 12, 35);
		CalenderDto calenderDto1 = new CalenderDto("bengaluru mudranalaya", 12, 35);
		CalenderDto calenderDto2 = new CalenderDto("bengaluru mudranalaya", 12, 35);

		boolean equals = calenderDto.equals(calenderDto1);

		Collection<CalenderDto> collection = new ArrayList<CalenderDto>();

		collection.add(calenderDto);
		collection.add(calenderDto1);
		collection.add(calenderDto2);

		boolean contains = collection.contains(calenderDto);
		System.out.println("contains " + contains);
	}

}
