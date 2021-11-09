package com.org.ita.kata;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigDecimal;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.org.ita.utils.ConsoleScanner;
import com.org.ita.utils.Viewer;

public class ReadBigDecimalTest {
    InputStream defaultInputStream;
    
    @BeforeMethod
    public void readBigDecimalValidTestBeforeMethod() {
	defaultInputStream = System.in;
    }
    
    
    @AfterMethod
    public void readBigDecimalValidTestAfterMethod() {
	System.setIn(defaultInputStream);
    }
    
    @DataProvider
    public Object[][] readBigDecimalValidDataProvider() {
	String data1 = "99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.9";
	BigDecimal expected1 = new BigDecimal(data1);
	String data2 = "9999999999999999999999999999999999999999.99999999999999999999999999999999999999999999999999999";
	BigDecimal expected2 = new BigDecimal(data2);
	String data3 = "9.99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999";
	BigDecimal expected3 = new BigDecimal(data3);
	return new Object[][] {
	    {data1, expected1},
	    {data2, expected2},
	    {data3, expected3}
	};
	
    }
    @Test(dataProvider = "readBigDecimalValidDataProvider")
    public void readBigDecimalValidTest(String data, BigDecimal expected) {
	System.setIn(new ByteArrayInputStream(data.getBytes()));
	Viewer view = new Viewer();
	ConsoleScanner cs = new ConsoleScanner(view);
	BigDecimal actual = cs.readBigDecimal();
	Assert.assertEquals(actual, expected);
    }
    
    
   
}