package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.CompanyCEODTO;
import com.xworkz.stream.dto.DaughterDto;

public class CompanyCEORunner {

	public static void main(String[] args) {

		Collection<CompanyCEODTO> ceodtos = new ArrayList<CompanyCEODTO>();

		ceodtos.add(new CompanyCEODTO("shwetha", "accenture", 26, "India", "BE", false,
				new DaughterDto("abc", 8900765421l, 12, false, true)));
		ceodtos.add(new CompanyCEODTO("pavitra", "concentrix", 32, "India", "BE", true,
				new DaughterDto("paviksha", 988760 - 9821l, 9, false, true)));
		ceodtos.add(new CompanyCEODTO("pallavi", "redhill", 35, "India", "mcom", false,
				new DaughterDto("varsha", 9765237506l, 11, false, true)));

		ceodtos.stream().collect(Collectors.toList()).forEach(ele -> System.out.println(ele));
		
		
	}

}
