package com.xworkz.inter;

import com.xworkz.rules.CovidRule;

public class CitizenFollows implements CovidRule {

	public static void main(String[] args) {

		CovidRule rule = new CitizenFollows();

		System.out.println(rule.wearMask());
		System.out.println(rule.sanitised());
		System.out.println(rule.socialDistance());
		System.out.println(rule.quarantine());

		CitizenFollows follow = new CitizenFollows();

		System.out.println(follow.wearMask());
		System.out.println(follow.sanitised());
		System.out.println(follow.socialDistance());
		System.out.println(follow.quarantine());

	}

	@Override
	public String wearMask() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean sanitised() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String socialDistance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String quarantine() {
		// TODO Auto-generated method stub
		return null;
	}

}
