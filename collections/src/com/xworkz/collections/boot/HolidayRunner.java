package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.CalenderDto;
import com.xworkz.collections.dto.HolidayDto;

public class HolidayRunner {

	public static void main(String[] args) {
		
		HolidayDto  dto1=new HolidayDto("deepavali", 3, "no");
		HolidayDto  dto2=new HolidayDto("republic day", 1, "yes");
		HolidayDto  dto3=new HolidayDto("Labour day", 1, "yes");
	
		boolean equals = dto1.equals(dto2);

		Collection<HolidayDto> collection = new ArrayList<HolidayDto>();

		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);

		boolean contains = collection.contains(dto1);
		System.out.println("contains " + contains);
	}

}