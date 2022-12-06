package com.xworkz.exception.follower;

import com.xworkz.exception.rules.XworkzRule;

public abstract class JavaTrainee extends Person implements XworkzRule {

	public abstract void training();

	public abstract void executeProgram();

	@Override
	public boolean completedProgram() {
		System.out.println("Running completed program...");
		return false;

	}

	@Override
	public void eat() {
		System.out.println("Running eat....");

	}

	@Override
	public boolean sleep() {
		System.out.println("Running sleep.....");
		return false;

	}

	@Override
	public boolean uploadTask() {
		System.out.println("Running upload task.....");
		return false;

	}

}
