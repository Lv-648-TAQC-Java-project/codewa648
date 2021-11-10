package com.org.ita.kata;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SevenTest extends DataProviderUserImplementation {


    @DataProvider
    public Object[][] newAvgValidData() {
        Object[][] param = new Object[][]{
                {new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90, 628},
                {new double[]{14, 30, 5, 7, 9, 11, 15}, 92, 645},
                {new double[]{115, 8, 9, 12, 17, 88, 4}, 77, 363},
                {new double[]{12, 88, 100, 90, 316, 5}, 99, 82}
        };
        return combine(implementationsSevenKataDataProvider(), param);
    }


    @DataProvider
    public Object[][] whereIsHeDataProvider() {
        Object[][] param = new Object[][]{
                {3, 1, 1, 2},
                {5, 2, 3, 3}
        };
        return combine(implementationsSevenKataDataProvider(), param);
    }

    @Test(dataProvider = "whereIsHeDataProvider")
    public void whereIsHeTest(Seven seven, int p, int bef, int aft, int expected) {
        Assert.assertEquals(seven.whereIsHe(p, bef, aft), expected);
    }

    @Test(dataProvider = "newAvgValidData")
    public void newAvgTest(Seven seven, double[] array, double navg, long expected) {
        Assert.assertEquals(seven.newAvg(array, navg), expected);
    }

    @DataProvider
    public Object[][] seriesSumDataProvider() {
        Object[][] param = new Object[][]{
                {5, "1.57"},
                {9, "1.77"},
                {15, "1.94"},
        };
        return combine(implementationsSevenKataDataProvider(), param);
    }

    @Test(dataProvider = "seriesSumDataProvider")
    public void seriesSumTest(Seven seven, int n, String expected) {
        java.util.Locale.setDefault(java.util.Locale.US);
        Assert.assertEquals(seven.seriesSum(n), expected);
    }

}
