package com.org.ita.kata;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;

import org.testng.Assert;

public class EigthTest extends DataProviderUserImplementation {

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

    @DataProvider
    public Object[][] divisibleByDataProvider() {
        Object[][] param = new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6}, 2, new int[]{2, 4, 6}},
                {new int[]{1, 2, 3, 4, 5, 6}, 3, new int[]{3, 6}},
                {new int[]{0, 1, 2, 3, 4, 5, 6}, 4, new int[]{0, 4}},
                {new int[]{-1, -2, 3, -4, 5, 10}, 2, new int[]{-2, -4, 10}},
                {new int[]{1, -2, 3, -4, 5, 10}, 0, new int[]{}},
                {new int[]{0, -2, 3, 4, 9, -33}, -3, new int[]{0, 3, 9, -33}}
        };
        return combine(implementationsEightKataDataProvider(), param);
    }

    @Test(dataProvider = "divisibleByDataProvider")
    public void divisibleByTest(Eight eight, int[] numbers, int divider, int[] expected) {
        Assert.assertEquals(eight.divisibleBy(numbers, divider), expected);
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

    @Test
    public void stringToNumberTest() {
	throw new RuntimeException("Test not implemented");
    }

    @Test
    public void twoDecimalPlacesTest() {
	throw new RuntimeException("Test not implemented");
    }

}
