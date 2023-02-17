package com.xworkz.programs;

public class StarPrograms {

	public static void main(String[] args) {

		for (int i = 0; i <= 4; i++) // print line by line
		{
			System.out.print(" * ");
		}

		for (int i = 0; i <= 5; i++) { // print side by side
			System.out.println(" * ");

		}

		for (int i = 0; i <= 3; i++) { // print square matrix
			for (int j = 0; j <= 3; j++) {
				System.out.print(" @ ");
			}
			System.out.println(" ");
		}
		System.out.println(System.lineSeparator());
		System.out.println("printing square matrix with numbers");
		for (int i = 0; i <= 3; i++) { // printing square matrix with numbers
			for (int j = 1; j <= 3; j++) {
				System.out.print(i);
			}
			System.out.println("  ");
		}

		for (int i = 1; i <= 3; i++) { // printing square matrix with character s when j is = 3
			for (int j = 1; j <= 3; j++) {
				if (j == 3) {
					System.out.print("s ");
				} else {
					System.out.print(i);
				}
			}
			System.out.println(" ");
		}
		System.out.println("============");
		for (int i = 1; i <= 3; i++) { // printing name in square matrix with in 2nd row
			for (int j = 0; j <= 3; j++) {
				if (i == 2) {
					System.out.print("shwe ");
				} else {
					System.out.print(i);
				}
			}
			System.out.println(" ");

		}

		System.out.println(System.lineSeparator());
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print("S");
			}
			System.out.println(" ");

		}

		System.out.println("++++++++++++++++++++");

		for (int i = 1; i <= 3; i++) {
			for (int j = i; j <= 3; j++) {

				System.out.print(j);
			}
			System.out.println(" ");

		}
	}
}

//i=0
// j=0, 1,2,3
//i=1
//j=0,1,2,3 --if i increments 1 time j increments 4 times