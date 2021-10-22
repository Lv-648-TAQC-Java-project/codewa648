package com.org.ita.kata.implementation.andriy66;

public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        String res = "";
        String endLine = "\\r\\n";
        String cleanBook = book.replaceAll("[^a-zA-Z0-9. \n]", "").replaceAll(" +", " ");
        String[] separatedBook = cleanBook.split("\n");
        float allMoney = Float.parseFloat(separatedBook[0]);
        float moneyLeft = allMoney;
        res += "Original Balance: " + String.format("%.2f", allMoney) + endLine;
        float[] expenses = new float[separatedBook.length - 1];
        for (int i = 1; i < separatedBook.length; i++) {
            String[] bookEntry = separatedBook[i].split(" ");
            expenses[i - 1] = Float.parseFloat(bookEntry[2]);
            moneyLeft -= expenses[i - 1];
            res += bookEntry[0] + " " + bookEntry[1] + " " + bookEntry[2] + " Balance " + String.format("%.2f", moneyLeft) + endLine;
        }
        res += "Total expense  " + String.format("%.2f", (allMoney - moneyLeft)) + endLine;
        res += "Average expense  " + String.format("%.2f", (allMoney - moneyLeft) / (separatedBook.length - 1));
        return res;
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
