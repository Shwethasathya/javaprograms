package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.thing.Application;
import com.xworkz.spring.thing.Area;
import com.xworkz.spring.thing.Bus;
import com.xworkz.spring.thing.Chacolate;
import com.xworkz.spring.thing.City;
import com.xworkz.spring.thing.Cycle;
import com.xworkz.spring.thing.Fish;
import com.xworkz.spring.thing.Girl;
import com.xworkz.spring.thing.God;
import com.xworkz.spring.thing.Mall;
import com.xworkz.spring.thing.Mask;
import com.xworkz.spring.thing.Milk;
import com.xworkz.spring.thing.Park;
import com.xworkz.spring.thing.Patient;
import com.xworkz.spring.thing.Road;
import com.xworkz.spring.thing.Temple;

public class RoadRunner {

	public static void main(String[] args) {
		 
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Road ref = spring.getBean(Road.class);
		
		System.out.println(ref);
		
		Bus bus = spring.getBean(Bus.class);
		System.out.println(bus);
		
		Application application = spring.getBean(Application.class);
		System.out.println(application);
		
		Area area = spring.getBean(Area.class);
		System.out.println(area);
		
		Chacolate chacolate = spring.getBean(Chacolate.class);
		System.out.println(chacolate);

		City city = spring.getBean(City.class);
		System.out.println(city);
		
		Cycle cycle =spring.getBean(Cycle.class);
		System.out.println(cycle);
		
		Fish fish = spring.getBean(Fish.class);
		System.out.println(fish);
		
		Girl girl = spring.getBean(Girl.class);
		System.out.println(girl);
		
		God god = spring.getBean(God.class);
		System.out.println(god);
		
		Mall mall = spring.getBean(Mall.class);
		System.out.println(mall);
		
		Mask mask = spring.getBean(Mask.class);
		System.out.println(mask);
		
		Milk milk = spring.getBean(Milk.class);
		System.out.println(milk);
		
		Park park = spring.getBean(Park.class);
		System.out.println(park);
		
		Patient patient = spring.getBean(Patient.class);
		System.out.println(patient);
		
		Temple temple = spring.getBean(Temple.class);
		System.out.println(temple);
	}

}
