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

public class ReadStringArray {
    InputStream defaultInputStream;

    @BeforeMethod
    public void readStringArrayValidTestBeforeMethod() {
        defaultInputStream = System.in;
    }

    @DataProvider
    public Object[][] readStringArrayValidDataProvider() {
        return new Object[][]{
                {"test1", new String[]{"test1"}},
                {"test2,test3", new String[]{"test2", "test3"}},
                {"test4,test5,test6", new String[]{"test4", "test5", "test6"}}
        };
    }

    @Test(dataProvider = "readStringArrayValidDataProvider")
    public void readStringArrayValidTest(String data, String[] expected) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Viewer view = new Viewer();
        ConsoleScanner cs = new ConsoleScanner(view);
        String[] actual = cs.readArrayString();
        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void readStringArrayValidTestAfterMethod() {
        System.setIn(defaultInputStream);
    }
}
