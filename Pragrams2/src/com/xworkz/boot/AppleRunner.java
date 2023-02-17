package com.xworkz.boot;

import com.xworkz.child.Apple;

public class AppleRunner {

	public static void main(String[] args) {


		Apple apple = new Apple("Kashmir apple",150);
		apple.buy();
		apple.sell();
		apple.display();

	}

}
