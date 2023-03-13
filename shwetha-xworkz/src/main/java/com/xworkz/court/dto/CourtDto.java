package com.xworkz.court.dto;


import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class CourtDto {

	private int id;
	@NotNull
	private String name;
	@NotNull
	private String location;
	@NotNull
	private String type;
	@NotNull
	private Integer noOfCases;
	@NotNull
	private Integer establishedYear;

}
