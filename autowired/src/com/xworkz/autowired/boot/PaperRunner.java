package com.xworkz.autowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired.bean.Engine;
import com.xworkz.autowired.bean.Ghost;
import com.xworkz.autowired.bean.NewsPaper;
import com.xworkz.autowired.bean.Snake;
import com.xworkz.autowired.configuration.PaperConfiguration;

public class PaperRunner {
	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(PaperConfiguration.class);

		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());

		NewsPaper newsPaper = container.getBean(NewsPaper.class);
		System.out.println(newsPaper);

		Engine engine = container.getBean(Engine.class);
		System.out.println(engine);

		Snake snake = container.getBean(Snake.class);
		System.out.println(snake);

		Ghost ghost =container.getBean(Ghost.class);
		System.out.println(ghost);
	}
}
