package com.xworkz.court.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan("com.xworkz")
@Slf4j
public class CourtConfiguration {

	public CourtConfiguration() {
		log.info("created" + getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver() {
		log.info("registering custom viewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	@Order(1)
	public MultipartResolver multipartResolver() {
		System.out.println("Registering MultipartResolver");
		return new StandardServletMultipartResolver();
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("registering LocalContainerEntityManagerFactoryBean->EntityManagerFactory");
		return new LocalContainerEntityManagerFactoryBean();
	}
}
