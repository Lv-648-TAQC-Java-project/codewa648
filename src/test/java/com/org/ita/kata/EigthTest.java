package com.org.ita.kata;

import org.testng.annotations.Test;

import com.org.ita.test_utils.Users;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;

public class EigthTest extends DataProviderUserImplementation {

    @DataProvider
    public Object[][] wilsonPrimeValidData() {
	
	Object[][] param =  new Object[][] { 
	    { 5.0 }, 
	    { 13.0 }, 
	    { 563.0 }

	};
	return combine(implementationsEightKataDataProvider(),param);
    }

    @Test(dataProvider = "wilsonPrimeValidData")
    public void amIWilsonValidTest( double data) {
	//boolean actualResult = eight.amIWilson(data);
	//Assert.assertTrue(actualResult);
    }

    /*
     * @Test public void countPositivesSumNegativesTest() { throw new
     * RuntimeException("Test not implemented"); }
     * 
     * @Test public void divisibleByTest() { throw new
     * RuntimeException("Test not implemented"); }
     * 
     * @Test public void getVolumeOfCuboidTest() { throw new
     * RuntimeException("Test not implemented"); }
     * 
     * @Test public void litersTest() { throw new
     * RuntimeException("Test not implemented"); }
     * 
     * @Test public void mpgToKPMTest() { throw new
     * RuntimeException("Test not implemented"); }
     * 
     * @Test public void squareOrSquareRootTest() { throw new
     * RuntimeException("Test not implemented"); }
     * 
     * @Test public void stringToNumberTest() { throw new
     * RuntimeException("Test not implemented"); }
     * 
     * @Test public void twoDecimalPlacesTest() { throw new
     * RuntimeException("Test not implemented"); }
     */
}
