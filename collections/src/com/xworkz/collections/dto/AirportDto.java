package com.xworkz.collections.dto;

public class AirportDto {

	private String name;
	private String place;

	public AirportDto() {
		// TODO Auto-generated constructor stub
	}

	public AirportDto(String name, String place) {
		super();
		this.name = name;
		this.place = place;
	}

	public boolean equals(Object obj) {

		if (obj != null) {

			if (obj instanceof AirportDto) {
				AirportDto dto = (AirportDto) obj;
				if (dto.place.equals(this.place)) {
					System.out.println("place is matching " + dto.place);
					return true;
				}

			}
		}

		return false;

	}

	@Override
	public String toString() {
		return "AirportDto [toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
