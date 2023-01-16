package com.xworkz.chrome.bean;

import org.springframework.stereotype.Component;

import com.xworkz.chrome.rule.Browser;
@Component
public class FireBox implements Browser {

	@Override
	public void browse() {
		System.out.println("calling browse method from Browser");
	}

}
