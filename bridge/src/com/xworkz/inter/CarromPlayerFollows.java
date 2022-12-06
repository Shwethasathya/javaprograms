package com.xworkz.inter;

import com.xworkz.rules.CarromRule;

public class CarromPlayerFollows implements CarromRule {

	public static void main(String[] args) {

		CarromRule carrom = new CarromPlayerFollows();
		System.out.println(carrom.noOfPlayers());
		System.out.println(carrom.noOfPoints());
		System.out.println(carrom.strikerPositions());
		System.out.println(carrom.toss());
		System.out.println(carrom.win());

		CarromPlayerFollows follow = new CarromPlayerFollows();

		System.out.println(follow.noOfPlayers());
		System.out.println(follow.noOfPoints());
		System.out.println(follow.strikerPositions());
		System.out.println(follow.toss());
		System.out.println(follow.win());

	}

	@Override
	public int noOfPoints() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int noOfPlayers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String strikerPositions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toss() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean win() {
		// TODO Auto-generated method stub
		return false;
	}

}
