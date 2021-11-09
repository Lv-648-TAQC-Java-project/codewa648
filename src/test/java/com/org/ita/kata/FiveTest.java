package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.math.BigInteger;
import java.util.Arrays;


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

  @DataProvider
  public Object[][] solveSumValidData() {

	Object[][] param = new Object[][] { 
	    { 2.0, 5.000000000000e-01 },
	    { 4.0, 6.096117967978e-01 },
	    { 5.0, 6.417424305044e-01 },
	    { 6.0, 0.6666666666667 },
	    { 8.0, 0.7034648345914 },
	    { 10.0, 0.7298437881284 },
	    { 12.0, 0.75 },
	    { 13.0, 0.7584573119507 },
	    { 14.0, 0.7660773415975 },
	    { 17.0, 0.7850992981495 },
	    { 20.0, 0.8 },
	    { 50.0, 0.868225531212422 },
	    { 500000.0, 0.9985867860840736 },

	};
	return combine(implementationsFiveKataDataProvider(), param);
  }
  
  @Test(dataProvider = "solveSumValidData")
  public void solveSumValidTest(Five five, double data, double expected) {
      double actual = five.solveSum(data);
      boolean inrange = Math.abs(actual - expected) <= 1e-12;
      Assert.assertTrue(inrange);
  }
  
  @DataProvider
  public Object[][] solveSumInvalidData() {

	Object[][] param = new Object[][] { 
	    { 9.0, 5.000000000000e-01 },
	    { 8.0, 6.096117967978e-01 },
	    { 11.0, 6.417424305044e-01 },
	    { 13.0, 0.6666666666667 },
	    { 2.0, 0.7034648345914 },
	    { 3.0, 0.7298437881284 },
	    { 2.0, 0.75 },
	    { 3.0, 0.7584573119507 },
	    { 5.0, 0.7660773415975 },
	    { 7.0, 0.7850992981495 },
	    { 8.0, 0.8 },
	    { 19.0, 0.868225531212422 },
	    { 270000.0, 0.9985867860840736 },

	};
	return combine(implementationsFiveKataDataProvider(), param);
  }
  
  @Test(dataProvider = "solveSumInvalidData")
  public void solveSumInvalidTest(Five five, double data, double expected) {
      double actual = five.solveSum(data);
      boolean inrange = Math.abs(actual - expected) <= 1e-12;
      Assert.assertFalse(inrange);
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
