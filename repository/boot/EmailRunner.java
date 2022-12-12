package com.xworkz.repository.boot;

import com.xworkz.repository.rule.EmailRepository;
import com.xworkz.repository.thing.EmailRepositoryImp;

public class EmailRunner {

	public static void main(String[] args) {

		EmailRepository emailRepository = new EmailRepositoryImp();
		emailRepository.create("sshwetha.xworkz@gmail.com");
		emailRepository.create("shwethas.xworkz@gmail.com");
		emailRepository.create("shilpa14.xworkz@gmail.com");
		emailRepository.create("pavitras.xworkz@gmail.com");
		emailRepository.create("shwe67kj.xworkz@gmail.com");
		emailRepository.create("swethashwe.xworkz@gmail.com");

		System.out.println(emailRepository.totalEmail());
	}
}
