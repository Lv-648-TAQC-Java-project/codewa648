package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SevenTest extends DataProviderUserImplementation{

  @Test
  public void newAvgTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void seriesSumTest() {
    throw new RuntimeException("Test not implemented");
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
}
