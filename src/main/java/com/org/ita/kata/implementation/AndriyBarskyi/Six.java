package com.org.ita.kata.implementation.AndriyBarskyi;

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
        String[] towns = strng.split("\n");
        String townInfo = "";
        for (String i: towns) {
            if (i.split(":")[0].equals(town))
                townInfo = i;
        }
        if (townInfo.equals("")) {
            return -1.0;
        }
        double avg = 0;
        String[] splitTownInfo = townInfo.split(" ");
        for (int i = 1; i < splitTownInfo.length; i++) {
            avg += Double.parseDouble(splitTownInfo[i].split(",")[0]);
        }
        return avg / 12.0;
    }

    @Override
    public double variance(String town, String strng) {
        String[] towns = strng.split("\n");
        String townInfo = "";
        for (String i: towns) {
            if (i.split(":")[0].equals(town))
                townInfo = i;
        }
        if (townInfo.equals("")) {
            return -1.0;
        }
        double squaresSum = 0;
        String[] splitTownInfo = townInfo.split(" ");
        for (int i = 1; i < splitTownInfo.length; i++) {
            squaresSum += Math.pow((Double.parseDouble(splitTownInfo[i].split(",")[0])
                    - mean(town, strng)), 2);
        }
        return squaresSum / 12.0;
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
