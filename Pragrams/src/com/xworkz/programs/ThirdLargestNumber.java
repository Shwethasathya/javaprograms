package com.xworkz.programs;

public class ThirdLargestNumber {

	public static void main(String[] args) {

		int array[] = { 4, 3, 7, 6, 5 };

		int temp;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("third larget number is :" + array[array.length - 3]);
	}

}
