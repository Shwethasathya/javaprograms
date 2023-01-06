package com.xworkz.programs;

public class Addition {

	public static int sum(int a, int b) {

		for (int i = 1; i <= b; i++)
			a++;
		return a;

	}

	public static void main(String[] args) {

		int a = sum(2, 4);

		System.out.println(a);

	}

}
