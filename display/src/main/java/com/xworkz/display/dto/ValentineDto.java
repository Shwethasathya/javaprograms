package com.xworkz.display.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ValentineDto {

	@Size(min = 3, max = 20, message = "name cannot be less than 3 or greater than 20")
	private String name;
	@Size(min = 3, max = 20, message = "ValentineName cannot be less than 3 or greater than 20")
	private String ValentineName;
	@NotBlank(message = "place should be selected")
	private String places;
	@NotBlank(message = "gift should be selected")
	private String gifts;
}
