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

public class ReadArrayIntTest {
    InputStream defaultInputStream;

    @BeforeMethod
    public void readArrayIntTestBeforeMethod() {
        defaultInputStream = System.in;
    }

    @DataProvider
    public Object[][] readArrayIntTestDataProvider() {
        return new Object[][]{
                {"0", new int[]{0}},
                {"1,-20", new int[]{1, -20}},
                {"-2147483647,474564,56", new int[]{-2147483647, 474564, 56}}
        };
    }

    @Test(dataProvider = "readArrayIntTestDataProvider")
    public void readArrayIntTest(String data, int[] expected) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Viewer view = new Viewer();
        ConsoleScanner cs = new ConsoleScanner(view);
        int[] actual = cs.readArrayInt();
        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void readArrayIntTestAfterMethod() {
        System.setIn(defaultInputStream);
    }
}