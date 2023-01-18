package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SoldierDto extends AbstractAuditDto{
	
	@Min(value = 1, message = "age should be greater than 1")
	@Max(value = 150, message = "age should be less than 150")
	private int id;
	@NotNull(message = "soldier name should not be null")
	@Size(min = 5,max = 25,message = "soldier name should be greater than 4 and less than 26")
	private String name;
	@NotNull(message = "soldier rank should not be null")
	@Size(min = 5,max = 25,message = "soldier rank should be greater than 4 and less than 26")
	private String rank;
	@NotNull(message = "batallion should not be null")
	@Size(min = 5,max = 25,message = "batallion should be greater than 4 and less than 26")
	private String batallion;
	@NotNull(message = "country should not be null")
	@Size(min = 5,max = 25,message = "country should be greater than 4 and less than 26")
	private String country;
	

}
