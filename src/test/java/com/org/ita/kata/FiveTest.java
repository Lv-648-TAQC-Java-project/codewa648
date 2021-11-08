package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.math.BigInteger;


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
