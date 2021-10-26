package com.org.ita.kata.implementation.Mykhailo5;

public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        if (town == null || town.length() == 0 || strng == null || strng.length() == 0) {
            return -1;
        }

        final String[] a = strng.split("\n");
        String[] recs = null;
        double sum = 0;

        for (String str : a) {
            if (str.startsWith(town + ":")) {
                recs = str.split(":")[1].split(",");
                break;
            }
        }
        if (recs == null || recs.length == 0) {
            return -1;
        }

        for (int i = 0; i < recs.length; i++) {
            sum += Double.parseDouble(recs[i].split(" ")[1]);
        }
        return sum / 12.0;
    }

    @Override
    public double variance(String town, String strng) {
        if (town == null || town.length() == 0 || strng == null || strng.length() == 0) {
            return -1;
        }
        final String[] a = strng.split("\n");
        String[] recs = null;
        double sum = 0;

        for (String str : a) {
            if (str.startsWith(town + ":")) {
                recs = str.split(":")[1].split(",");
                break;
            }
        }
        if (recs == null || recs.length == 0) {
            return -1;
        }

        for (int i = 0; i < recs.length; i++) {

            sum += Math.pow((Double.parseDouble(recs[i].split(" ")[1]) - mean(town, strng)), 2);
        }
        return sum/12.0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
