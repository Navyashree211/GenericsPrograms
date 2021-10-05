package com.bridgelab.genericsprograms;

public class GenericsPrograms {

	 Now I Solve UC2- Given 3 Strings find the Maximum........

	public static String findingMaxString(String string, String string2, String string3) {
		String max = string;
		if (string2.compareTo(max) > 0) {
			max = string2;
		}
		if (string3.compareTo(max) > 0) {
			max = string3;
		}
		return max;
	}
}
