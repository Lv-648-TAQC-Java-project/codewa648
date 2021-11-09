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

public class ReadFloatTest {
    InputStream defaultInputStream;

    @BeforeMethod
    public void readFloatValidTestBeforeMethod() {
        defaultInputStream = System.in;
    }

   @DataProvider
       public Object[][] readFloatValidDataProvider() {
           return new Object[][] {
                   {"2.517", 2.517f},
                   {"517.89", 517.89f},
                   {"0.617", 0.617f}
           };
       }

       @Test(dataProvider = "readFloatValidDataProvider")
       public void readFloatValidTest(String data, float expected) {
           System.setIn(new ByteArrayInputStream(data.getBytes()));
           Viewer view = new Viewer();
           ConsoleScanner cs = new ConsoleScanner(view);
           float actual = cs.readFloat();
           Assert.assertEquals(actual, expected);
       }

    @AfterMethod
    public void readFloatValidTestAfterMethod() {
        System.setIn(defaultInputStream);
    }
}
