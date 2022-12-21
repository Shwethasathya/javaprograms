package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompanyRunner {

	public static void main(String[] args) {

		String company1 = "LandT";
		String company2 = "hynetic";
		String company3 = "mu sigma";
		String company4 = "tech mahindra";
		String company5 = "Knowx";
		String company6 = "Accenture";
		String company7 = "HCL";
		String company8 = "infosys";
		String company9 = "wipro";
		String company10 = "ibm";
		String company11 = "oracle";
		String company12 = "google";
		String company13 = "cisco";
		String company14 = "amazon";
		String company15 = "dell";
		String company16 = "hp";
		String company17 = "sap";
		String company18 = "mphasis";
		String company19 = "ey";
		String company20 = "deloitte";

		Collection<String> collection = new ArrayList<String>();

		collection.add(company20);
		collection.add(company19);
		collection.add(company18);
		collection.add(company17);
		collection.add(company16);
		collection.add(company15);
		collection.add(company13);
		collection.add(company14);
		collection.add(company12);
		collection.add(company11);
		collection.add(company10);
		collection.add(company9);
		collection.add(company8);
		collection.add(company7);
		collection.add(company6);
		collection.add(company5);
		collection.add(company4);
		collection.add(company3);
		collection.add(company2);
		collection.add(company1);

		System.out.println("size is : " + collection.size());

		for (String string : collection) {
			System.out.println(string);
		}

		Iterator<String> it = collection.iterator();
		while (it.hasNext()) {
			String type = it.next();
			System.out.println(type);

		}
	}

}
