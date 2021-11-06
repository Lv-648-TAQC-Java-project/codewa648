package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SixTest extends DataProviderUserImplementation {

    @Test
    public void balanceTest() {
        throw new RuntimeException("Test not implemented");
    }

    @Test
    public void fTest() {
        throw new RuntimeException("Test not implemented");
    }

    @Test
    public void findNbTest() {
        throw new RuntimeException("Test not implemented");
    }

    @Test
    public void meanTest() {
        throw new RuntimeException("Test not implemented");
    }

    @Test
    public void nbaCupTest() {
        throw new RuntimeException("Test not implemented");
    }

    @DataProvider
    public Object[][] stockSummaryValidData() {
        Object[][] param = new Object[][]{
                {new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"}, new String[]{"A", "B"},
                        "(A : 200) - (B : 1140)"},
                {new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"}, new String[]{"B", "D"},
                        "(B : 1140) - (D : 600)"},
                {new String[]{"MCAR 200", "MDXE 300", "AKWR 250", "BTSQ 890", "ARTY 333"}, new String[]{"A", "M"},
                        "(A : 583) - (M : 500)"},
                {new String[]{"SOFT 648", "MDXE 300", "SFSA 20", "LWOW 50", "ABRT 333"}, new String[]{"S", "M"},
                        "(S : 668) - (M : 300)"},
                {new String[]{"ABAR 250", "CDXE 100", "BKWR 250", "BTSQ 100", "DRTY 300"}, new String[]{"A", "B"},
                        "(A : 250) - (B : 350)"}
        };
        return combine(implementationsSixKataDataProvider(), param);
    }

    @Test(dataProvider = "stockSummaryValidData")
    public void stockSummaryTest(Six six, String[] lstOfArt, String[] lstOf1stLetter, String expected) {
        Assert.assertEquals(six.stockSummary(lstOfArt, lstOf1stLetter), expected);
    }

    @Test
    public void varianceTest() {
        throw new RuntimeException("Test not implemented");
    }
}