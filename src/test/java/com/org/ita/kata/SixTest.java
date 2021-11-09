package com.org.ita.kata;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SixTest extends DataProviderUserImplementation {

    @Test
    public void balanceTest() {
	throw new RuntimeException("Test not implemented");
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

    @DataProvider
    public Object[][] fValidData() {

	Object[][] param = new Object[][] {
	    { 2.6E-8, 1.29999999155E-8 },
	    { 1.4E-9, 6.999999997549999E-10 },
	    { 5.0E-6, 2.499996875007812E-6 },
	    { 2.4E-7, 1.1999999280000085E-7 },
	    { 2.1E-11, 1.0499999999944874E-11 },
	    { 1.7E-4, 8.499638780702988E-5 },
	    { 1.9E-7, 9.499999548750044E-8 },
	    { 1.8E-8, 8.999999959500001E-9 },
	    { 4.2E-8, 2.0999999779500002E-8 },
	    { 7.0E-5, 3.499938752143656E-5 },
	    { 1.7E-4, 8.499638780702988E-5 },
	    { 3.0E-8, 1.49999998875E-8 },
	    { 2.1E-5, 1.0499944875578806E-5 },
	    { 2.0E-7, 9.99999950000005E-8 },
	    { 3.0E-6, 1.4999988750016876E-6 },
	    { 2.0E-10, 9.999999999500001E-11 },
	    { 7.0E-7, 3.499999387500214E-7 },
	    { 1.7E-7, 8.499999638750031E-8 },
	    { 3.2E-8, 1.5999999872000005E-8 },
	    { 1.8E-5, 8.999959500364496E-6 },
	    { 4.0E-9, 1.999999998E-9 },
	    { 3.4E-7, 1.6999998555000243E-7 },
	    { 2.1E-7, 1.0499999448750058E-7 },
	    { 2.3E-9, 1.14999999933875E-9 },
	    { 1.4E-6, 6.999997550001715E-7 },
	    { 5.0E-5, 2.499968750781226E-5 },
	    { 1.0E-5, 4.9999875000625E-6 },
	    { 3.0E-11, 1.49999999998875E-11 },
	    { 7.0E-5, 3.499938752143656E-5 },
	    { 2.6E-8, 1.29999999155E-8 },
	    { 3.5E-10, 1.7499999998468748E-10 },
	    { 1.7E-6, 8.499996387503072E-7 },
	    { 2.5E-4, 1.2499218847640992E-4 },
	    { 2.4E-4, 1.1999280086387042E-4 },
	    { 3.3E-6, 1.6499986387522462E-6 },
	    { 2.9E-9, 1.44999999894875E-9 },
	    { 2.1E-8, 1.0499999944875E-8 },
	    { 2.2E-5, 1.0999939500665491E-5 },
	    { 2.3E-5, 1.1499933875760425E-5 },
	    { 3.0E-8, 1.49999998875E-8 },
	    { 2.0E-8, 9.999999950000001E-9 },
	    { 1.9E-6, 9.499995487504287E-7 },
	    { 2.4E-9, 1.1999999992799999E-9 },
	    { 8.0E-6, 3.999992000032E-6 },
	    { 8.0E-9, 3.999999992000001E-9 },
	    { 2.3E-6, 1.1499993387507606E-6 },
	    { 8.0E-7, 3.9999992000003193E-7 },
	    { 8.0E-11, 3.99999999992E-11 },
	    { 2.3E-6, 1.1499993387507606E-6 },
	    { 7.0E-7, 3.499999387500214E-7 },
	    { 2.3E-8, 1.1499999933875E-8 },
	    { 2.1E-7, 1.0499999448750058E-7 },
	    { 3.6E-9, 1.7999999983799998E-9 },
	    { 1.3E-9, 6.4999999978875E-10 },
	    { 4.0E-6, 1.999998000004E-6 },
	    { 1.4E-10, 6.999999999755E-11 },
	    { 1.5E-4, 7.499718771091773E-5 },
	    { 1.1E-4, 5.499848758318178E-5 },
	    { 3.0E-8, 1.49999998875E-8 },
	    { 3.4E-4, 1.6998555245597812E-4 },
	};
	return combine(implementationsSixKataDataProvider(), param);
    }

    @Test(dataProvider = "fValidData")
    public void fValidTest(Six six, double data, double expected) {
	double actual = six.f(data);
	boolean inrange = Math.abs((actual - expected) / expected) <= 1e-12;
	Assert.assertTrue(inrange);
    }

    @DataProvider
    public Object[][] fInvalidData() {

	Object[][] param = new Object[][] {
	    { 6.6E-8, 1.29999999155E-8 },
	    { 3.4E-9, 6.999999997549999E-10 },
	    { 2.0E-6, 2.499996875007812E-6 },
	    { 7.4E-7, 1.1999999280000085E-7 },
	    { 4.1E-11, 1.0499999999944874E-11 },
	    { 3.7E-4, 8.499638780702988E-5 },
	    { 3.9E-7, 9.499999548750044E-8 },
	    { 6.8E-8, 8.999999959500001E-9 },
	    { 1.2E-8, 2.0999999779500002E-8 },
	    { 9.0E-5, 3.499938752143656E-5 },
	    { 3.7E-4, 8.499638780702988E-5 },
	    { 5.0E-8, 1.49999998875E-8 },
	    { 4.1E-5, 1.0499944875578806E-5 },
	    { 7.0E-7, 9.99999950000005E-8 },
	    { 5.0E-6, 1.4999988750016876E-6 },
	    { 5.0E-10, 9.999999999500001E-11 },
	    { 1.0E-7, 3.499999387500214E-7 },
	    { 7.7E-7, 8.499999638750031E-8 },
	    { 6.2E-8, 1.5999999872000005E-8 },
	    { 9.8E-5, 8.999959500364496E-6 },
	    { 2.0E-9, 1.999999998E-9 },
	    { 5.4E-7, 1.6999998555000243E-7 },
	    { 9.1E-7, 1.0499999448750058E-7 },
	    { 4.3E-9, 1.14999999933875E-9 },
	    { 4.4E-6, 6.999997550001715E-7 },
	    { 3.0E-5, 2.499968750781226E-5 },
	    { 5.0E-5, 4.9999875000625E-6 },
	    { 8.0E-11, 1.49999999998875E-11 },
	    { 5.0E-5, 3.499938752143656E-5 },
	    { 8.6E-8, 1.29999999155E-8 },
	    { 6.5E-10, 1.7499999998468748E-10 },
	    { 2.7E-6, 8.499996387503072E-7 },
	    { 1.5E-4, 1.2499218847640992E-4 },
	    { 3.4E-4, 1.1999280086387042E-4 },
	    { 4.3E-6, 1.6499986387522462E-6 },
	    { 6.9E-9, 1.44999999894875E-9 },
	    { 8.1E-8, 1.0499999944875E-8 },
	    { 6.2E-5, 1.0999939500665491E-5 },
	    { 7.3E-5, 1.1499933875760425E-5 },
	    { 5.0E-8, 1.49999998875E-8 },
	    { 7.0E-8, 9.999999950000001E-9 },
	    { 3.9E-6, 9.499995487504287E-7 },
	    { 6.4E-9, 1.1999999992799999E-9 },
	    { 3.0E-6, 3.999992000032E-6 },
	    { 5.0E-9, 3.999999992000001E-9 },
	    { 7.3E-6, 1.1499993387507606E-6 },
	    { 4.0E-7, 3.9999992000003193E-7 },
	    { 3.0E-11, 3.99999999992E-11 },
	    { 5.3E-6, 1.1499993387507606E-6 },
	    { 3.0E-7, 3.499999387500214E-7 },
	    { 6.3E-8, 1.1499999933875E-8 },
	    { 4.1E-7, 1.0499999448750058E-7 },
	    { 7.6E-9, 1.7999999983799998E-9 },
	    { 3.3E-9, 6.4999999978875E-10 },
	    { 9.0E-6, 1.999998000004E-6 },
	    { 3.4E-10, 6.999999999755E-11 },
	    { 4.5E-4, 7.499718771091773E-5 },
	    { 6.1E-4, 5.499848758318178E-5 },
	    { 9.0E-8, 1.49999998875E-8 },
	    { 5.4E-4, 1.6998555245597812E-4 },
	};
	return combine(implementationsSixKataDataProvider(), param);
    }
    @Test(dataProvider = "fInvalidData")
    public void fInvalidTest(Six six, double data, double expected) {
	double actual = six.f(data);
	boolean inrange = Math.abs((actual - expected) / expected) <= 1e-12;
	Assert.assertFalse(inrange);
    }
    @DataProvider
    public Object[][] stockSummaryValidData() {
        Object[][] param = new Object[][]{
                {new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"}, new String[]{"A", "B"},
                        "(A : 200) - (B : 1140)"},
                {new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"}, new String[]{"B", "D"},
                        "(B : 1140) - (D : 600)"},
                {new String[]{"MCAR 200", "MDXE 300", "AKWR 250", "BTSQ 890", "ARTY 333"}, new String[]{"A", "M"},
                        "(A : 583) - (M : 500)"},
                {new String[]{"SOFT 648", "MDXE 300", "SFSA 20", "LWOW 50", "ABRT 333"}, new String[]{"S", "M"},
                        "(S : 668) - (M : 300)"},
                {new String[]{"ABAR 250", "CDXE 100", "BKWR 250", "BTSQ 100", "DRTY 300"}, new String[]{"A", "B"},
                        "(A : 250) - (B : 350)"}
        };
        return combine(implementationsSixKataDataProvider(), param);
    }

    @Test(dataProvider = "stockSummaryValidData")
    public void stockSummaryTest(Six six, String[] lstOfArt, String[] lstOf1stLetter, String expected) {
        Assert.assertEquals(six.stockSummary(lstOfArt, lstOf1stLetter), expected);
    }

    @Test
    public void varianceTest() {
        throw new RuntimeException("Test not implemented");
    }
}
