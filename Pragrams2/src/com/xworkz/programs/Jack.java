package com.xworkz.programs;

public class Jack {
	public static void main(String[] args) {

		int num = 5;
		int temp = num;
		int count = 0;
		while (num > 0) {

			System.out.println(num);

			num = num / 10;
			count++;
		}
		
		System.out.println(((int) Math.pow(5, count)) * temp);

	}

}
