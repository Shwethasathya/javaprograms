package com.xworkz.inter;

import com.xworkz.rules.HostelRules;

public class StudentsFollowHostel implements HostelRules {

	public static void main(String[] args) {

		HostelRules rules = new StudentsFollowHostel();

		rules.followTimings();
		rules.mobilePhonesallowed();
		rules.outsideFoodAllowed();
		rules.outSidersAllowed();

		StudentsFollowHostel hostel = new StudentsFollowHostel();
		hostel.followTimings();
		hostel.mobilePhonesallowed();
		hostel.outsideFoodAllowed();
		hostel.outSidersAllowed();

	}

	@Override
	public boolean outsideFoodAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String followTimings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean outSidersAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mobilePhonesallowed() {
		// TODO Auto-generated method stub
		return false;
	}

}
