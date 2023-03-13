package com.xworkz.court.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class CourtConfiguration {

	public CourtConfiguration() {
		System.out.println("created" + getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver() {  
		
		System.out.println("registering custom viewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("registering LocalContainerEntityManagerFactoryBean->EntityManagerFactory");
		return new LocalContainerEntityManagerFactoryBean();
	}
}
