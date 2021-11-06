package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FiveTest extends DataProviderUserImplementation {

  @DataProvider
  public Object[][] ArtificialRainDataProvider() {
    Object[][] param =  new Object[][] {
            {new int[]{2}, 1},
            {new int[]{1,2,1,2,1}, 3},
            {new int[]{4,2,3,3,2}, 4}
    };
    return combine(implementationsFiveKataDataProvider(),param);
  }
  @Test(dataProvider="ArtificialRainDataProvider")
  public void artificialRainTest(Five five, int[] v, int expected) {
    Assert.assertEquals(five.artificialRain(v), expected);
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

  @Test
  public void zerosTest() {
    throw new RuntimeException("Test not implemented");
  }
}
