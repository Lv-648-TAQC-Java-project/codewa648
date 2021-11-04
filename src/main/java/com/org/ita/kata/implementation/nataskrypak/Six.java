package com.org.ita.kata.implementation.nataskrypak;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        long i = 0;
        long cube = 0;
        while (cube < m) {
            i++;
            cube += (i * i * i);
        }
        return cube != m ? -1 : i;
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
        return x / (1 + Math.sqrt(x + 1));
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
        List<String> games = Arrays.stream(resultSheet.split(",")).filter(x -> x.contains(toFind + " ")).collect(Collectors.toList());
        if (toFind.isEmpty()) {
            return "";
        }
        if (games.isEmpty()) {
            return toFind+":This team didn't play!";
        }
        List<String[]> teams = games.stream().map(game -> game.split("\\s\\d+(\\W|$)")).collect(Collectors.toList());
        List<Integer[]> scores = games.stream()
                .map(game -> Arrays.stream(game.split(" "))
                        .filter(x -> x.matches("\\d+"))
                        .map(Integer::valueOf).toArray(Integer[]::new))
                .collect(Collectors.toList());
        int wins = 0, draws = 0, lose = 0, scored = 0, conceded = 0, points = 0;
        for (int i = 0; i < teams.size(); i++) {
            try {
                boolean draw = scores.get(i)[0].equals(scores.get(i)[1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                return "Error(float number):" + games.get(i);
            }
            boolean teamFirst = teams.get(i)[0].equals(toFind);
            if (teamFirst) {
                scored += scores.get(i)[0];
                conceded += scores.get(i)[1];
            } else {
                scored += scores.get(i)[1];
                conceded += scores.get(i)[0];
            }
            if (scores.get(i)[0].equals(scores.get(i)[1])) {
                draws++;
                points++;
            } else if (scores.get(i)[0] < scores.get(i)[1]) {
                if (teamFirst) {
                    lose++;
                } else {
                    wins++;
                    points += 3;
                }
            } else {
                if (teamFirst) {
                    wins++;
                    points += 3;
                } else {
                    lose++;
                }
            }
        }
        return String.format(toFind + ":W=%s;D=%s;L=%s;Scored=%s;Conceded=%s;Points=%s",
                wins, draws, lose, scored, conceded, points);
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return " ";
        }
        String result = " ";
        for (String i : lstOf1stLetter) {
            int sum = 0;
            for (String j : lstOfArt) {
                sum += j.substring(0, 1).equals(i) ? Integer.parseInt(j.replaceAll("[^0-9]","")) : 0;
            }
            result += " - (" + i + " : " + sum + ")";
        }
        return result.substring(3);
    }
}
