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
import java.math.BigInteger;

public class ReadBigIntegerTest {
    InputStream defaultInputStream;

    @BeforeMethod
    public void ReadBigIntegerTestBeforeMethod() {
        defaultInputStream = System.in;
    }

    @DataProvider
    public Object[][] ReadBigIntegerDataProvider() {
        String test1 = "9999999999999999999999999999999999999999999999999999999999999999999999";
        BigInteger expected1 = new BigInteger(test1);
        String test2 = "0000000000000000000000000000000000000000000000000000000000";
        BigInteger expected2 = new BigInteger(test2);
        String test3 = "9657340220494756429392457655819181184725950006958367375";
        BigInteger expected3 = new BigInteger(test3);
        String test4 = "-9657340220494756429392457655819181184725950006958367375";
        BigInteger expected4 = new BigInteger(test4);
        return new Object[][]{
                {test1, expected1},
                {test2, expected2},
                {test3, expected3},
                {test4, expected4}
        };
    }

    @Test(dataProvider = "ReadBigIntegerDataProvider")
    public void readBigIntegerTest(String data, BigInteger expected) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Viewer view = new Viewer();
        ConsoleScanner cs = new ConsoleScanner(view);
        BigInteger actual = cs.readBigInteger();
        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void readBigIntegerTestAfterMethod() {
        System.setIn(defaultInputStream);
    }
}
