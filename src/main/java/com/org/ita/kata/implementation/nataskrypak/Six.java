package com.org.ita.kata.implementation.nataskrypak;

public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        long i = 0;
        long cube = 0;
        while (cube < m) {
            i++;
            cube += (i * i * i);
        }
        return cube != m ? -1 : i;
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
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
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
