package com.xworkz.stream.dto;

import java.io.Serializable;

public class DaughterDto implements Serializable {

	private String name;
	private long mobileNo;
	private int age;
	private boolean commited;
	private boolean alive;

	public DaughterDto() {
		// TODO Auto-generated constructor stub
	}

	public DaughterDto(String name, long mobileNo, int age, boolean commited, boolean alive) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.age = age;
		this.commited = commited;
		this.alive = alive;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof DaughterDto) {
				DaughterDto daughterDto = (DaughterDto) obj;
				if (daughterDto.name.equals(this.name)) {
					return true;

				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "DaughterDto [name=" + name + ", mobileNo=" + mobileNo + ", age=" + age + ", commited=" + commited
				+ ", alive=" + alive + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCommited() {
		return commited;
	}

	public void setCommited(boolean commited) {
		this.commited = commited;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}
