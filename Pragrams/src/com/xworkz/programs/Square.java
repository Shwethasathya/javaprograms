/* program to print write a program: 
 *                          
1 2 3 4 5                                              
1 2 3 4                                     
1 2 3
1 2
1*/

package com.xworkz.programs;

public class Square {

	public static void main(String[] args) {
		int n = 6;
		System.out.println("printing triangle");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				
				if(j==3) {
				System.out.print("X-workz");
			}
			}
			System.out.println(" ");

		}
	}
}
