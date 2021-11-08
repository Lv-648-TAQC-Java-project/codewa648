package com.org.ita.kata;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;

import org.testng.Assert;

import java.math.BigInteger;

public class EigthTest extends DataProviderUserImplementation{

    @DataProvider
    public Object[][] wilsonPrimeValidData() {

	Object[][] param = new Object[][] { { 5.0 }, { 13.0 }, { 563.0 }

	};
	return combine(implementationsEightKataDataProvider(), param);
    }

    @Test(dataProvider = "wilsonPrimeValidData")
    public void amIWilsonValidTest(Eight eight, double data) {
	boolean actualResult = eight.amIWilson(data);
	Assert.assertTrue(actualResult);
    }

    @DataProvider
    public Object[][] volumeOfCuboidDataProvider() {
	Object[][] param = new Object[][] { { 1, 2, 2, 4 }, { 6.3, 2, 5, 63 }

	};
	return combine(implementationsEightKataDataProvider(), param);
    }

    @Test(dataProvider = "volumeOfCuboidDataProvider")
    public void getVolumeOfCuboidTest(Eight eight, double a, double b, double c, double expected) {

	Assert.assertEquals(eight.getVolumeOfCuboid(a, b, c), expected);
    }

    @Test
    public void countPositivesSumNegativesTest() {
	throw new RuntimeException("Test not implemented");
    }

    @Test
    public void divisibleByTest() {
	throw new RuntimeException("Test not implemented");
    }

    @Test
    public void litersTest() {
	throw new RuntimeException("Test not implemented");
    }

    @Test
    public void mpgToKPMTest() {
	throw new RuntimeException("Test not implemented");
    }

    @Test
    public void squareOrSquareRootTest() {
	throw new RuntimeException("Test not implemented");
    }

    @DataProvider
    Object[][] stringToNumberDataProvider() {
        Object[][] param = new Object[][] {
                {"1234", 1234},
                {"1405", 1405},
                {"605", 605},
                {"-7", -7},
                {"0", 0}
        };
        return combine(implementationsEightKataDataProvider(), param);
    }
    @Test(dataProvider = "stringToNumberDataProvider")
    public void stringToNumberTest(Eight eight, String str, int expected) {
        Assert.assertEquals(eight.stringToNumber(str), expected);
    }

    @Test
    public void twoDecimalPlacesTest() {
	throw new RuntimeException("Test not implemented");
    }

}
