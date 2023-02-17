package com.xworkz.programs;

public class Square {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			for (int j = 0; j <= 4; j++) {
				System.out.print("N");
			}

			System.out.println("");
		}
		

		System.out.println("printing triangle");
		for (int i = 2; i <= 5; i++) {
			for (int j = i-1; j <= 4; j++) {
				System.out.print(j);
			}
			
			System.out.println("");

		}
	}
}
