package com.xworkz.task.dto;

public class PlaceDto extends AbstractAuditDTO {
	private String placeName;
	private String famousFor;
	private double distanceFromBangalore;
	private String mainTemple;
	private String locatedIn;

	public PlaceDto() {
		// TODO Auto-generated constructor stub
	}

	public PlaceDto(String placeName, String famousFor, double distanceFromBangalore, String mainTemple,
			String locatedIn) {
		super();
		this.placeName = placeName;
		this.famousFor = famousFor;
		this.distanceFromBangalore = distanceFromBangalore;
		this.mainTemple = mainTemple;
		this.locatedIn = locatedIn;
	}

	@Override
	public String toString() {
		return "PlaceDto [placeName=" + placeName + ", famousFor=" + famousFor + ", distanceFromBangalore="
				+ distanceFromBangalore + ", mainTemple=" + mainTemple + ", locatedIn=" + locatedIn + ", toString()="
				+ super.toString() + "]";
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public double getDistanceFromBangalore() {
		return distanceFromBangalore;
	}

	public void setDistanceFromBangalore(double distanceFromBangalore) {
		this.distanceFromBangalore = distanceFromBangalore;
	}

	public String getMainTemple() {
		return mainTemple;
	}

	public void setMainTemple(String mainTemple) {
		this.mainTemple = mainTemple;
	}

	public String getLocatedIn() {
		return locatedIn;
	}

	public void setLocatedIn(String locatedIn) {
		this.locatedIn = locatedIn;
	}

}
