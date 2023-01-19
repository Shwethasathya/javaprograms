package com.xworkz.soldier.dto;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class ResortDto extends AbstractAuditDto {

	public ResortDto() {
		System.out.println("calling default constructor....");
	}
}
