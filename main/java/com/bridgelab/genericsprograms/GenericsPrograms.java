package com.bridgelab.genericsprograms;

public class GenericsPrograms<E> {
	public static <X extends Comparable> X findingMaxGenerics(X a1, X a2, X a3) {
		X max = a1;
		if (a1.hashCode() > a2.hashCode() && a1.hashCode() > a3.hashCode()) {
			max = a1;
		} else if (a2.hashCode() > a1.hashCode() && a2.hashCode() > a3.hashCode()) {
			max = a2;
		} else
			max = a3;
		return max;
	}

	public static <X> X testMaximum(X x, X y, X z) {
		X max = x;
		if (x.hashCode() > y.hashCode() && x.hashCode() > z.hashCode()) {
			max = x;
		} else if (y.hashCode() > x.hashCode() && y.hashCode() > z.hashCode()) {
			max = y;
		} else
			max = z;
		return max;

	}

	public static <X> void printMaxNumber(X maxNumberToBePrinted) {
		System.out.println("Maximum number among three number:" + maxNumberToBePrinted);
	}

	public <X> X testMaximum() {

		X maxNumber = (X) testMaximum();
		printMaxNumber(maxNumber);
		return maxNumber;
	}

}