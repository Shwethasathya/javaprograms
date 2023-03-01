package com.xworkz.court.entity;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="court")
@NamedQuery(name = "findByLocation", query = "select entity from CourtEntity entity where entity.location=:location")
public class CourtEntity {
	
	@Id
	@Column(name="id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="type")
	private String type;
	@Column(name="noOfCases")
	private Integer noOfCases;
	@Column(name="establishedYear")
	private Integer establishedYear;

}
