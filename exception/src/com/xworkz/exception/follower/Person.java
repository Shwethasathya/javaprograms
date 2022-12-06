package com.xworkz.exception.follower;

public abstract class Person {

	private String name;
	private int age;
	private char gender;
	private boolean license;
	private String location;

	public abstract void eat();

	public abstract boolean sleep();

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public boolean getisLicense() {
		return license;
	}

	public void setLicense(boolean license) {
		this.license = license;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
