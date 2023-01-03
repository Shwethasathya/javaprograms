package com.xworkz.stream.dto;

import java.io.Serializable;

public class CompanyCEODTO implements Serializable {

	private String name;
	private String company;
	private int age;
	private String country;
	private String qualification;
	private boolean isMarried;
	private DaughterDto daughterDto;

	public CompanyCEODTO() {
		// TODO Auto-generated constructor stub
	}

	public CompanyCEODTO(String name, String company, int age, String country, String qualification, boolean isMarried,
			DaughterDto daughterDto) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
		this.country = country;
		this.qualification = qualification;
		this.isMarried = isMarried;
		this.daughterDto = daughterDto;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof CompanyCEODTO) {
				CompanyCEODTO ceodto = (CompanyCEODTO) obj;
				if (ceodto.name.equals(this.name)) {
					return true;

				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public DaughterDto getDaughterDto() {
		return daughterDto;
	}

	public void setDaughterDto(DaughterDto daughterDto) {
		this.daughterDto = daughterDto;
	}

}
