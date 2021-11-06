package com.org.ita.kata;

import com.org.ita.kata.implementation.Pidstavskiy.Eigth;
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

    @DataProvider
    public Object[][] countPositivesSumNegativesProvider() {
        Object[][] param = new Object[][] {
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}, new int[]{10, -65}},
                {new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}, new int[]{8, -50}},
                {new int[]{-5, 6, 8, 9, -42, -6, 5, -6, 8, 4, 3, -13, 10, 11}, new int[]{9, -72}}
        };
        return combine(implementationsEightKataDataProvider(), param);
    }

    @Test(dataProvider = "countPositivesSumNegativesProvider")
    public void countPositivesSumNegativesTest(Eight eigth, int[] array, int[] expectedResult) {
        Assert.assertEquals(eigth.countPositivesSumNegatives(array), expectedResult);
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

    @Test
    public void stringToNumberTest() {
	throw new RuntimeException("Test not implemented");
    }

    @Test
    public void twoDecimalPlacesTest() {
	throw new RuntimeException("Test not implemented");
    }

}
