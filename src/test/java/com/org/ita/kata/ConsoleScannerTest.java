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
import java.math.BigDecimal;
import java.math.BigInteger;

public class ConsoleScannerTest {

    InputStream defaultInputStream;

    @BeforeMethod
    public void beforeMethod() {
        defaultInputStream = System.in;
    }

    @AfterMethod
    public void afterMethod() {
        System.setIn(defaultInputStream);
    }

    @DataProvider
    public Object[][] readIntTestDataProvider() {
        return new Object[][]{
                {"0\n", 0},
                {"1\n", 1},
                {"-1\n", -1},
                {"256\n", 256},
                {"-512\n", -512},
                {"2147483647\n", 2147483647},
                {"-2147483647\n", -2147483647},
                {"jdksf\n15\n", 15}
        };
    }

    @Test(dataProvider = "readIntTestDataProvider")
    public void readIntTest(String data, int expected) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Viewer view = new Viewer();
        ConsoleScanner cs = new ConsoleScanner(view);
        int actual = cs.readInt();
        Assert.assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] readLongValidData() {
        return new Object[][]{
                {"9223372036854775807\n", 9223372036854775807L},
                {"8923372036854775807\n", 8923372036854775807L},
                {"372036854775807\n", 372036854775807L},
                {"0\n", 0L},
                {"jdf\n34312324\n", 34312324}
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

    @DataProvider
    public Object[][] readFloatValidDataProvider() {
        return new Object[][]{
                {"2.517\n", 2.517f},
                {"517.89\n", 517.89f},
                {"0.617\n", 0.617f},
                {"sddasd\n0.3244\n",0.3244f}
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

    @DataProvider
    public Object[][] readDoubleDataProvider() {
        return new Object[][]{
                {"4.9e-324\n", 4.9e-324},
                {"1.7e+308\n", 1.7e+308},
                {"23124.2148978357\n", 23124.2148978357},
                {"sfdde\n324.4342\n", 324.4342}
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
                {test1+"\n", expected1},
                {test2+"\n", expected2},
                {test3+"\n", expected3},
                {"jkdshfkjs\n"+test4+"\n", expected4}
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

    @DataProvider
    public Object[][] readBigDecimalValidDataProvider() {
        String data1 = "99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.9";
        BigDecimal expected1 = new BigDecimal(data1);
        String data2 = "9999999999999999999999999999999999999999.99999999999999999999999999999999999999999999999999999";
        BigDecimal expected2 = new BigDecimal(data2);
        String data3 = "9.99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999";
        BigDecimal expected3 = new BigDecimal(data3);
        return new Object[][]{
                {data1+"\n", expected1},
                {data2+"\n", expected2},
                {"jkdsf\n"+data3+"\n", expected3}
        };

    }

    @Test(dataProvider = "readBigDecimalValidDataProvider")
    public void readBigDecimalValidTest(String data, BigDecimal expected) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Viewer view = new Viewer();
        ConsoleScanner cs = new ConsoleScanner(view);
        BigDecimal actual = cs.readBigDecimal();
        Assert.assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] readArrayIntTestDataProvider() {
        return new Object[][]{
                {"0", new int[]{0}},
                {"1,-20", new int[]{1, -20}},
                {"-2147483647,474564,56", new int[]{-2147483647, 474564, 56}},
                {"sadasd,-20\n1,-20", new int[]{1, -20}}
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

    @DataProvider
    public Object[][] readDoubleArrayValidDataProvider() {
        return new Object[][]{
                {"1", new double[]{1}},
                {"1,2", new double[]{1, 2}},
                {"1,2,3", new double[]{1, 2, 3}},
                {"jkadsf,sdjf,123\n1,2,3", new double[]{1, 2, 3}}
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
}
