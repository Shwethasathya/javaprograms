package com.xworkz.soldier.dto;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class FirstAidDto extends AbstractAuditDto {

	//public String name;
	
	public FirstAidDto() {
		System.out.println("calling default constructor...");
	}

}
