package com.org.ita.kata;

import com.org.ita.utils.ConsoleScanner;
import com.org.ita.utils.Viewer;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ReadDoubleArray {
    InputStream defaultInputStream;

    @BeforeMethod
    public void readDoubleArrayTestBeforeMethod() {
        defaultInputStream = System.in;
    }

    @DataProvider
    public Object[][] readDoubleArrayValidDataProvider() {
        return new Object[][]{
                {"1", new double[]{1}},
                {"1,2", new double[]{1, 2}},
                {"1,2,3", new double[]{1, 2, 3}}
        };
    }

    @Test(dataProvider = "readDoubleArrayValidDataProvider")
    public void readDoubleArrayValidTest(String data, double[] expected) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Viewer view = new Viewer();
        ConsoleScanner cs = new ConsoleScanner(view);
        double[] actual = cs.readArrayDouble();
        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void readDoubleArrayValidTestAfterMethod() {
        System.setIn(defaultInputStream);
    }
}
