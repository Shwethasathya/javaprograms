package com.xworkz.techapti.boot;

public class Prime {

	public static void main(String[] args) {

		int num = 11;
		int count = 0;

		for (int i = 2; i < num; i++) {
			if (num % 2 == 0) {

				count++;
				break;
			}
		}
			if(count==0) 
				System.out.println("the number is prime");
			
			else 
				System.out.println("the number is not prime");
			
			
		}
	}

