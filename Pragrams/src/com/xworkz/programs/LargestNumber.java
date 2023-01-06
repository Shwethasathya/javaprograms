package com.xworkz.programs;

public class LargestNumber {

	public static void main(String[] args) {

		int array[] = { 4, 3, 7, 6, 5 };

		int temp = 0;

		for (int i = 0; i < array.length; i++) { // 0<6;
			if (array[i] > temp) {
				temp = array[i];

			}
		}

		System.out.println("third larget number is :" + temp);
	}

}
