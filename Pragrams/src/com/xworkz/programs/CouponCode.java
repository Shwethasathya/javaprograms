package com.xworkz.programs;

import java.util.Scanner;

public class CouponCode {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0;
		// CT202001S

		String string = str.substring(0, 2);
		// System.out.println(string);

		String string1 = str.substring(2, 6);
		// System.out.println(string1);

		String string2 = str.substring(7, 9);
		// System.out.println(string2);

		/*
		 * int convert=Integer.parseInt(string1); System.out.println(convert);
		 */
		int convert1 = Integer.valueOf(string1);
		// System.out.println("value"+convert1);

		if (str.length() == 9 && convert1 == 2020) {

			if (string2.charAt(string2.length() - 1) >= 'A' && string2.charAt(0) <= 'Z') {

				if (string.charAt(0) >= 'A' && string.charAt(0) <= 'Z') {

					count++;
				}

			}
			}
			if (count == 0) {
				System.out.println("valid coupon");
			}
		 else {
			System.out.println("not valid");
		}

	}
}
