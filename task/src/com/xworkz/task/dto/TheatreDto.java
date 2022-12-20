package com.xworkz.task.dto;

public class TheatreDto extends AbstractAuditDTO {
	private String name;
	private int id;
	private String brand;
	private boolean seatsAreGood;

	public TheatreDto() {

	}

	public TheatreDto(String name, int id, String brand, boolean seatsAreGood) {
		super();
		this.name = name;
		this.id = id;
		this.brand = brand;
		this.seatsAreGood = seatsAreGood;
	}

	@Override
	public String toString() {
		return "TheatreDto [name=" + name + ", id=" + id + ", brand=" + brand + ", seatsAreGood=" + seatsAreGood
				+ ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isSeatsAreGood() {
		return seatsAreGood;
	}

	public void setSeatsAreGood(boolean seatsAreGood) {
		this.seatsAreGood = seatsAreGood;
	}

}
