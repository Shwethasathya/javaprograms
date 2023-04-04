package com.xworkz.cm.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@ComponentScan("com.xworkz.cm")
public class SignUpConfiguration {
	
	public SignUpConfiguration() {
		log.info("created" + getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver() {
		log.info("registering custom viewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		log.info("registering LocalContainerEntityManagerFactoryBean->EntityManagerFactory");
		return new LocalContainerEntityManagerFactoryBean();
	}

}
