package com.xworkz.exception.boot;

import com.xworkz.exception.follower.Vijaylakshmi;

public class RuleRunner {

	public static void main(String[] args) {

		Vijaylakshmi lakshmi = new Vijaylakshmi();
		lakshmi.setName("Shwetha");
		lakshmi.setAge(25);
		lakshmi.setGender('f');
		lakshmi.setLicense(false);
		lakshmi.setLocation("Vijaynagar");

		System.out.println(lakshmi.getName());
		System.out.println(lakshmi.getAge());
		System.out.println(lakshmi.getGender());
		System.out.println(lakshmi.getLocation());
		System.out.println(lakshmi.getisLicense());

		lakshmi.completedProgram();
		lakshmi.eat();
		lakshmi.executeProgram();
		lakshmi.gst();
		lakshmi.sleep();

	}

}
