package com.xworkz.stream.dto;

import java.io.Serializable;

public class ApplicationDto implements Serializable {

	private String name;
	private double version;
	private boolean free;
	private String developedBy;
	private double price;

	public ApplicationDto() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationDto(String name, double version, boolean free, String developedBy, double price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int hashCode() {
		return 45;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof ApplicationDto) {
				ApplicationDto applicationDto = (ApplicationDto) obj;
				if (applicationDto.name.equals(this.name) && applicationDto.developedBy.equals(this.developedBy)) {
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

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
