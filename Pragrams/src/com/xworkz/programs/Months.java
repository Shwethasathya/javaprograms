package com.xworkz.programs;

import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the month");
		int month=scanner.nextInt();
		
		if(month==1) {
			System.out.println(month+ " +january");
		}
	}
}
