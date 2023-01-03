package com.xworkz.stream.dto;

import java.io.Serializable;

public class PalaceDto implements Serializable {

	private String name;
	private String location;
	private double entryFee;
	private boolean isDestroyed;
	

	public PalaceDto() {
		// TODO Auto-generated constructor stub
	}

	public PalaceDto(String name, String location, double entryFee, boolean isDestroyed) {
		super();
		this.name = name;
		this.location = location;
		this.entryFee = entryFee;
		this.isDestroyed = isDestroyed;
		
	}

	@Override
	public String toString() {
		return "PlaceDto [name=" + name + ", location=" + location + ", entryFee=" + entryFee + ", isDestroyed="
				+ isDestroyed + ", constructedBy=" + "]";
	}

	@Override
	public int hashCode() {
		return 15;
	}

	@Override
	public boolean equals(Object arg) {
		if (arg != null) {
			if (arg instanceof PalaceDto) {
				PalaceDto dto = (PalaceDto) arg;
				if (dto.name.equals(this.name) && dto.location.equals(this.location)) {
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}

	public boolean isDestroyed() {
		return isDestroyed;
	}

	public void setDestroyed(boolean isDestroyed) {
		this.isDestroyed = isDestroyed;
	}

	

}
