package com.xworkz.repository.boot;

import com.xworkz.repository.rule.SweetRepository;
import com.xworkz.repository.thing.SweetRepositoryImple;

public class SweetRunner {

	public static void main(String[] args) {

		SweetRepository repository = new SweetRepositoryImple();
		repository.create("Rasmalai");
		repository.create("Jamun");
		repository.create("Chiroti");
		repository.create("Rasgulla");
		repository.create("Kesaribath");
		repository.create("Badusha");
		repository.create("Pongal");
		repository.create("kaju barfi");
		repository.create("mysorepak");
		repository.create("peda");

		System.out.println(repository.totalSweets());

	}
}
