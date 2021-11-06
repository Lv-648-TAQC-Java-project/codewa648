package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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

  @Test
  public void smallestTest() {
    throw new RuntimeException("Test not implemented");
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
  

  @Test
  public void zerosTest() {
    throw new RuntimeException("Test not implemented");
  }
}
