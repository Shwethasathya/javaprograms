package com.xworkz.autowired.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	@Autowired
	@Qualifier("GhostName")
	private String name;
	@Autowired
	@Qualifier("GhostColor")
	private String color;
	@Autowired
	@Qualifier("date")
	private LocalDate dateOfDeath;
	@Autowired
	@Qualifier("nailLength")
	private double nailLength;
	@Autowired
	@Qualifier("GhostHeight")
	private double height;
	@Autowired
	@Qualifier("fingers")
	private int noOfFingers;
	@Autowired
	@Qualifier("isNailsAvailable")
	private boolean nails;
	@Autowired
	@Qualifier("ghostEyeColor")
	private String eyeColor;
	@Autowired
	@Qualifier("hairColor")
	private String hairColor;
	@Autowired
	@Qualifier("hairLength")
	private double hairLegth;
	private String reasonOfDeath;
	private String gender;
	private String language;
	private String fatherName;
	private String motherName;
	private String wasWorkingAs;
	private String place;
	private boolean married;
	private LocalDate dateOfBirth;
	private double salaryWas;

	public Ghost() {
		// TODO Auto-generated constructor stub
	}

	public Ghost(String name, String color, LocalDate dateOfDeath, double nailLength, double height, int noOfFingers,
			boolean nails, String eyeColor, String hairColor, double hairLegth,
			@Qualifier("reasonOfDeath") String reasonOfDeath, @Qualifier("ghostGender") String gender,
			@Qualifier("speakingLanguage") String language, @Qualifier("ghostFather") String fatherName,
			@Qualifier("ghostMother") String motherName, @Qualifier("workingWas") String wasWorkingAs,
			@Qualifier("ghostPlace") String place, @Qualifier("ghostMarried") boolean married,
			@Qualifier("birthDate") LocalDate dateOfBirth, @Qualifier("salary") double salaryWas) {
		super();
		this.name = name;
		this.color = color;
		this.dateOfDeath = dateOfDeath;
		this.nailLength = nailLength;
		this.height = height;
		this.noOfFingers = noOfFingers;
		this.nails = nails;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
		this.hairLegth = hairLegth;
		this.reasonOfDeath = reasonOfDeath;
		this.gender = gender;
		this.language = language;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.wasWorkingAs = wasWorkingAs;
		this.place = place;
		this.married = married;
		this.dateOfBirth = dateOfBirth;
		this.salaryWas = salaryWas;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", color=" + color + ", dateOfDeath=" + dateOfDeath + ", nailLength="
				+ nailLength + ", height=" + height + ", noOfFingers=" + noOfFingers + ", nails=" + nails
				+ ", eyeColor=" + eyeColor + ", hairColor=" + hairColor + ", hairLegth=" + hairLegth
				+ ", reasonOfDeath=" + reasonOfDeath + ", gender=" + gender + ", language=" + language + ", fatherName="
				+ fatherName + ", motherName=" + motherName + ", wasWorkingAs=" + wasWorkingAs + ", place=" + place
				+ ", married=" + married + ", dateOfBirth=" + dateOfBirth + ", salaryWas=" + salaryWas + "]";
	}

}
