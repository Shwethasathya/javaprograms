package com.xworkz.terrorist.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class TerroristDto extends AbstractAuditDto {
	@NonNull
	@NotNull(message = "name cannot be null")
	@Size(min = 3, max = 20, message = "name is invalid,should be greater than 3")
	private String name;
	@NonNull
	@Min(value = 1, message = "age should be greater than 1")
	@Max(value = 150, message = "age should be less than 150")
	private int age;
	@NotNull(message = "country cannot be null")
	@Size(min = 4, max = 20, message = "country name is invalid,name length shpuld be greater than 4 and less than 20")
	private String country;
	private boolean alive;
	private boolean prison;
	@NotBlank(message = "specialization should not be blank")
	@NotNull(message = "specialization cannot be null")
	@Size(min = 3, max = 20, message = "specialization is invalid,should be greater than 3")
	private String specialization;

}
