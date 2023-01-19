package com.xworkz.soldier.dto;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class MissileDto extends AbstractAuditDto{

	public MissileDto() {
		System.out.println("calling default constructor...");
	}
}
