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
    public Object[][] wilsonPrimeInvalidData() {

        Object[][] param = new Object[][]{
                {210.0},
                {70.0},
                {384.0},
                {271.0},
                {369.0},
                {498.0},
                {111.0},
                {486.0},
                {158.0},
                {257.0},
                {513.0},
                {302.0},
                {560.0},
                {240.0}

        };
        return combine(implementationsEightKataDataProvider(), param);
    }

    @Test(dataProvider = "wilsonPrimeInvalidData")
    public void amIWilsonInvalidTest(Eight eight, double data) {
        boolean actualResult = eight.amIWilson(data);
        Assert.assertFalse(actualResult);
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

    @DataProvider
    public Object[][] countPositivesSumNegativesProvider() {
        Object[][] param = new Object[][]{
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


    @DataProvider
    public Object[][] divisibleByDataProvider() {
        Object[][] param = new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6}, 2, new int[]{2, 4, 6}},
                {new int[]{1, 2, 3, 4, 5, 6}, 3, new int[]{3, 6}},
                {new int[]{0, 1, 2, 3, 4, 5, 6}, 4, new int[]{0, 4}},
                {new int[]{-1, -2, 3, -4, 5, 10}, 2, new int[]{-2, -4, 10}},
                {new int[]{0, -2, 3, 4, 9, -33}, -3, new int[]{0, 3, 9, -33}}
        };
        return combine(implementationsEightKataDataProvider(), param);
    }

    @Test(dataProvider = "divisibleByDataProvider")
    public void divisibleByTest(Eight eight, int[] numbers, int divider, int[] expected) {
        Assert.assertEquals(eight.divisibleBy(numbers, divider), expected);
    }

    @DataProvider
    public Object[][] litersDataProvider() {
        Object[][] param = new Object[][]{
                {0, 0},
                {-1, 0},
                {-4, 0},
                {4, 2},
                {11, 5}
        };
        return combine(implementationsEightKataDataProvider(), param);
    }

    @Test(dataProvider = "litersDataProvider")
    public void litersTest(Eight eight, int time, int expected) {
        Assert.assertEquals(eight.liters(time), expected);
    }

    @DataProvider
    public Object[][] MpgToKPMDataProvider() {
        Object[][] param = new Object[][]{
                {4.5f, 1.59f},
                {5.50f, 1.95f},
                {7.8f, 2.76f}
        };
        return combine(implementationsEightKataDataProvider(), param);
    }

    @Test(dataProvider = "MpgToKPMDataProvider")
    public void mpgToKPMTest(Eight eight, float mpg, float expected) {
        java.util.Locale.setDefault(java.util.Locale.US);
        Assert.assertEquals(eight.mpgToKPM(mpg), expected);
    }

    @DataProvider
    public Object[][] squareOrSquareRootDataProvider() {
        Object[][] param = new Object[][]{
                {"100,101,5,5,1,1", new int[]{10, 10201, 25, 25, 1, 1}}
                , {"1,2,3,4,5,6", new int[]{1, 4, 9, 2, 25, 36}}
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


    @DataProvider
    Object[][] stringToNumberDataProvider() {
        Object[][] param = new Object[][]{
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


    @DataProvider
    public Object[][] twoDecimalPlacesDataProvider() {
        Object[][] param = new Object[][]{{4.659725356, 4.66},
                {173735326.3783732637948948, 173735326.38},
                {23.449, 23.45}
        };
        return combine(implementationsEightKataDataProvider(), param);
    }

    @Test(dataProvider = "twoDecimalPlacesDataProvider")
    public void twoDecimalPlacesTest(Eight eight, double number, double expected) {
        Assert.assertEquals(eight.twoDecimalPlaces(number), expected);
    }

}
