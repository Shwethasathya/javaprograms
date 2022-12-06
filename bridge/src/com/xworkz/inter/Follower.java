package com.xworkz.inter;

import com.xworkz.rules.TrafficRules;

public class Follower implements TrafficRules {

	public static void main(String[] args) {
		TrafficRules rules = new Follower();

		System.out.println(rules.wearHelmet());
		System.out.println(rules.renewlicense());
		System.out.println(rules.tripleRide());
		System.out.println(rules.oneWay());
		System.out.println(rules.wearSeatBelt());

		Follower follow = new Follower();

		System.out.println(follow.wearHelmet());
		System.out.println(follow.renewlicense());
		System.out.println(follow.tripleRide());
		System.out.println(follow.oneWay());
		System.out.println(follow.wearSeatBelt());

	}

	@Override
	public boolean renewlicense() {
		return false;
	}

	@Override
	public boolean tripleRide() {
		return false;
	}

	@Override
	public boolean wearHelmet() {
		return false;
	}

	@Override
	public String oneWay() {
		return null;
	}

	@Override
	public boolean wearSeatBelt() {
		// TODO Auto-generated method stub
		return false;
	}

}
