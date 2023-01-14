package com.xworkz.auto.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	@Autowired
	private Camera camera;

	public void camera() {
		System.out.println(this.hashCode() + "camera ref");
	}
}
