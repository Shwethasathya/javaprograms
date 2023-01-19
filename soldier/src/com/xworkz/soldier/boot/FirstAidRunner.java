package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.Configuration.SpringConfiguration;
import com.xworkz.soldier.dto.FirstAidDto;
import com.xworkz.soldier.service.FirstAidService;

public class FirstAidRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		FirstAidService service = container.getBean(FirstAidService.class);
		boolean save = service.validateAndSave(new FirstAidDto());
		System.out.println("saved " + save);

	}

}
