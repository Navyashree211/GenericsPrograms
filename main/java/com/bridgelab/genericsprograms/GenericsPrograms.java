package com.bridgelab.genericsprograms;

public class GenericsPrograms {
	
	// Now I Solve UC2- Given 3 Floats find the Maximum........ 
	 public static Float findingMaxFloatNumber(Float num1, Float num2, Float num3) {
         Float max = num1;
         if (num2.compareTo(max) > 0) {
             max = num2;
         }
         if (num3.compareTo(max) > 0) {
             max = num3;
         }
         return max;
     }
}
