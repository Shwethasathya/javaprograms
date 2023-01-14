package com.xworkz.auto.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.auto.Skill;
import com.xworkz.auto.bean.Assistant;
import com.xworkz.auto.bean.Battery;
import com.xworkz.auto.bean.Camera;
import com.xworkz.auto.bean.CameraMan;
import com.xworkz.auto.bean.Company;
import com.xworkz.auto.bean.Director;
import com.xworkz.auto.bean.Experience;
import com.xworkz.auto.bean.Lens;
import com.xworkz.auto.bean.Location;
import com.xworkz.auto.bean.Movie;
import com.xworkz.auto.bean.Producer;
import com.xworkz.auto.configuration.AreaConfiguration;

public class Runner {
public static void main(String[] args) {
	
	ApplicationContext context = new AnnotationConfigApplicationContext(AreaConfiguration.class);
	System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
	
	Movie movie = context.getBean(Movie.class);
	movie.director();
	movie.producer();

	Director director = context.getBean(Director.class);
	director.experience();
	
	Experience experience=context.getBean(Experience.class);
	experience.skill();
	
	CameraMan cameraMan = context.getBean(CameraMan.class);
	cameraMan.camera();
	
	Camera camera=context.getBean(Camera.class);
	camera.battery();
	
	Lens lens=context.getBean(Lens.class);
	lens.battery();
	
	Battery battery=context.getBean(Battery.class);
	battery.capacity();
	
	Producer producer = context.getBean(Producer.class);
	producer.Assistant();
	
	Assistant assistant=context.getBean(Assistant.class);
	assistant.Company();
	
	Company company=context.getBean(Company.class);
	company.location();
	
	Location location=context.getBean(Location.class);
	location.area();
	
	
}
}
