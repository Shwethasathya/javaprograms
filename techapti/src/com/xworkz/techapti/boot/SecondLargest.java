package com.xworkz.techapti.boot;

class SecondLargest {

	public static int second(int[] array, int total) {
		int temp = 0;

		for (int i = 0; i < total; i++) {

			for (int j = i + 1; j < total; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[total - 2];
	}

	public static void main(String[] args) {

		int[] array = { 3, 5, 2, 1, 6 };

		System.out.println("second largest " + second(array, 5));
	}
}