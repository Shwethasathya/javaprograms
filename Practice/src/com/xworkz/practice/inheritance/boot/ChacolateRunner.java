package com.xworkz.practice.inheritance.boot;

import com.xworkz.practice.inheritance.thing.ArraayAccessChacolate;

public class ChacolateRunner {

	public static void main(String[] args) {
		ArraayAccessChacolate[] chacolate = new ArraayAccessChacolate[3];

		chacolate[0] = new ArraayAccessChacolate("dairy milk", 10d);
		chacolate[1] = new ArraayAccessChacolate("eclairs", 1d);
		chacolate[2] = new ArraayAccessChacolate("poppins", 20d);

		for (int i = 0; i < chacolate.length; i++) {
			System.out.println(chacolate[i].name + chacolate[i].price);
		}

	}

}
