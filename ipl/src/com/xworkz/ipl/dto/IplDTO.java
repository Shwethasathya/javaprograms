package com.xworkz.ipl.dto;

public class IplDTO extends AbstractAuditDTO {

	private String teamName;
	private String captain;
	private boolean ownerAlive;
	private double purse;
	private int win;
	private int defeats;

	public IplDTO() {
		System.out.println("calling no arg default constructor");
	}

	@Override
	public String toString() {
		return "IplDTO [teamName=" + teamName + ", captain=" + captain + ", ownerAlive=" + ownerAlive + ", purse="
				+ purse + ", win=" + win + ", defeats=" + defeats + "]";
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public boolean isOwnerAlive() {
		return ownerAlive;
	}

	public void setOwnerAlive(boolean ownerAlive) {
		this.ownerAlive = ownerAlive;
	}

	public double getPurse() {
		return purse;
	}

	public void setPurse(double purse) {
		this.purse = purse;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getDefeats() {
		return defeats;
	}

	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}

}
