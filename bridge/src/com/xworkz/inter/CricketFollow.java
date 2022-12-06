package com.xworkz.inter;

import com.xworkz.rules.Cricket;

public class CricketFollow implements Cricket {

	public static void main(String[] args) {

		Cricket cricket = new CricketFollow();

		System.out.println(cricket.batsman());
		System.out.println(cricket.bowelers());
		System.out.println(cricket.noOfPlayers());
		System.out.println(cricket.noOfRuns());
		System.out.println(cricket.umpire());

		CricketFollow follow = new CricketFollow();

		System.out.println(follow.batsman());
		System.out.println(follow.bowelers());
		System.out.println(follow.noOfPlayers());
		System.out.println(follow.noOfRuns());
		System.out.println(follow.umpire());

	}

	@Override
	public int noOfPlayers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String bowelers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String batsman() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String umpire() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int noOfRuns() {
		// TODO Auto-generated method stub
		return 0;
	}

}
