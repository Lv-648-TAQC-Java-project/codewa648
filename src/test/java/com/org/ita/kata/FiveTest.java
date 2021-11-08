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
            {new BigInteger(String.valueOf(5)), new BigInteger(String.valueOf(80))},
            {new BigInteger(String.valueOf(7)), new BigInteger(String.valueOf(216))},
            {new BigInteger(String.valueOf(30)), new BigInteger(String.valueOf(14098308))}
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
