package com.xworkz.bean.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bean.bean.Book;
import com.xworkz.bean.bean.HardwareShop;
import com.xworkz.bean.bean.Pencil;
import com.xworkz.bean.bean.Rubber;
import com.xworkz.bean.bean.Software;
import com.xworkz.bean.bean.SoftwareEngineer;
import com.xworkz.bean.configuration.SpringConfiguration;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();

		System.out.println(Arrays.toString(beanNames));

		HardwareShop refOfHardwareShop = container.getBean(HardwareShop.class);
		System.out.println(refOfHardwareShop);

		Software software = container.getBean(Software.class);
		System.out.println(software);

		SoftwareEngineer engineer = container.getBean(SoftwareEngineer.class);
		System.out.println(engineer);

		Rubber rubber = container.getBean(Rubber.class);
		System.out.println(rubber);

		Book book = container.getBean(Book.class);
		System.out.println(book);

		Pencil pencil = container.getBean(Pencil.class);
		System.out.println(pencil);

	}

}
