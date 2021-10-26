package com.org.ita.kata.implementation.nataskrypak;

public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        StringBuilder result = new StringBuilder();
        String[] splittedLine = book.replaceAll("[^a-zA-Z0-9 \\n.]"," ").replaceAll(" {2,}", " ").split("\n");
        double balance = Double.parseDouble(splittedLine[0]);
        double expense = 0;
        result.append("Original Balance: ").append(String.format("%.2f", balance)).append("\\r\\n");
        for(int i = 1; i < splittedLine.length; i++) {
            String[] splittedItems = splittedLine[i].split(" ");
            double itemExpense = Double.parseDouble(splittedItems[splittedItems.length - 1]);
            balance -= itemExpense;
            expense += itemExpense;
            result.append(splittedLine[i].trim()).append(" Balance ").append(String.format("%.2f", balance)).append("\\r\\n");
        }
        result.append("Total expense  ").append(String.format("%.2f", expense)).append("\\r\\n");
        result.append("Average expense  ").append(String.format("%.2f", expense / (splittedLine.length - 1)));

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
