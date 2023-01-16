package com.xworkz.chrome.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.chrome.bean.Chrome;
import com.xworkz.chrome.configuration.BrowserConfiguration;
import com.xworkz.chrome.rule.Browser;

public class ChromeRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BrowserConfiguration.class);

		System.out.println(context.getBeanDefinitionCount());
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		
		Chrome chrome = context.getBean(Chrome.class);
		chrome.browse();
		
		
		//System.out.println(chrome);
		
	}

}
