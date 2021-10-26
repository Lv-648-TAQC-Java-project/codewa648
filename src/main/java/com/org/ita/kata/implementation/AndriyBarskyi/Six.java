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
        return x / (1 + Math.sqrt(1.0 + x));
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
