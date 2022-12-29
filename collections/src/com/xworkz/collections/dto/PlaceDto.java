package com.xworkz.collections.dto;

import java.io.Serializable;

public class PlaceDto implements Serializable {

	private String name;
	private String presentInState;
	private String famousFor;

	public PlaceDto() {
		// TODO Auto-generated constructor stub
	}

	public PlaceDto(String name, String presentInState, String famousFor) {
		super();
		this.name = name;
		this.presentInState = presentInState;
		this.famousFor = famousFor;
	}

	public boolean equals(Object obj) {

		if (obj != null) {

			if (obj instanceof PlaceDto) {
				PlaceDto dto = (PlaceDto) obj;
				if (dto.name.equals(this.name)) {
					System.out.println("name is matching " + dto.name);
					// return true;
				}

			}
		}

		return false;

	}

	@Override
	public String toString() {
		return "PlaceDto [toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPresentInState() {
		return presentInState;
	}

	public void setPresentInState(String presentInState) {
		this.presentInState = presentInState;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

}
