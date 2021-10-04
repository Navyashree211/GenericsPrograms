package com.bridgelab.genericsprogram.test;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelab.genericsprograms.GenericsPrograms;

public class TestGenericsPrograms {
	@Test
	public void givenThreeNumber_AsInter_Should_ReturnMaxAmoungThem() {
		Integer maxNumber = GenericsPrograms.findingMaxNumber(15, 88, 45);
		Assert.assertEquals(Integer.valueOf(88), maxNumber);
	}

	@Test
	public void givenMaxNumberAt_1stPosition_Should_ReturnMax() {
		Integer maxNumber = GenericsPrograms.findingMaxNumber(50, 40, 30);
		Assert.assertEquals(Integer.valueOf(50), maxNumber);
	}

	@Test
	public void givenMaxNumberAt_2ndPosition_Should_Return_SameNumber() {
		Integer maxNumber = GenericsPrograms.findingMaxNumber(40, 50, 30);
		Assert.assertEquals(Integer.valueOf(50), maxNumber);
	}

	@Test
	public void givenMaxNumberAt_3rdPosition_Should_Return_SameNumber() {
		Integer maxNumber = GenericsPrograms.findingMaxNumber(40, 30, 50);
		Assert.assertEquals(Integer.valueOf(50), maxNumber);
	}

}
