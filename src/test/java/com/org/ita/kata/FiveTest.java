package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class FiveTest extends DataProviderUserImplementation {

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

  @DataProvider
  public Object[][] smallestDataProvider() {
    Object[][] param = new Object[][] { {261235,"[126235, 2, 0]" },
            { 285365, "[238565, 3, 1]"},
            {209917,"[29917, 0, 1]"}

    };
    return combine(implementationsFiveKataDataProvider(), param);
  }
  @Test (dataProvider ="smallestDataProvider")
  public void smallestTest(Five five, long number, String expected) {
    Assert.assertEquals(Arrays.toString(five.smallest(number)),expected);
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
