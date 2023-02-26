package com.xworkz.court.dto;

import java.time.Year;

import lombok.Data;

@Data
public class CourtDto {

	private String name;
	private String location;
	private String type;
	private int noOfCases;
	private Year establishedYear;

}
