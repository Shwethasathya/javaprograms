package com.xworkz.task.dto;

public class BuildingDto extends AbstractAuditDTO {

	private String location;
	private String name;
	private int noOfFloors;
	private boolean liftAvailable;
	private int no;

	public BuildingDto() {

	}

	public BuildingDto(String location, String Name, int noOfFloors, boolean liftAvailable, int no) {
		super();
		this.location = location;
		this.name = name;
		this.noOfFloors = noOfFloors;
		this.liftAvailable = liftAvailable;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Building [location=" + location + ", name=" + name + ", noOfFloors=" + noOfFloors
				+ ", liftAvailable=" + liftAvailable + ", no=" + no + ", toString()=" + super.toString() + "]";
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String buildingName) {
		this.name = buildingName;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public boolean isLiftAvailable() {
		return liftAvailable;
	}

	public void setLiftAvailable(boolean liftAvailable) {
		this.liftAvailable = liftAvailable;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	

}
