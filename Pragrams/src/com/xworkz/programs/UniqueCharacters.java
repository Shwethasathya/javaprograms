package com.xworkz.programs;

public class UniqueCharacters {

	

	public static void main(String[] args) {
		
		String str="Unique x characters in the string";
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					return;

				}
				
			}
			System.out.println("unique characters in the string are "+i);
		}
		
	}

}
