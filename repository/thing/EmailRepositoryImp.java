package com.xworkz.repository.thing;

import com.xworkz.repository.event.EmailSizeExceedException;
import com.xworkz.repository.rule.EmailRepository;

public class EmailRepositoryImp implements EmailRepository {

	private String[] emails = new String[5];
	private int emailIndex = 0;

	@Override
	public boolean create(String email) {
		System.out.println("creating emails...");

		if (this.emailIndex > this.emails.length) {
			throw new EmailSizeExceedException();
		}
		this.emails[emailIndex] = email;
		this.emailIndex++;
		return false;
	}

	@Override
	public int totalEmail() {
		System.out.println("total emails are");
		return 0;
	}

}
