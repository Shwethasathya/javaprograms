package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String name;
	private String type;
	@Autowired
	@Qualifier("engineNumber")
	private int number;
	@Autowired
	@Qualifier("enginrVersion")
	private double version;

	private String company;
	private int strokes;

	
@Autowired
	public Engine(@Qualifier("engineName") String name, @Qualifier("engineType") String type, int number,
			double version, @Qualifier("engineCompany") String company, int strokes) {
		super();
		this.name = name;
		this.type = type;
		this.number = number;
		this.version = version;
		this.company = company;
		//this.strokes = strokes;
	}

	@Autowired
	@Qualifier("stroke")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" +"]";
	}

}
