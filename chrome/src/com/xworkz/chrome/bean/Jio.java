package com.xworkz.chrome.bean;

import org.springframework.stereotype.Component;

import com.xworkz.chrome.rule.Provider;
@Component
public class Jio implements Provider {

	@Override
	public void connect() {
		System.out.println("calling connect from Provider");
	}

}
