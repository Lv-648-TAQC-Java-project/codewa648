package com.org.ita.kata.implementation.MakKeywa;

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
        double[] measures = getMeasures(town, strng);
        if (measures == null) {
            return -1;
        }
        return avgMeasures(measures);
    }

    @Override
    public double variance(String town, String strng) {
        double[] measures = getMeasures(town, strng);
        if (measures == null) {
            return -1;
        }
        double avg = avgMeasures(measures);
        double diff, diffSquareSum = 0;
        for (int i = 0; i < measures.length; i++) {
            diff = (measures[i] - avg);
            diffSquareSum += diff * diff;
        }
        return (diffSquareSum / measures.length);
    }
    public static String findCity(String town, String strng) {
        String[] townsMeasures = strng.split("\n");
        int indexTheTown = -1;
        for (int i = 0; i < townsMeasures.length; i++) {
            if (townsMeasures[i].contains(town + ":")) {
                indexTheTown = i;
                break;
            }
        }
        if (indexTheTown == -1) {
            return "";
        }
        return townsMeasures[indexTheTown];
    }

    public static double[] getMeasures(String town, String strng) {
        if (findCity(town, strng).equals("")) {
            return null;
        }
        String[] monthMeasures = findCity(town, strng).substring(town.length() + 1).split(",");
        String[] oneRecord;
        double[] measures = new double[monthMeasures.length];
        for (int i = 0; i < monthMeasures.length; i++) {
            oneRecord = monthMeasures[i].split(" ");
            measures[i] = Double.parseDouble(oneRecord[1]);
        }
        return measures;
    }

    public static double avgMeasures(double[] measures){
        double sum = 0;
        for (int i = 0; i < measures.length; i++) {
            sum += measures[i];
        }
        return sum / measures.length;
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
