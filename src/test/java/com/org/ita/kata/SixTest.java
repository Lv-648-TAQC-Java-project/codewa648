package com.org.ita.kata;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SixTest extends DataProviderUserImplementation {

    @DataProvider
    public Object[][] easyBalanceCheckingDataProvider() {
        Object[][] param = new Object[][]{
                {"1000.00!=\n125 Market !=:125.45\n126 Hardware =34.95\n127 Video! 7.45\n128 Book :14.32\n129 Gasoline ::16.10",
                        "Original Balance: 1000.00\\r\\n125 Market 125.45 Balance 874.55\\r\\n126 Hardware 34.95 Balance 839.60\\r\\n127 " +
                                "Video 7.45 Balance 832.15\\r\\n128 Book 14.32 Balance 817.83\\r\\n129 Gasoline 16.10 Balance 801.73\\r\\nTotal " +
                                "expense  198.27\\r\\nAverage expense  39.65"},
                {"", ""}
        };
        return combine(implementationsSixKataDataProvider(), param);
    }


    @Test(dataProvider = "easyBalanceCheckingDataProvider")
    public void balanceTest(Six six, String book, String expected) {
        java.util.Locale.setDefault(java.util.Locale.US);
        Assert.assertEquals(six.balance(book), expected);
    }

    @DataProvider
    public Object[][] findNbDataProvider() {

        Object[][] param = new Object[][]{
                {4183059834009L, 2022},
                {24723578342962L, -1},
                {135440716410000L, 4824},
                {40539911473216L, 3568}

        };
        return combine(implementationsSixKataDataProvider(), param);
    }

    @Test(dataProvider = "findNbDataProvider")
    public void findNbTest(Six six, long totalVolume, long expectedResult) {
        Assert.assertEquals(six.findNb(totalVolume), expectedResult);
    }

    @DataProvider
    public Object[][] meanDataProvider() {
        Object[][] param = new Object[][]{{"London", "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
                "\n" +
                "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9" +
                "\n" +
                "Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
                "\n" +
                "NY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
                "\n" +
                "Vancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6,Oct 116.3,Nov 154.6,Dec 171.5" +
                "\n" +
                "Sydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
                "\n" +
                "Bangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
                "\n" +
                "Tokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
                "\n" +
                "Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7" +
                "\n" +
                "Lima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7", 51.199999999999996},


                {"Beijing", "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
                        "\n" +
                        "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9" +
                        "\n" +
                        "Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
                        "\n" +
                        "NY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
                        "\n" +
                        "Vancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6,Oct 116.3,Nov 154.6,Dec 171.5" +
                        "\n" +
                        "Sydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
                        "\n" +
                        "Bangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
                        "\n" +
                        "Tokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
                        "\n" +
                        "Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7" +
                        "\n" +
                        "Lima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7", 52.416666666666664},

        };
        return combine(implementationsSixKataDataProvider(), param);
    }

    @Test(dataProvider = "meanDataProvider")
    public void meanTest(Six six, String town, String strng, double expected) {
        Assert.assertEquals(six.mean(town, strng), expected);

    }

    @DataProvider
    public Object[][] nbaCupDataProvider() {
        String resultSheet1 = "Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112,"
                + "Los Angeles Lakers 111 Minnesota Timberwolves 112,Phoenix Suns 95 Dallas Mavericks 111,Portland Trail Blazers 112 New Orleans Pelicans 94,"
                + "Sacramento Kings 104 Los Angeles Clippers 111,Houston Rockets 85 Denver Nuggets 105,Memphis Grizzlies 76 Cleveland Cavaliers 106,"
                + "Milwaukee Bucks 97 New York Knicks 122,Oklahoma City Thunder 112 San Antonio Spurs 106,Boston Celtics 112 Philadelphia 76ers 95,"
                + "Brooklyn Nets 100 Chicago Bulls 115,Detroit Pistons 92 Utah Jazz 87,Miami Heat 104 Charlotte Hornets 94,"
                + "Toronto Raptors 106 Indiana Pacers 99,Orlando Magic 87 Washington Wizards 88,Golden State Warriors 111 New Orleans Pelicans 95,"
                + "Atlanta Hawks 94 Detroit Pistons 106,Chicago Bulls 97 Cleveland Cavaliers 97,";
        String resultSheet2 = "San Antonio Spurs 111 Houston Rockets 86,Chicago Bulls 103 Dallas Mavericks 102,Minnesota Timberwolves 112 Milwaukee Bucks 108,"
                + "New Orleans Pelicans 93 Miami Heat 90,Boston Celtics 81 Philadelphia 76ers 65,Detroit Pistons 115 Atlanta Hawks 87,"
                + "Toronto Raptors 92 Washington Wizards 82,Orlando Magic 86 Memphis Grizzlies 76,Los Angeles Clippers 115 Portland Trail Blazers 109,"
                + "Los Angeles Lakers 97 Golden State Warriors 136,Utah Jazz 98 Denver Nuggets 78,Boston Celtics 99 New York Knicks 85,"
                + "Indiana Pacers 98 Charlotte Hornets 86,Dallas Mavericks 87 Phoenix Suns 99,Atlanta Hawks 81 Memphis Grizzlies 82,"
                + "Miami Heat 110 Washington Wizards 105,Detroit Pistons 94 Charlotte Hornets 99,Orlando Magic 110 New Orleans Pelicans 107,"
                + "Los Angeles Clippers 130 Golden State Warriors 95,Utah Jazz 102 Oklahoma City Thunder 113,San Antonio Spurs 84 Phoenix Suns 104,"
                + "Chicago Bulls 103 Indiana Pacers 94,Milwaukee Bucks 106 Minnesota Timberwolves 88,Los Angeles Lakers 104 Portland Trail Blazers 102,"
                + "Houston Rockets 120 New Orleans Pelicans 100,Boston Celtics 111 Brooklyn Nets 105,Charlotte Hornets 94 Chicago Bulls 86,Cleveland Cavaliers 103 Dallas Mavericks 97";
        String resultSheet3 = resultSheet1 + resultSheet2;
        String resultSheet4 = "Los Angeles Lakers 97 Golden State Warriors 136,Utah Jazz 98 Denver Nuggets 78,Boston Celtics 99.6 New York Knicks 85";
        Object[][] param = new Object[][]{
                {resultSheet3, "", ""},
                {resultSheet3, "New Orleans Raptors", "New Orleans Raptors:This team didn't play!"},
                {resultSheet3, "Houston Ships", "Houston Ships:This team didn't play!"},
                {resultSheet4, "Boston Celtics", "Error(float number):Boston Celtics 99.6 New York Knicks 85"},
                {resultSheet3, "Los Angeles Lakers", "Los Angeles Lakers:W=1;D=0;L=2;Scored=312;Conceded=350;Points=3"},
                {resultSheet3, "Chicago Bulls", "Chicago Bulls:W=3;D=1;L=1;Scored=504;Conceded=487;Points=10"},
                {resultSheet3, "Cleveland Cavaliers", "Cleveland Cavaliers:W=2;D=1;L=0;Scored=306;Conceded=270;Points=7"},
                {resultSheet3, "Miami Heat", "Miami Heat:W=2;D=0;L=1;Scored=304;Conceded=292;Points=6"}
        };
        return combine(implementationsSixKataDataProvider(), param);
    }

    @Test(dataProvider = "nbaCupDataProvider")
    public void nbaCupTest(Six six, String games, String team, String expected) {
        Assert.assertEquals(six.nbaCup(games, team), expected);
    }

    @DataProvider
    public Object[][] fValidData() {

        Object[][] param = new Object[][]{
                {2.6E-8, 1.29999999155E-8},
                {1.4E-9, 6.999999997549999E-10},
                {5.0E-6, 2.499996875007812E-6},
                {2.4E-7, 1.1999999280000085E-7},
                {2.1E-11, 1.0499999999944874E-11},
                {1.7E-4, 8.499638780702988E-5},
                {1.9E-7, 9.499999548750044E-8},
                {1.8E-8, 8.999999959500001E-9},
                {4.2E-8, 2.0999999779500002E-8},
                {7.0E-5, 3.499938752143656E-5},
                {1.7E-4, 8.499638780702988E-5},
                {3.0E-8, 1.49999998875E-8},
                {2.1E-5, 1.0499944875578806E-5},
                {2.0E-7, 9.99999950000005E-8},
                {3.0E-6, 1.4999988750016876E-6},
                {2.0E-10, 9.999999999500001E-11},
                {7.0E-7, 3.499999387500214E-7},
                {1.7E-7, 8.499999638750031E-8},
                {3.2E-8, 1.5999999872000005E-8},
                {1.8E-5, 8.999959500364496E-6},
                {4.0E-9, 1.999999998E-9},
                {3.4E-7, 1.6999998555000243E-7},
                {2.1E-7, 1.0499999448750058E-7},
                {2.3E-9, 1.14999999933875E-9},
                {1.4E-6, 6.999997550001715E-7},
                {5.0E-5, 2.499968750781226E-5},
                {1.0E-5, 4.9999875000625E-6},
                {3.0E-11, 1.49999999998875E-11},
                {7.0E-5, 3.499938752143656E-5},
                {2.6E-8, 1.29999999155E-8},
                {3.5E-10, 1.7499999998468748E-10},
                {1.7E-6, 8.499996387503072E-7},
                {2.5E-4, 1.2499218847640992E-4},
                {2.4E-4, 1.1999280086387042E-4},
                {3.3E-6, 1.6499986387522462E-6},
                {2.9E-9, 1.44999999894875E-9},
                {2.1E-8, 1.0499999944875E-8},
                {2.2E-5, 1.0999939500665491E-5},
                {2.3E-5, 1.1499933875760425E-5},
                {3.0E-8, 1.49999998875E-8},
                {2.0E-8, 9.999999950000001E-9},
                {1.9E-6, 9.499995487504287E-7},
                {2.4E-9, 1.1999999992799999E-9},
                {8.0E-6, 3.999992000032E-6},
                {8.0E-9, 3.999999992000001E-9},
                {2.3E-6, 1.1499993387507606E-6},
                {8.0E-7, 3.9999992000003193E-7},
                {8.0E-11, 3.99999999992E-11},
                {2.3E-6, 1.1499993387507606E-6},
                {7.0E-7, 3.499999387500214E-7},
                {2.3E-8, 1.1499999933875E-8},
                {2.1E-7, 1.0499999448750058E-7},
                {3.6E-9, 1.7999999983799998E-9},
                {1.3E-9, 6.4999999978875E-10},
                {4.0E-6, 1.999998000004E-6},
                {1.4E-10, 6.999999999755E-11},
                {1.5E-4, 7.499718771091773E-5},
                {1.1E-4, 5.499848758318178E-5},
                {3.0E-8, 1.49999998875E-8},
                {3.4E-4, 1.6998555245597812E-4},
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

        Object[][] param = new Object[][]{
                {6.6E-8, 1.29999999155E-8},
                {3.4E-9, 6.999999997549999E-10},
                {2.0E-6, 2.499996875007812E-6},
                {7.4E-7, 1.1999999280000085E-7},
                {4.1E-11, 1.0499999999944874E-11},
                {3.7E-4, 8.499638780702988E-5},
                {3.9E-7, 9.499999548750044E-8},
                {6.8E-8, 8.999999959500001E-9},
                {1.2E-8, 2.0999999779500002E-8},
                {9.0E-5, 3.499938752143656E-5},
                {3.7E-4, 8.499638780702988E-5},
                {5.0E-8, 1.49999998875E-8},
                {4.1E-5, 1.0499944875578806E-5},
                {7.0E-7, 9.99999950000005E-8},
                {5.0E-6, 1.4999988750016876E-6},
                {5.0E-10, 9.999999999500001E-11},
                {1.0E-7, 3.499999387500214E-7},
                {7.7E-7, 8.499999638750031E-8},
                {6.2E-8, 1.5999999872000005E-8},
                {9.8E-5, 8.999959500364496E-6},
                {2.0E-9, 1.999999998E-9},
                {5.4E-7, 1.6999998555000243E-7},
                {9.1E-7, 1.0499999448750058E-7},
                {4.3E-9, 1.14999999933875E-9},
                {4.4E-6, 6.999997550001715E-7},
                {3.0E-5, 2.499968750781226E-5},
                {5.0E-5, 4.9999875000625E-6},
                {8.0E-11, 1.49999999998875E-11},
                {5.0E-5, 3.499938752143656E-5},
                {8.6E-8, 1.29999999155E-8},
                {6.5E-10, 1.7499999998468748E-10},
                {2.7E-6, 8.499996387503072E-7},
                {1.5E-4, 1.2499218847640992E-4},
                {3.4E-4, 1.1999280086387042E-4},
                {4.3E-6, 1.6499986387522462E-6},
                {6.9E-9, 1.44999999894875E-9},
                {8.1E-8, 1.0499999944875E-8},
                {6.2E-5, 1.0999939500665491E-5},
                {7.3E-5, 1.1499933875760425E-5},
                {5.0E-8, 1.49999998875E-8},
                {7.0E-8, 9.999999950000001E-9},
                {3.9E-6, 9.499995487504287E-7},
                {6.4E-9, 1.1999999992799999E-9},
                {3.0E-6, 3.999992000032E-6},
                {5.0E-9, 3.999999992000001E-9},
                {7.3E-6, 1.1499993387507606E-6},
                {4.0E-7, 3.9999992000003193E-7},
                {3.0E-11, 3.99999999992E-11},
                {5.3E-6, 1.1499993387507606E-6},
                {3.0E-7, 3.499999387500214E-7},
                {6.3E-8, 1.1499999933875E-8},
                {4.1E-7, 1.0499999448750058E-7},
                {7.6E-9, 1.7999999983799998E-9},
                {3.3E-9, 6.4999999978875E-10},
                {9.0E-6, 1.999998000004E-6},
                {3.4E-10, 6.999999999755E-11},
                {4.5E-4, 7.499718771091773E-5},
                {6.1E-4, 5.499848758318178E-5},
                {9.0E-8, 1.49999998875E-8},
                {5.4E-4, 1.6998555245597812E-4},
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

    @DataProvider
    public Object[][] varianceDataProvider() {
        Object[][] param = new Object[][]{

                {"Beijing", "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
                        "\n" +
                        "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9" +
                        "\n" +
                        "Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
                        "\n" +
                        "NY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
                        "\n" +
                        "Vancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6,Oct 116.3,Nov 154.6,Dec 171.5" +
                        "\n" +
                        "Sydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
                        "\n" +
                        "Bangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
                        "\n" +
                        "Tokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
                        "\n" +
                        "Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7" +
                        "\n" +
                        "Lima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7", 4808.37138888889},

        };
        return combine(implementationsSixKataDataProvider(), param);
    }

    @Test(dataProvider = "varianceDataProvider")
    public void varianceTest(Six six, String town1, String strn1, double expected) {
        Assert.assertEquals(six.variance(town1, strn1), expected);

    }
}
