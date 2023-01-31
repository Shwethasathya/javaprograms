package com.xworkz.webspring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringBeanConfiguration {

	public SpringBeanConfiguration() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
}
