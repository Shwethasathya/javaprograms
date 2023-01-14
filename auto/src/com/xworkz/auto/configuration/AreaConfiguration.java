package com.xworkz.auto.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.auto")
public class AreaConfiguration {

	public AreaConfiguration() {
		System.out.println("created AreaConfiguration using default constructor");

	}
	
}