package com.xworkz.inter;

import com.xworkz.rules.BankingRule;

public class FollowsBankRule implements BankingRule {

	public static void main(String[] args) {

		FollowsBankRule rule = new FollowsBankRule();

		rule.NoOfStaffs();
		rule.PrintPassbook();
		rule.Withdraw();
		rule.Check();
		rule.TokenSystem();

		FollowsBankRule rule1 = new FollowsBankRule();

		rule1.NoOfStaffs();
		rule1.PrintPassbook();
		rule1.Withdraw();
		rule1.Check();
		rule1.TokenSystem();
	}

	@Override
	public boolean Withdraw() {
		System.out.println("running withdraw method");
		return false;
	}

	@Override
	public boolean Check() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int NoOfStaffs() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String PrintPassbook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean TokenSystem() {
		// TODO Auto-generated method stub
		return false;
	}

}
