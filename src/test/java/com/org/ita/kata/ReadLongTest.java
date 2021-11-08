package com.org.ita.kata;

import java.io.ByteArrayInputStream;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.org.ita.utils.ConsoleScanner;
import com.org.ita.utils.Viewer;

import java.io.*;

public class ReadLongTest {

    InputStream defaultInputStream;

    @BeforeMethod
    public void readLongTestBeforeMethod() {
        defaultInputStream = System.in;
    }

    @AfterMethod
    public void readLongTestAfterMethod() {
        System.setIn(defaultInputStream);
    }

    @DataProvider
    public Object[][] readLongValidData() {
        return new Object[][]{
                {"9223372036854775807", 9223372036854775807L},
                {"8923372036854775807", 8923372036854775807L},
                {"372036854775807", 372036854775807L},
                {"0", 0L},
        };
    }

    @Test(dataProvider = "readLongValidData")
    public void readLongTest(String data, long expected) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Viewer view = new Viewer();
        ConsoleScanner cs = new ConsoleScanner(view);
        long actual = cs.readLong();
        Assert.assertEquals(actual, expected);
    }
}