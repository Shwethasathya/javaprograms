package com.xworkz.stream.dto;

import java.io.Serializable;

import com.xworkz.stream.constant.Type;

public class DatabaseVendorDto implements Serializable{

	private String name;
	private String developedBy;
	private Type type;
	private double size;
	private double licenseCost;

	public DatabaseVendorDto() {
		// TODO Auto-generated constructor stub
	}

	public DatabaseVendorDto(String name, String developedBy, Type type, double size, double licenseCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.size = size;
		this.licenseCost = licenseCost;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof DatabaseVendorDto) {
				DatabaseVendorDto dto = (DatabaseVendorDto) obj;
				if (dto.name.equals(this.name)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "DatabaseVendorDto [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", size=" + size
				+ ", licenseCost=" + licenseCost + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(double licenseCost) {
		this.licenseCost = licenseCost;
	}

}
