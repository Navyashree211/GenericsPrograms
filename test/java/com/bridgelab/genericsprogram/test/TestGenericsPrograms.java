package com.bridgelab.genericsprogram.test;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelab.genericsprograms.GenericsPrograms;

public class TestGenericsPrograms {

	@Test
	public void givenThreeNumber_AsInteger_Should_ReturnMaxAmoungThem() {
		Integer maxNumber = GenericsPrograms.testMaximum(20, 89, 45);
		Assert.assertEquals(Integer.valueOf(89), maxNumber);
	}

	@Test
	public void givenThreeNumber_AsFloat_Should_ReturnMaxAmoungThem() {
		Float maxNumber = GenericsPrograms.testMaximum(10.2f, 45.3f, 8.4f);
		Assert.assertEquals(Float.valueOf(45.3f), maxNumber);
	}

	@Test
	public void givenThreeValues_Should_ReturnMaxAmongThem() {
		String maxString = GenericsPrograms.testMaximum("L", "Z", "M");
		Assert.assertEquals("Z", maxString);
	}

	@Test
	public void givenMaxNumberAt_1stPosition_Should_Return_SameNumber() {
		Integer maxNumber = GenericsPrograms.testMaximum(50, 40, 30);
		Assert.assertEquals(Integer.valueOf(50), maxNumber);
	}

	@Test
	public void givenMaxNumberAt_2ndPosition_Should_Return_SameNumber() {
		Integer maxNumber = GenericsPrograms.testMaximum(40, 50, 30);
		Assert.assertEquals(Integer.valueOf(50), maxNumber);
	}

	@Test
	public void givenMaxNumberAt_3rdPosition_Should_Return_SameNumber() {
		Integer maxNumber = GenericsPrograms.testMaximum(40, 30, 50);
		Assert.assertEquals(Integer.valueOf(50), maxNumber);
	}

}
