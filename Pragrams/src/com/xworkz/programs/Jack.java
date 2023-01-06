package com.xworkz.programs;

public class Jack {
	public static void main(String[] args) {
		int num = 55;
		int temp = num;
		int count = 0;
		while (num > 0) {

			num = num / 10;
			count++;
		}

		System.out.println(((int) Math.pow(5, count)) * temp);

	}

}
