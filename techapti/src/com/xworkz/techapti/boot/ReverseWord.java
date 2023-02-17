package com.xworkz.techapti.boot;

public class ReverseWord {

	public static void main(String[] args) {

		String str = "java program to reverse word in a string";
		String splitArray[] = str.split(" ");

		for (int i = splitArray.length - 1; i >= 0; i--) {
			System.out.println( splitArray[i]);
		}

	}
}
