package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.LinkedHashSet;

public class BikeRunner {

	public static void main(String[] args) {

		String bike = "Yamaha";
		String bike1 = "royal enfield";
		String bike2 = "hero splender plus";
		String bike3 = "Tvs rider";
		String bike4 = "Tvs apache";
		String bike5 = "Honda activa";
		String bike6 = "kawasaki ninja H2";
		String bike7 = "bajaj pulsar";
		String bike8 = "KTM 390 duke";
		String bike9 = "KTM 200 duke";
		String bike10 = "Nova";
		String bike11 = "patriot";
		String bike12 = "ducati desertx";
		String bike13 = "stella automobili buzz";
		String bike14 = "ultraviolette f77";
		String bike15 = "bajaj platina 110";
		String bike16 = "bajaj ct110x";
		String bike17 = "honda activa 6g";
		String bike18 = "hero splender plus";
		
		Collection<String> collection = new LinkedHashSet<String>();
		
		collection.add(bike1);
		collection.add(bike2);
		collection.add(bike3);
		collection.add(bike4);
		collection.add(bike5);
		collection.add(bike6);
		collection.add(bike7);
		collection.add(bike8);
		collection.add(bike9);
		collection.add(bike10);
		collection.add(bike11);
		collection.add(bike12);
		collection.add(bike13);
		collection.add(bike14);
		collection.add(bike15);
		collection.add(bike16);
		collection.add(bike17);
		collection.add(bike18);
		collection.add("tvs");
		
		System.out.println(collection.size());
		
		System.out.println("after clearing collection");
		
		collection.clear();
		
	}
}
