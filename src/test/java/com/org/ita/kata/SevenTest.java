package com.org.ita.kata;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class SevenTest extends DataProviderUserImplementation {

    @DataProvider
    public Object[][] newAvgValidData() {
        Object[][] param = new Object[][]{
                {new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90, 628},
                {new double[]{14, 30, 5, 7, 9, 11, 15}, 92, 645},
                {new double[]{115, 8, 9, 12, 17, 88, 4}, 77, 363},
                {new double[]{12,88,100,90,316,5}, 99, 82}
        };
        return combine(implementationsSevenKataDataProvider(), param);
    }

    @Test(dataProvider = "newAvgValidData")
    public void newAvgTest(Seven seven, double[] array, double navg, long expected) {
        Assert.assertEquals(seven.newAvg(array, navg), expected);
    }

    @Test
    public void seriesSumTest() {
        throw new RuntimeException("Test not implemented");
    }

    @Test
    public void whereIsHeTest() {
        throw new RuntimeException("Test not implemented");
    }
}
