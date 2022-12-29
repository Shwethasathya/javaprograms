package com.xworkz.collections.dto;

public class GameDto {

	private String name;
	private String type;
	private int noOfPlayers;

	public GameDto() {
		// TODO Auto-generated constructor stub
	}

	public GameDto(String name, String type, int noOfPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.noOfPlayers = noOfPlayers;
	}

	public boolean equals(Object obj) {
		
		if(obj!=null) {
			
			if(obj instanceof GameDto) {
				GameDto dto = (GameDto) obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching " + dto.name);
					//return true;
				}
				if(dto.type.equals(this.type)) {
					System.out.println("name is matching " + dto.type);
					return true;
				}
			}
		}
		
		
		return false;
		
	}
	@Override
	public String toString() {
		return "GameDto [name=" + name + ", type=" + type + ", noOfPlayers=" + noOfPlayers + ", toString()="
				+ super.toString() + "]";
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

}
