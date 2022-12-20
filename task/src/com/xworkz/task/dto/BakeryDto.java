package com.xworkz.task.dto;

public class BakeryDto {

	private String name;
	private String location;
	private long contactNo;
	private String ownerName;

	public BakeryDto() {
		System.out.println("calling default constructor");
	}

	public BakeryDto(String name, String location, long contactNo, String ownerName) {
		super();
		this.name = name;
		this.location = location;
		this.contactNo = contactNo;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "BakeryDto [name=" + name + ", location=" + location + ", contactNo=" + contactNo + ", ownerName="
				+ ownerName + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
