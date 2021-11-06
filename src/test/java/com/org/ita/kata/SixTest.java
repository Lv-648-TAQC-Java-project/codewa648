package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SixTest extends DataProviderUserImplementation{

  @DataProvider
  public Object[][] easyBalanceCheckingDataProvider() {
    Object[][] param = new Object[][] {
            {"1000.00!=\n125 Market !=:125.45\n126 Hardware =34.95\n127 Video! 7.45\n128 Book :14.32\n129 Gasoline ::16.10",
                    "Original Balance: 1000.00\\r\\n125 Market 125.45 Balance 874.55\\r\\n126 Hardware 34.95 Balance 839.60\\r\\n127 " +
                            "Video 7.45 Balance 832.15\\r\\n128 Book 14.32 Balance 817.83\\r\\n129 Gasoline 16.10 Balance 801.73\\r\\nTotal " +
                            "expense  198.27\\r\\nAverage expense  39.65" }
    };
    return combine(implementationsSixKataDataProvider(), param);
  }
  @Test(dataProvider = "easyBalanceCheckingDataProvider")
  public void balanceTest(Six six, String book, String expected) {
    java.util.Locale.setDefault(java.util.Locale.US);
    Assert.assertEquals(six.balance(book), expected);
  }

  @Test
  public void fTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void findNbTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void meanTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void nbaCupTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void stockSummaryTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void varianceTest() {
    throw new RuntimeException("Test not implemented");
  }
}
