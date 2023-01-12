package com.xworkz.bean.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Book {
	@Autowired
	@Qualifier("bookName")
	private String bookName;
	@Autowired
	@Qualifier("bookPrice")
	private double price;
	@Autowired
	@Qualifier("pages")
	private int noOfPages;
	@Autowired
	@Qualifier("phoneNumber")
	private long authorPhoneNo;
	@Autowired
	@Qualifier("available")
	private boolean isAvailable;
	@Autowired
	@Qualifier("volume")
	private float volume;
	@Autowired
	@Qualifier("bookSize")
	private char bookSize;

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", price=" + price + ", noOfPages=" + noOfPages + ", authorPhoneNo="
				+ authorPhoneNo + ", isAvailable=" + isAvailable + ", volume=" + volume + ", bookSize=" + bookSize
				+ "]";
	}

}
