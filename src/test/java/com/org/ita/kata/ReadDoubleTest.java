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

public class ReadDoubleTest {

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
    public Object[][] readDoubleDataProvider() {
        return new Object[][]{
                {"4.9e-324", 4.9e-324},
                {"1.7e+308", 1.7e+308},
                {"23124.2148978357", 23124.2148978357}
        };

    }

    @Test(dataProvider = "readDoubleDataProvider")
    public void readDoubleTest(String data, double expected) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Viewer view = new Viewer();
        ConsoleScanner cs = new ConsoleScanner(view);
        double actual = cs.readDouble();
        Assert.assertEquals(actual, expected);
    }

}