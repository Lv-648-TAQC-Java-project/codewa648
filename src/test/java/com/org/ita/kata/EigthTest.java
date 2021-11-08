package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.StringTokenizer;

public class EigthTest extends DataProviderUserImplementation {

    @DataProvider
    public Object[][] wilsonPrimeValidData() {

        Object[][] param = new Object[][]{{5.0}, {13.0}, {563.0}

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
        Object[][] param = new Object[][]{{1, 2, 2, 4}, {6.3, 2, 5, 63}

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

    @DataProvider
    public Object[][] squareOrSquareRootDataProvider() {
        Object[][] param = new Object[][]{
                {"100,101,5,5,1,1", new int[]{10, 10201 ,25 ,25 ,1 ,1}}
                ,{"1,2,3,4,5,6", new int[]{1, 4, 9, 2, 25, 36}}
        };
        return combine(implementationsEightKataDataProvider(), param);
    }

    @Test(dataProvider = "squareOrSquareRootDataProvider")
    public void squareOrSquareRootTest(Eight eight, String input, int[] expected) {
        StringTokenizer st = new StringTokenizer(input, ",");
        int[] in = new int[st.countTokens()];
        for (int i = 0; i < in.length; i++) {
            in[i] = Integer.parseInt(st.nextToken());
        }
        Assert.assertEquals(Arrays.toString(eight.squareOrSquareRoot(in)), Arrays.toString(expected));
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
