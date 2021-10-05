package com.bridgelab.genericsprogram.test;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelab.genericsprograms.GenericsPrograms;

public class TestGenericsPrograms {   
	// Now I Solve UC3- Given 3 String find the Maximum........   
    @Test
    public void givenThreeString_Should_ReturnMaxAmoungThem()  {
        String maxString = GenericsPrograms.findingMaxString("Apple", "Banana", "PineApple");
        Assert.assertEquals("PineApple", maxString);
    }

    @Test
    public void givenMaxNumberAt_1stPosition_Should_Return_SameString() {
        String maxString = GenericsPrograms.findingMaxString("L", "Z", "M");
        Assert.assertEquals("Z", maxString);
    }
	@Test
    public void givenMaxNumberAt_2ndPosition_Should_Return_SameString() {
        String maxString = GenericsPrograms.findingMaxString("L", "Z", "M");
        Assert.assertEquals("Z", maxString);
    }
    @Test
    public void givenMaxNumberAt_3rdPosition_Should_Return_SameString() {
        String maxString = GenericsPrograms.findingMaxString("L", "Z", "M");
        Assert.assertEquals("Z", maxString);
    }


}
