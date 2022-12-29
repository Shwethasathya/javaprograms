package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.PlaceDto;

public class PlaceRunner {

	public static void main(String[] args) {

		PlaceDto place1 = new PlaceDto("mysore", "karnataka", "mysore palace");
		PlaceDto place2 = new PlaceDto("Thiruvananthapuram", "kerala", "incredible architectural buildings and structures");
		PlaceDto place3 = new PlaceDto("Shivmoga", "Karnataja", "Jog falls");

	boolean equals = place1.equals(place3);

	Collection<PlaceDto> collection = new ArrayList<PlaceDto>();
	collection.add(place3);
	collection.add(place2);
	collection.add(place1);
	
	boolean contains = collection.contains(place3);
	System.out.println("contains " +contains);
	
	}

}
