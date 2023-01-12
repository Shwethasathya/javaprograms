package com.xworkz.bean.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {

	@Autowired
	@Qualifier("id")
	private int id;
	@Autowired
	@Qualifier("shopName")
	private String name;
	@Autowired
	@Qualifier("gstNo")
	private String gstNo;
	@Autowired
	@Qualifier("ownerName")
	private String ownerName;
	@Autowired
	@Qualifier("address")
	private String address;

	public HardwareShop() {
		System.out.println("calling HardwareShop from default constructor....");
	}

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}

	
	
}
