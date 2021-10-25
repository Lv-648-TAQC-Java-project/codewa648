package com.org.ita.kata.implementation.AndriyBarskyi;

public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        book = book.replaceAll("[^0-9A-z\\.\n ]", "");
        book = book.replaceAll("  ", " ");
        book = book.replaceAll(" \n", "\n");
        book = book.trim();
        System.out.println("Clear book\n" + book);
        String[] arr = book.split("\\n");
        double bal = Double.parseDouble(arr[0]);
        double totalExpense = 0;
        for (int i = 1; i < arr.length; i++) {
            totalExpense += Double.parseDouble(arr[i].split(" ")[2]);
            bal -= Double.parseDouble(arr[i].split(" ")[2]);
            arr[i] += " Balance " + String.format("%.2f", bal);
        }
        StringBuilder newBook = new StringBuilder("Original Balance: ");
        for (String s : arr) {
            newBook.append(s).append("\\r\\n");
        }
        newBook.append("Total expense  ").append(String.format("%.2f",
                totalExpense)).append("\\r\\n");
        newBook.append("Average expense  ").append(String.format("%.2f",
                totalExpense / (arr.length - 1)));
        return newBook.toString();
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
