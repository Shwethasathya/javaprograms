package com.xworkz.programs;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "Java is a object oriented prgramming language";
		str = str.replaceAll(" ", "");
		System.out.println(str);
	}

}
