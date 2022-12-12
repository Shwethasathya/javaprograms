package com.xworkz.repository.thing;

import com.xworkz.repository.event.SweetSizeExceeedException;
import com.xworkz.repository.rule.SweetRepository;

public class SweetRepositoryImple implements SweetRepository {

	String[] sweets = new String[10];

	int sweetIndex = 0;

	@Override
	public int totalSweets() {
		
		return 0;
	}

	@Override
	public boolean create(String sweet) {
		if (this.sweetIndex > this.sweets.length) {
			throw new SweetSizeExceeedException();
		}
		this.sweets[sweetIndex] = sweet;
		this.sweetIndex++;
		return false;

	}

}
