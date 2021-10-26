package com.org.ita.kata.implementation.Mykhailo5;

public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        StringBuilder result = new StringBuilder();
        String[] split = book.replaceAll("[^a-zA-Z0-9 \\n.]","").replaceAll("  ", " ").split("\n");
        double cash = Double.parseDouble(split[0]);
        double expense = 0;
        result.append("Original Balance: ").append(String.format("%.2f", cash)).append("\\r\\n");
        for(int i = 1; i < split.length; i++) {
            String[] splitItem = split[i].split(" ");
            double itemExpense = Double.parseDouble(splitItem[splitItem.length - 1]);
            cash -= itemExpense;
            expense += itemExpense;
            result.append(split[i].trim()).append(" Balance ").append(String.format("%.2f", cash)).append("\\r\\n");
        }
        result.append("Total expense  ").append(String.format("%.2f", expense)).append("\\r\\n");
        result.append("Average expense  ").append(String.format("%.2f", expense / (split.length - 1)));

        return result.toString();
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
