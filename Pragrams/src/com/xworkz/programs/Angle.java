/* program to print below output
input: abcd
output:A-Bb-Ccc-Ddd */

package com.xworkz.programs;

public class Angle {

	public static void main(String[] args) {

		String str = "abcd";

		for (int i = 0; i < str.length(); i++) {//0
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					System.out.print(str.toUpperCase().charAt(i));
				} else {
					System.out.print(str.toLowerCase().charAt(i));
				}
			}
			System.out.println();
		}
	}
}
