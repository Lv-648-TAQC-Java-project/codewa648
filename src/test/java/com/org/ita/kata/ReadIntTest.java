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

public class ReadIntTest {
    InputStream defaultInputStream;

    @BeforeMethod
    public void readIntTestBeforeMethod() {
        defaultInputStream = System.in;
    }

    @DataProvider
    public Object[][] readIntTestDataProvider() {
        return new Object[][] {
                {"0", 0},
                {"1", 1},
                {"-1", -1},
                {"256", 256},
                {"-512", -512},
                {"2147483647", 2147483647},
                {"-2147483647", -2147483647}
        };
    }

    @Test(dataProvider = "readIntTestDataProvider")
    public void readIntTest(String data, float expected) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Viewer view = new Viewer();
        ConsoleScanner cs = new ConsoleScanner(view);
        int actual = cs.readInt();
        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void readIntTestAfterMethod() {
        System.setIn(defaultInputStream);
    }
}