package com.xworkz.inter;

import com.xworkz.rules.SchoolRule;

public class StudentFollow implements SchoolRule {

	public static void main(String[] args) {

		StudentFollow follow = new StudentFollow();

		System.out.println(follow.Attendance());
		System.out.println(follow.LeaveApplication());
		System.out.println(follow.Ontime());
		System.out.println(follow.Uniform());

		SchoolRule rule = new StudentFollow();

		System.out.println(rule.Attendance());
		System.out.println(rule.LeaveApplication());
		System.out.println(rule.Ontime());
		System.out.println(rule.Uniform());

	}

	@Override
	public boolean Uniform() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String Ontime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Attendance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String LeaveApplication() {
		// TODO Auto-generated method stub
		return null;
	}

}
