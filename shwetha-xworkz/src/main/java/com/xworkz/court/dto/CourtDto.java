package com.xworkz.court.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CourtDto {

	@NotNull
	@Size(min = 3, max = 20, message = "name should be greater than 3 less than 20")
	private String name;

	private String location;

	private String type;
	@NotNull
	private Integer noOfCases;
	@NotNull
	private Integer establishedYear;

}
