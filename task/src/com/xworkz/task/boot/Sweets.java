package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.TreeSet;

public class Sweets {

	public static void main(String[] args) {
		
		String sweet1 = "rasmali";
		String sweet2 = "jamun";
		String sweet3 = "rasgulla";
		String sweet4 = "chiroti";
		String sweet5 = "badhusha";
		String sweet6 = "kaju barfi";
		String sweet7 = "apple cake";
		String sweet8 = "ladu";
		String sweet9 = "kadubu";
		String sweet10 = "mysorepak";
		String sweet11 = "payasa";
		String sweet12 = "jelebi";
		String sweet13 = "kesaribath";
		String sweet14 = "Halwa";
		String sweet15 = "basundi";
		String sweet16 = "malpua";
		String sweet17 = "peda";
		String sweet18 = "obbattu";
		
		Collection<String> collection=new TreeSet<String>();
		
		collection.add(sweet18);
		collection.add(sweet15);
		collection.add(sweet16);
		collection.add(sweet17);
		collection.add(sweet12);
		collection.add(sweet13);
		collection.add(sweet14);
		collection.add(sweet1);
		collection.add(sweet2);
		collection.add(sweet3);
		collection.add(sweet4);
		collection.add(sweet5);
		collection.add(sweet7);
		collection.add(sweet8);
		collection.add(sweet9);
		collection.add(sweet10);
		collection.add(sweet6);
		collection.add(sweet11);
		
		
		System.out.println("size is " +collection.size());
		//collection.clear();
		System.out.println("after clearing " );
		collection.clear();
	}
}
