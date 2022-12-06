package com.xworkz.inter;

import com.xworkz.rules.MetroRule;

public class Metrofollow implements MetroRule {

	public static void main(String[] args) {

		Metrofollow follow = new Metrofollow();

		System.out.println(follow.maintainQues());
		System.out.println(follow.maintainSocialDistance());
		System.out.println(follow.resrvedSeates());
		System.out.println(follow.tickets());
		System.out.println(follow.wearMasks());

		MetroRule metro = new Metrofollow();

		System.out.println(metro.maintainQues());
		System.out.println(metro.maintainSocialDistance());
		System.out.println(metro.resrvedSeates());
		System.out.println(metro.tickets());
		System.out.println(metro.wearMasks());

	}

	@Override
	public boolean wearMasks() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean maintainSocialDistance() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean tickets() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String resrvedSeates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String maintainQues() {
		// TODO Auto-generated method stub
		return null;
	}

}
