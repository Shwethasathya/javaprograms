package com.xworkz.inter;

import com.xworkz.rules.ArmyRule;

public class ArmyFollower implements ArmyRule {

	public static void main(String[] args) {

		ArmyRule army = new ArmyFollower();

		System.out.println(army.Education());
		System.out.println(army.Enrollment());
		System.out.println(army.Height());
		System.out.println(army.Percentage());
		System.out.println(army.Reservations());

		ArmyFollower follow = new ArmyFollower();

		System.out.println(follow.Education());
		System.out.println(follow.Enrollment());
		System.out.println(follow.Height());
		System.out.println(follow.Percentage());
		System.out.println(follow.Reservations());

	}

	@Override
	public String Education() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double Percentage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Height() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String Reservations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Enrollment() {
		// TODO Auto-generated method stub
		return null;
	}

}
