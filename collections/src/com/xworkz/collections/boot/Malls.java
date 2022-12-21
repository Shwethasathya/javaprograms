package com.xworkz.collections.boot;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class Malls {

	public static void main(String[] args) {
	
		String mall1="GT Mall";
		String mall2="Lulu mall";
		String mall3="Orion mall";
		String mall4="Forum mall";
		String mall5="Nexus mall";
		String mall6="Gopalan mall";
		String mall7="Gopalan Arcade";
		String mall8="Garuda";
		String mall9="Mantri square";
		String mall10="ETA";
		String mall11="Bangalore central";
		String mall12="Esteem mall";
		String mall13="Elements mall";
		String mall14="Royal meenakshi";
		String mall15="Total mall";
		String mall16="Gopalan signature";
		String mall17="vega";
		String mall18="Ascendas park square";
		String mall19="Vaishnavi saphire centre";
		String mall20="Brookefield mall";
		String mall21="Mantri";
		String mall22="Tibet mall";
		String mall23="the galleria mall";
		String mall24="sangam mall";
		String mall25="kempegowda commercial arcade";
		
		Collection<String> collection = new HashSet();
		
		collection.add(mall1);
		collection.add(mall2);
		collection.add(mall3);
		collection.add(mall4);
		collection.add(mall5);
		collection.add(mall6);
		collection.add(mall7);
		collection.add(mall8);
		collection.add(mall9);
		collection.add(mall10);
		collection.add(mall11);
		collection.add(mall12);
		collection.add(mall13);
		collection.add(mall14);
		collection.add(mall15);
		collection.add(mall16);
		collection.add(mall17);
		collection.add(mall18);
		collection.add(mall19);
		collection.add(mall20);
		collection.add(mall21);
		collection.add(mall22);
		collection.add(mall23);
		collection.add(mall24);
		collection.add(mall25);
		collection.add("royal meenakshi mall");
		collection.add("gopalan mall");
		collection.add("reliance digital");
		collection.add("GVK one mall");
		collection.add("city central shopping mall");
		collection.add("forum sujana mall");
		collection.add("FMG mall");
		collection.add("Bigg bazar");
		collection.add("shoppers stop");
		collection.add("MPM mall");
		collection.add("sanali mall");
		collection.add("next galleria mall");
		collection.add("mysore central mall");
		collection.add("bayside mall");
		collection.add("oberoi mall");
		System.out.println("size is " +collection.size());
		
		collection.clear();
		
		System.out.println("size after clearing " +collection);
		
		
		
	}

	
}
