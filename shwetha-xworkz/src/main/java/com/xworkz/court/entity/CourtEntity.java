package com.xworkz.court.entity;

import java.time.Year;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="court")
public class CourtEntity {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="type")
	private String type;
	@Column(name="noOfCases")
	private int noOfCases;
	@Column(name="establishedYear")
	private Year establishedYear;

}
