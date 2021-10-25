package com.org.ita.kata.implementation.Pidstavskiy;

public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        String expectedResult = "";
        String changedBook = book.replaceAll("[^a-zA-Z0-9. \n]", "")
                .replaceAll(" +", " ");
        String[] oneLine = changedBook.split("\n");
        double money = Double.parseDouble(oneLine[0]);
        expectedResult += "Original Balance: " + String.format("%.2f", money) + "\\r\\n";
        double[] expenses = new double[oneLine.length - 1];
        double remainderMoney = money;
        for (int i = 1; i < oneLine.length; i++) {
            String[] bookLineSplit = oneLine[i].split(" ");
            expenses[i - 1] = Double.parseDouble(bookLineSplit[2]);
            remainderMoney -= expenses[i - 1];
            expectedResult += bookLineSplit[0] + " " + bookLineSplit[1] + " " + bookLineSplit[2]
                    + " Balance " + String.format("%.2f", remainderMoney) + "\\r\\n";
        }
        expectedResult += "Total expense  " + String.format("%.2f", (money - remainderMoney)) + "\\r\\n";
        expectedResult += "Average expense  " + String.format("%.2f", (money - remainderMoney) / (oneLine.length - 1));
        return expectedResult;
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
