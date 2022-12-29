package com.xworkz.collections.dto;

import java.io.Serializable;

public class CalenderDto implements Serializable {

	private String name;
	private Integer noOfPages;
	private Integer price;
	
public CalenderDto() {
	// TODO Auto-generated constructor stub
}

public CalenderDto(String name, Integer noOfPages, Integer price) {
	super();
	this.name = name;
	this.noOfPages = noOfPages;
	this.price = price;
}

@Override
public boolean equals(Object obj) {
	if (obj != null) {

		if (obj instanceof CalenderDto) {
			CalenderDto dto = (CalenderDto) obj;
			if (dto.noOfPages.equals(this.noOfPages)) {
				System.out.println("place is matching " + dto.noOfPages);
				return true;
			}

		}
	}

	return false;

}

@Override
public String toString() {
	return "CalenderDto [toString()=" + super.toString() + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getNoOfPages() {
	return noOfPages;
}

public void setNoOfPages(int noOfPages) {
	this.noOfPages = noOfPages;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}


}
