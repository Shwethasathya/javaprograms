package com.xworkz.techapti.boot;

public class StringReverse {

	public static void main(String[] args) {

		String str = "java";

		// int a= str.length();

		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));
		}
	}
}