package com.xworkz.inter;

import com.xworkz.rules.AirportRule;

public class AirportRuleFollower implements AirportRule {

	public static void main(String[] args) {
		
		AirportRule air=new AirportRuleFollower();
		
		System.out.println(air.baggageLimitations());
		System.out.println(air.maintainSocialDistancing());
		System.out.println(air.obtainBoardingPass());
		System.out.println(air.reportingTime());
		System.out.println(air.securityCheck());
		
		
		AirportRuleFollower follow=new AirportRuleFollower();
		
		System.out.println(follow.baggageLimitations());
		System.out.println(follow.maintainSocialDistancing());
		System.out.println(follow.obtainBoardingPass());
		System.out.println(follow.reportingTime());
		System.out.println(follow.securityCheck());
		
		
		
	}

	@Override
	public boolean obtainBoardingPass() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean baggageLimitations() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int reportingTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean securityCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean maintainSocialDistancing() {
		// TODO Auto-generated method stub
		return false;
	}
}
