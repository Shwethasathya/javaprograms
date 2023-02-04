package com.xworkz.goa.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class GoaConfiguration {

	public GoaConfiguration() {
		System.out.println("created " + getClass().getSimpleName());
	}
}
