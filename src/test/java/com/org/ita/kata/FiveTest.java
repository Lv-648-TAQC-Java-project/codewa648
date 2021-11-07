package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FiveTest extends DataProviderUserImplementation{

  @Test
  public void artificialRainTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void gapTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void perimeterTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void smallestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void solveSumTest() {
    throw new RuntimeException("Test not implemented");
  }

  @DataProvider
  public Object[][] zerosDataProvider() {

    Object[][] param = new Object[][] {
            { 0, 0 },
            { 6, 1 },
            { 12, 2 },
            { 14, 2 }

    };
    return combine(implementationsFiveKataDataProvider(), param);
  }

  @Test(dataProvider = "zerosDataProvider")
  public void zerosTest(Five five, int data, int expectedResult) {
    Assert.assertEquals(five.zeros(data), expectedResult);
  }
}
