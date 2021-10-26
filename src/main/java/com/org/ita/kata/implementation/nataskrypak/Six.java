package com.org.ita.kata.implementation.nataskrypak;

import java.util.Arrays;

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
        return Arrays.stream(strng.split("\n"))
                .filter(s -> s.substring(0,s.indexOf(":")).equals(town))
                .flatMap(s -> Arrays.stream(s.split(",")))
                .mapToDouble(s -> Double.valueOf(s.substring(s.indexOf(" "))))
                .average()
                .orElse(-1.);
    }

    @Override
    public double variance(String town, String strng) {
        double mean = mean(town, strng);
        return Arrays.stream(strng.split("\n"))
                .filter(s -> s.substring(0,s.indexOf(":")).equals(town))
                .flatMap(s -> Arrays.stream(s.split(",")))
                .mapToDouble(s -> Double.valueOf(s.substring(s.indexOf(" "))))
                .map(d -> (d - mean) * (d - mean))
                .average()
                .orElse(-1.);
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
