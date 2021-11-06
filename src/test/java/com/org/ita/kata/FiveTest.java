package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FiveTest extends DataProviderUserImplementation{

  @Test
  public void artificialRainTest() {
    throw new RuntimeException("Test not implemented");
  }

  @DataProvider
  public Object[][] gapDataProvider() {
    Object[][] param = new Object[][]{
            {2, 100, 110, new long[]{101, 103}},
            {4, 100, 110, new long[]{103, 107}},
            {6, 100, 110, null},
            {8, 300, 400, new long[]{359, 367}},
            {10, 300, 400, new long[]{337, 347}},

    };
    return combine(implementationsFiveKataDataProvider(), param);
  }

  @Test(dataProvider = "gapDataProvider")
  public void gapTest(Five five, int gap, long start, long end, long[] expected) {
    Assert.assertEquals(five.gap(gap, start, end), expected);
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

  @Test
  public void zerosTest() {
    throw new RuntimeException("Test not implemented");
  }
}
