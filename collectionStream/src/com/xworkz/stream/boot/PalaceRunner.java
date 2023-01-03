package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.PalaceDto;

public class PalaceRunner {

	public static void main(String[] args) {

		Collection<PalaceDto> places = new ArrayList();
		places.add(new PalaceDto("bengalore palace", "bengalore", 100, false));
		places.add(new PalaceDto("vishweshwaraya museum", "bengalore", 150, false));
		places.add(new PalaceDto("mysore palace", "mysore", 100, false));
		places.add(new PalaceDto("lalith mahal", "mysore", 100, true));
		places.add(new PalaceDto("Rambagh Palace", "jaipur", 150, false));

		places.stream().filter(dto -> !dto.isDestroyed()).collect(Collectors.toList())
				.forEach(dto -> System.out.println(dto));
	}

}
