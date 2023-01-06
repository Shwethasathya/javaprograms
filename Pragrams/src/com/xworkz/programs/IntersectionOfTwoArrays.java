package com.xworkz.programs;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5, 6, 7 };
		int b[] = { 2, 3, 6, 7, 9, 10 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.print(b[j]);
				}
			}
		}
	}

}
