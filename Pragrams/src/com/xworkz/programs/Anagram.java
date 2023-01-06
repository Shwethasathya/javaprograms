package com.xworkz.programs;

import java.util.Arrays;

public class Anagram {

	public static boolean anagramProgram(char[] str1, char[] str2) {
		int a = str1.length;
		int b = str2.length;

		if (a != b)
			return false;

		Arrays.sort(str1);
		Arrays.sort(str2);

		for (int i = 0; i < a; i++) {
			if (str1[i] != str2[i])
				return false;
		}
		return false;
	}

}
