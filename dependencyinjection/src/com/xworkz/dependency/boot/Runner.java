package com.xworkz.dependency.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.dependency.bean.Shell;

import com.xworkz.dependency.configuration.FuelConfiguration;
import com.xworkz.dependency.rule.PetrolBunk;
public class Runner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(FuelConfiguration.class);
		
		//Shell shell=context.getBean(Shell.class);
		//System.out.println(shell);
		
		PetrolBunk bunk = context.getBean(PetrolBunk.class);
		bunk.purchase();
	}

}
