package com.bridgelab.genericsprogram.test;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelab.genericsprograms.GenericsPrograms;

public class TestGenericsPrograms {

	// Now I Solve UC2- Given 3 Float find the Maximum........

	@Test
	public void givenThreeNumber_AsFloat_Should_ReturnMaxAmoungThem() {
		Float maxNumber = GenericsPrograms.findingMaxFloatNumber(10.2f, 45.3f, 8.4f);
		Assert.assertEquals(Float.valueOf(45.3f), maxNumber);
	}

	@Test
	public void givenMaxNumberAt_1stPosition_Should_Return_SameNumber() {
		Float maxNumber = GenericsPrograms.findingMaxFloatNumber(50.2f, 40.2f, 30.2f);
		Assert.assertEquals(Float.valueOf(50.2f), maxNumber);
	}

	@Test
	public void givenMaxNumberAt_2ndPosition_Should_Return_SameNumber() {
		Float maxNumber = GenericsPrograms.findingMaxFloatNumber(40.3f, 50.2f, 30.3f);
		Assert.assertEquals(Float.valueOf(50.2f), maxNumber);
	}

	@Test
	public void givenMaxNumberAt_3rdPosition_Should_Return_SameNumber() {
		Float maxNumber = GenericsPrograms.findingMaxFloatNumber(40.4f, 30.4f, 50.2f);
		Assert.assertEquals(Float.valueOf(50.2f), maxNumber);
	}

}
