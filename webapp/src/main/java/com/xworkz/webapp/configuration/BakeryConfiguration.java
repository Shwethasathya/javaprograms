package com.xworkz.webapp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class BakeryConfiguration {

	public BakeryConfiguration() {
		System.out.println("created " + getClass().getSimpleName());
	}
	
	
}
