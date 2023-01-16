package com.xworkz.chrome.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.chrome.rule.Browser;
import com.xworkz.chrome.rule.Provider;
@Component
public class Chrome implements Browser {
	@Autowired
	@Qualifier("jio")
	private Provider provider;

	@Override
	public void browse() {
		System.out.println("calling browse method from Browser");
		provider.connect();
	}

}
