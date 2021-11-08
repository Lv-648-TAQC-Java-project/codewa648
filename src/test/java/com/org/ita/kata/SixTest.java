package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SixTest extends DataProviderUserImplementation{

  @Test
  public void balanceTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void fTest() {
    throw new RuntimeException("Test not implemented");
  }

  @DataProvider
  public Object[][] findNbDataProvider() {

    Object[][] param = new Object[][] {
            { 4183059834009L, 2022 },
            { 24723578342962L, -1 },
            { 135440716410000L, 4824 },
            { 40539911473216L, 3568 }

    };
    return combine(implementationsSixKataDataProvider(), param);
  }

  @Test(dataProvider = "findNbDataProvider")
  public void findNbTest(Six six, long totalVolume, long expectedResult) {
    Assert.assertEquals(six.findNb(totalVolume), expectedResult);
  }

  @Test
  public void meanTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void nbaCupTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void stockSummaryTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void varianceTest() {
    throw new RuntimeException("Test not implemented");
  }
}
