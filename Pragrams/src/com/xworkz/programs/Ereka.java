package com.xworkz.programs;

import java.util.Scanner;

public class Ereka {

	public static void main(String[] args) {

		int count = 0;
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int end = scanner.nextInt();

		/*
		 * System.out.println(start); System.out.println(end);
		 */
		for (int i = start; i <= end; i++) {
			// System.out.println(i);
			int num = i;
			int temp = num;
			System.out.print(" " + temp);
			for (; temp != 0; temp = temp / 10) {
				count++;
			}
			
			int n = temp;
			int ref = 0;
			int sum = 0;
			
			
			
			

		}
	}

}
