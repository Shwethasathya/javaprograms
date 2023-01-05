package com.xworkz.stream.dto;

import java.io.Serializable;

import com.xworkz.stream.constant.WeaponType;

public class WeaponDto implements Serializable, Comparable<WeaponDto> {

	private String name;
	private String madeBy;
	private String madeOn;
	private Double price;
	private WeaponType type;

	public WeaponDto() {
		// TODO Auto-generated constructor stub
	}

	public WeaponDto(String name, String madeBy, String madeOn, Double price, WeaponType type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDto [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	@Override
	public int hashCode() {
		return 54;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof WeaponDto) {
				WeaponDto weaponDto = (WeaponDto) obj;
				{
					if (weaponDto.name.equals(this.name) && (weaponDto.type.equals(this.type))) {
						return true;
					}
				}
			}
		}

		return false;
	}

	@Override
	public int compareTo(WeaponDto o) {
		return this.madeBy.compareTo(o.madeBy);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(String madeOn) {
		this.madeOn = madeOn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public WeaponType getType() {
		return type;
	}

	public void setType(WeaponType type) {
		this.type = type;
	}

}
