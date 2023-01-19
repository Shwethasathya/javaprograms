package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.Configuration.SpringConfiguration;
import com.xworkz.soldier.dto.ResortDto;
import com.xworkz.soldier.service.ResortService;

public class ResortRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		ResortService service = container.getBean(ResortService.class);
		boolean saved = service.validateAndSave(new ResortDto());
		System.out.println("saved " + saved);

	}

}
