//sum of elements in given array

package com.xworkz.programs;

public class SumOfElements {

	static int array[]= {2,4,6,8,8};
	
	static int sum()
	{
		int sum=0;
		
		for (int j = 0; j <= array.length; j++) {
			sum=sum+array[j];
			return sum;
			
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println("sum of given array is "+sum());
		
	}

}
