package com.xworkz.rules;

public interface AirportRule {

	boolean obtainBoardingPass();

	boolean baggageLimitations();

	int reportingTime();

	boolean securityCheck();

	boolean maintainSocialDistancing();

}
