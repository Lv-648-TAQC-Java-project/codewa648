package com.org.ita.kata.implementation.Nadya101;

public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        long volumeOfCube = 0;
        long n = 0;
        while (volumeOfCube < m) {
            n += 1;
            volumeOfCube += Math.pow(n, 3);
        }
        if (volumeOfCube == m) {
            return n;
        } else {
            return -1;
        }
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
