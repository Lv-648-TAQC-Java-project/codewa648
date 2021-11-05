package com.org.ita.kata;

import org.testng.annotations.Test;

import com.org.ita.test_utils.Users;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;

public class FiveTest {
    Users user;
    // final int usersCount = Users.values().length;
    static int userId = 1;

    @BeforeClass
    public void beforeClass() {
	//userId = 1;
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
    public Object[][] solveSumValidData() {
	/*
	 * assertFuzzy(2.00, 5.000000000000e-01); 
	 * assertFuzzy(4.00, 6.096117967978e-01);
	 * assertFuzzy(5.00, 6.417424305044e-01);
	 */
	double expected1 = 5.000000000000e-01;
	double expected2 = 6.096117967978e-01;
	double expected3 = 6.417424305044e-01;

	double data1 = 2.00;
	double data2 = 4.00;
	double data3 = 5.00;

	return new Object[][] { { data1, expected1 }, { data2, expected2 }, { data3, expected3 }

	};
    }

    @Test(invocationCount = 8, dataProvider = "solveSumValidData")
    public void solveSum(double data, double expectedResult) {
	double merr = 1e-12;
	double actualResult = user.getFive().solveSum(data);
	boolean inrange = Math.abs(actualResult - expectedResult) <= merr;
	Assert.assertTrue(inrange);
    }

}