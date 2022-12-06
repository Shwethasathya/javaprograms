package com.xworkz.inter;

import com.xworkz.rules.Vehical;

public class DiverFollow implements Vehical {

	public static void main(String[] args) {

		Vehical vehical = new DiverFollow();

		System.out.println(vehical.doorClose());
		System.out.println(vehical.doorOPen());
		System.out.println(vehical.parking());
		System.out.println(vehical.registration());
		System.out.println(vehical.regNo());

		DiverFollow driver = new DiverFollow();

		System.out.println(driver.doorClose());
		System.out.println(driver.doorOPen());
		System.out.println(driver.parking());
		System.out.println(driver.registration());
		System.out.println(driver.regNo());

	}

	@Override
	public int regNo() {
		return 0;
	}

	@Override
	public String registration() {
		return null;
	}

	@Override
	public String parking() {
		return null;
	}

	@Override
	public boolean doorOPen() {
		return false;
	}

	@Override
	public boolean doorClose() {
		return false;
	}
}
