package com.org.ita.kata; 

import org.testng.annotations.Test;

import com.org.ita.test_utils.Users;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;

public class SixTest {
    Users user;
    // final int usersCount = Users.values().length;
    static int userId;// = 1;

    @BeforeClass
    public void beforeClass() {
	userId = 1;
    }

    @BeforeMethod
    public void beforeMethod() {
	user = Users.getById(userId);

    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
	userId++;
    }
    
    @DataProvider
    public Object[][] fValidData() {
	/*
	 * assertFuzzyEquals (ApproxFloat.f(2.6e-08), 1.29999999155e-08);
	 * assertFuzzyEquals (ApproxFloat.f(1.4e-09), 6.999999997549999e-10);
	 * assertFuzzyEquals (ApproxFloat.f(5.0e-06), 2.499996875007812e-06);
	 * assertFuzzyEquals (ApproxFloat.f(5.0e-06), 1.1999999280000085e-07);
	 */
	double expected1 = 1.29999999155e-08;
	double expected2 = 6.999999997549999e-10;
	double expected3 = 2.499996875007812e-06;
	double expected4 = 1.1999999280000085e-07;
	
	double data1 = 2.6e-08;
	double data2 = 1.4e-09;
	double data3 = 5.0e-06;
	double data4 = 2.4e-07;

	return new Object[][] { { data1, expected1}, { data2, expected2 }, { data3, expected3 }, { data4, expected4 }

	};
    }

    @Test(invocationCount = 8, dataProvider = "fValidData")
    public void fValidTest(double data, double expectedResult) {
	double actualResult = user.getSix().f(data);
	Assert.assertEquals(actualResult, expectedResult);
    }
    
    
}
