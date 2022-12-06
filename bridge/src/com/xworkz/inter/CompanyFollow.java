package com.xworkz.inter;

import com.xworkz.rules.CompanyRule;

public class CompanyFollow implements CompanyRule {

	public static void main(String[] args) {

		CompanyRule company = new CompanyFollow();

		System.out.println(company.loginTime());
		System.out.println(company.logoutTime());
		System.out.println(company.meetings());
		System.out.println(company.pantry());
		System.out.println(company.workingHours());

		CompanyFollow follow = new CompanyFollow();

		System.out.println(follow.loginTime());
		System.out.println(follow.logoutTime());
		System.out.println(follow.meetings());
		System.out.println(follow.pantry());
		System.out.println(follow.workingHours());
	}

	@Override
	public float loginTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float logoutTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int workingHours() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String meetings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String pantry() {
		// TODO Auto-generated method stub
		return null;
	}
}
