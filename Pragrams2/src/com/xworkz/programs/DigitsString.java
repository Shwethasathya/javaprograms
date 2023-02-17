package com.xworkz.programs;

public class DigitsString {

	public static boolean digits(String str, int n) {

		for (int i = 0; i < n; i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String str = "java1234";
		int a = str.length();
		System.out.println(digits(str.a);
	}

}
