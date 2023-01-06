package com.xworkz.programs;

public class RemoveDuplicates {

	public static String remove(String str) {
		String string = new String();

		int length = str.length();
		for (int i = 0; i < length; i++) {
			char charAtPosition = str.charAt(i);
			if (string.indexOf(charAtPosition) < 0) {
				string.charAt(i);
			}
		}
		System.out.println(string);
		return null;

	}

	public static void main(String[] args) {
		
		String str="Remove duplicates in the string the string";
		remove(str);

	}

}
