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

public class ReadStringTest {

    InputStream defaultInputStream;

    @BeforeMethod
    public void readStringTestBeforeMethod() {
        defaultInputStream = System.in;
    }

    @DataProvider
    public Object[][] readStringData() {
        return new Object[][]{
                {"test", "test"},
                {"read123", "read123"},
                {"2536", "2536"}
        };
    }

    @Test(dataProvider = "readStringData")
    public void readStringTest(String data, String expected) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Viewer view = new Viewer();
        ConsoleScanner cs = new ConsoleScanner(view);
        String actual = cs.readLine();
        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void readStringTestAfterMethod() {
        System.setIn(defaultInputStream);
    }
}

