package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.ApplicationDto;

public class ApplicationRunner {

	public static void main(String[] args) {

		Collection<ApplicationDto> collection = new ArrayList<ApplicationDto>();

		collection.add(new ApplicationDto("apache maven", 3.8, true, "Apache Software Foundation", 0));
		collection.add(new ApplicationDto("notepad++", 3.8, true, "Don Hoe", 0));
		collection.add(new ApplicationDto("eclipse", 8.4, true, "Apache Software Foundation", 0));
		collection.add(new ApplicationDto("microsoft 365", 2.2, true, "microsoft", 6199d));
		collection.add(new ApplicationDto("google drive", 3.2, true, "google", 0));

		collection.stream()
				.filter(ele -> ele.isFree() != false || ele.getDevelopedBy() == "Google" || ele.getVersion() > 5)
				.collect(Collectors.toList()).forEach(dto -> System.out.println(dto));
	}
}
