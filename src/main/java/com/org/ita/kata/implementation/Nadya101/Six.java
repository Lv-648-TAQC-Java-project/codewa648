package com.org.ita.kata.implementation.Nadya101;

public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        long volumeOfCube = 0;
        long n = 0;
        while (volumeOfCube < m) {
            n += 1;
            volumeOfCube += Math.pow(n, 3);
        }
        if (volumeOfCube == m) {
            return n;
        } else {
            return -1;
        }
    }

    @Override
    public String balance(String book) {
        String[] line;
        double totalExpence = 0;
        String cleanString = book.replaceAll("[^a-zA-Z0-9.\\n\\s]", "");
        String[] lines = cleanString.split("\n");
        double amount = Double.parseDouble(lines[0]);
        String result = "Original Balance: " + lines[0] + "\\r\\n";
        for (int i = 1; i < lines.length; i++) {
            line = lines[i].split(" ");
            amount -= Double.parseDouble(line[2]);
            String balance = String.format("%.2f", amount) + "\\r\\n";
            result += line[0] + " " + line[1] + " " + line[2] + " Balance " + balance;
            totalExpence += Double.parseDouble(line[2]);
        }
        double avgExpence = totalExpence / (lines.length - 1);
        result += "Total expense  " + String.format("%.2f", (totalExpence)) + "\\r\\n" +
                "Average expense  " + String.format("%.2f", avgExpence);
        return result.replace(',', '.');
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        String[] lines = strng.split("\n");
        double avrg = 0;
        double sum = 0;
        if (strng.length() == 0) {
            return -1;
        }
        for (String line : lines) {
            if (line.startsWith(town + ":")) {
                String clearLine = line.replaceAll("[^0-9.,]", "");
                String[] tempOfMonths = clearLine.split(",");
                for (String tempOfMonth : tempOfMonths) {
                    System.out.print(tempOfMonth + " ");
                    sum += Double.parseDouble(tempOfMonth);
                }
            }
        }
        return sum / 12.0;
    }

    @Override
    public double variance(String town, String strng) {
        String[] lines = strng.split("\n");
        double sum = 0;
        if (strng.length() == 0) {
            return -1;
        }
        for (String line : lines) {
            if (line.startsWith(town + ":")) {
                String clearLine = line.replaceAll("[^0-9.,]", "");
                String[] tempOfMonths = clearLine.split(",");
                for (String tempOfMonth : tempOfMonths) {
                    double temp = Double.parseDouble(tempOfMonth);
                    sum += Math.pow(temp - mean(town, strng), 2);
                }
            }
        }
        return sum / 12.0;
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
