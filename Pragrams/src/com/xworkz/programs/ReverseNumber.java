package com.xworkz.programs;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 7411944;
		int reverse = 0;
		while (num != 0) {
			int value = num % 10;
			reverse = (reverse * 10) + value;
			num = num / 10;
		}
		System.out.println("the reverse of the given number is : " + reverse);
	}

}
