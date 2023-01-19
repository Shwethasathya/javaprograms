package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.Configuration.SpringConfiguration;
import com.xworkz.soldier.dto.MissileDto;
import com.xworkz.soldier.service.MissileService;

public class MissileRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		MissileService service = container.getBean(MissileService.class);
		boolean save = service.validateAndSave(new MissileDto());
		System.out.println("saved " + save);
	}

}
