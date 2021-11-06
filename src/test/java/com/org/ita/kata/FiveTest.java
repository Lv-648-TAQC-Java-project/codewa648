package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class FiveTest extends DataProviderUserImplementation{

  @Test
  public void artificialRainTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void gapTest() {
    throw new RuntimeException("Test not implemented");
  }

  @DataProvider
  public Object[][] perimeterOfSquaresInARectangleDataProvider() {

    Object[][] param = new Object[][] {
            {5, 80},
            {7, 216},
            {30, 14098308}
    };
    return combine(implementationsFiveKataDataProvider(), param);
  }
  @Test(dataProvider = "perimeterOfSquaresInARectangleDataProvider")
  public void perimeterTest(Five five, BigInteger n, BigInteger expected) {
    Assert.assertEquals(five.perimeter(n), expected);
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
