package com.xworkz.techapti.boot;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		int count=3;
		
		System.out.print(a +" " +b);
		for(int i=2;i<=count;i++) {
			
			c=a+b;
			System.out.print(" "+c);	
			a=b;
			b=c;
		}
	//	System.out.println(c);
	}
}

	
	