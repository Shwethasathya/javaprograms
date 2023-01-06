package com.xworkz.programs;

public class Triangles {

	public static void main(String[] args) {

		System.out.println("Printing right angle triangle");
		int n = 4;
		// main loop
		for (int i = 1; i <= n; i++) { // first loop deals with rows

			for (int j = n - 1; j >= i; j--) { // to print loop for space
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println(System.lineSeparator());
		System.out.println("Triangle");
		for (int i = 1; i <= n; i++) { // first loop deals with rows

			for (int j = n - 1; j >= i; j--) { // to print loop for space
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

		System.out.println("triangle in numbers");

		for (int i = 1; i <= n; i++) { // first loop deals with rows

			for (int j = n - 1; j >= i; j--) { // to print loop for space
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i); // to print rows values in triangle need to print i values
			}
			System.out.println("");
		}

		System.out.println("printing column ");
		for (int i = 1; i <= n; i++) { // first loop deals with rows

			for (int j = n - 1; j >= i; j--) { // to print loop for space
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k); // to print column values in triangle need to print k values
			}
			System.out.println("");
		}

		System.out.println("---------------");
		for (int i = 1; i <= n; i++) { // first loop deals with rows

			for (int j = n - 1; j >= i; j--) { // to print loop for space
				System.out.print(j);
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k); // to print column values in triangle need to print k values
			}
			System.out.println("");
		}
		System.out.println("print name in place of 2");
		for (int i = 1; i <= n; i++) { // first loop deals with rows

			for (int j = n - 1; j >= i; j--) {
				if (j == 2) {
					System.out.print("shwe");
				} else {
					System.out.print(j);
				}
			}
			for (int k = 1; k <= i; k++) {
				if (k == 2) {
					System.out.print("shwe");
				} else {
					System.out.print(k); 
				}
			}
			System.out.println("");
		}
		for (int i = 4; i >= n; i--) { 

			for (int j = n - 1; j >= i; j--) { 
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*"); 
			}
			//System.out.println("");
		}
		
	}

}
