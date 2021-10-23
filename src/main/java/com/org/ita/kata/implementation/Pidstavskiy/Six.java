package com.org.ita.kata.implementation.Pidstavskiy;

public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        long actualVolume = 0;
        long count = 0;
        while (actualVolume < m) {
            count++;
            actualVolume += count * count * count;
        }
        if (actualVolume == m) {
            return count;
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
