package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

public class CurrenciesRunner {

	public static void main(String[] args) {
		
		String curren="rupees";
		String curren1="US dolar";
		String curren2="European euro";
		String curren3="japanese yen";
		String curren4="swiss franc";
		String curren5="canadian dollar";
		String curren6="AUD";
		String curren7="NZD";
		String curren8="ZAR";
		String curren9="AFN";
		String curren10="Albanian lek";
		String curren11="angolan kwanza";
		String curren12="east caribbean dollar";
		String curren13="argentine peso";
		String curren14="armenian dram";
		String curren15="aruban florin";
		String curren16="saint helena pound";
		String curren17="azerbaijan manat";
		String curren18="bahamian dollar";
		String curren19="bahraini dinar";
		String curren20="barbadian dollar";
		String curren21="cabo verdean escudo";
		String curren22="chilean peso";
		String curren23="colombian peso";
		String curren24="cook island dollar";
		String curren25="coratian kuna";
		String curren26="danish krone";
		String curren27="kenyan shiling";
		String curren28="lao kip";
		
		
		Collection<String> collection = new ArrayList();
		
		collection.add(curren1);
		collection.add(curren2);
		collection.add(curren3);
		collection.add(curren4);
		collection.add(curren5);
		collection.add(curren6);
		collection.add(curren7);
		collection.add(curren8);
		collection.add(curren9);
		collection.add(curren10);
		collection.add(curren11);
		collection.add(curren13);
		collection.add(curren12);
		collection.add(curren14);
		collection.add(curren15);
		collection.add(curren16);
		collection.add(curren17);
		collection.add(curren18);
		collection.add(curren19);
		collection.add(curren20);
		collection.add(curren21);
		collection.add(curren22);
		collection.add(curren23);
		collection.add(curren24);
		collection.add(curren25);
		collection.add(curren26);
		collection.add(curren27);
		collection.add(curren28);
	
		System.out.println("size of collection is : " +collection.size());
		
		collection.clear();
		
		System.out.println("after clearing size is");
	
	}

}
