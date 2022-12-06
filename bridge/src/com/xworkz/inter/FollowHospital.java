package com.xworkz.inter;

import com.xworkz.rules.Hospital;

public class FollowHospital implements Hospital {

	public static void main(String[] args) {

		Hospital hospital = new FollowHospital();

		System.out.println(hospital.feePay());
		System.out.println(hospital.generalWard());
		System.out.println(hospital.noiseReduction());
		System.out.println(hospital.operation());
		System.out.println(hospital.visitingHours());

		FollowHospital follow = new FollowHospital();

		System.out.println(follow.feePay());
		System.out.println(follow.generalWard());
		System.out.println(follow.noiseReduction());
		System.out.println(follow.operation());
		System.out.println(follow.visitingHours());

	}

	@Override
	public boolean noiseReduction() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int visitingHours() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double feePay() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean operation() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean generalWard() {
		
		return false;
	}

}
