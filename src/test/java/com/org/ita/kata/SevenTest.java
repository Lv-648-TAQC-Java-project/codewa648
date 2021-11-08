package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SevenTest extends DataProviderUserImplementation {

  @Test
  public void newAvgTest() {
    throw new RuntimeException("Test not implemented");
  }

  @DataProvider
  public Object[][] seriesSumDataProvider() {
    Object[][] param =  new Object[][] {
            {5, "1.57"},
            {9, "1.77"},
            {15, "1.94"},
    };
    return combine(implementationsSevenKataDataProvider(),param);
  }
  @Test(dataProvider="seriesSumDataProvider")
  public void seriesSumTest(Seven seven, int n, String expected) {
    java.util.Locale.setDefault(java.util.Locale.US);
    Assert.assertEquals(seven.seriesSum(n), expected);
  }

  @Test
  public void whereIsHeTest() {
    throw new RuntimeException("Test not implemented");
  }
}
