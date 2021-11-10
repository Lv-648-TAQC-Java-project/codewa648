package com.org.ita.kata.implementation.andriy66;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingDouble;

public class Six implements com.org.ita.kata.Six {
    private static List<Double> parseTemp(String town, String strng) {
        List<Double> temps = new ArrayList<>();
        for (String line : strng.split("\\n")) {
            String[] data = line.split(":");
            if (town.equals(data[0])) {
                for (String weather : data[1].split(",")) {
                    String[] temp = weather.split("\\s");
                    temps.add(Double.parseDouble(temp[1]));
                }
                break;
            }
        }

        if (temps.isEmpty()) temps.add(-1.0);

        return temps;
    }

    @Override
    public long findNb(long m) {
        long currentVolume = 0;
        long n = 0;
        while (currentVolume < m) {
            n++;
            currentVolume += Math.pow(n, 3);
        }
        return currentVolume == m ? n : -1;
    }

    @Override
    public String balance(String book) {
        String t = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] arr = t.split("[\\n]+");
        double current = Double.parseDouble(arr[0]);
        double total = 0;
        int count = 0;
        StringBuilder result = new StringBuilder();
        result.append("Original Balance: " + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            count++;
            String[] line = arr[i].split("[ ]+");
            current -= Double.parseDouble(line[2]);
            total += Double.parseDouble(line[2]);
            String u = String.format("\\r\\n%s %s %s Balance %.2f", line[0], line[1], line[2], current);
            result.append(u);
        }
        result.append(String.format("\\r\\nTotal expense  %.2f\\r\\nAverage expense  %.2f", total, total / count));
        return result.toString();
    }

    @Override
    public double f(double x) {
        return x / (Math.sqrt(1 + x) + 1);
    }

    @Override
    public double mean(String town, String strng) {
        return parseTemp(town, strng).stream()
                .collect(averagingDouble(n -> n));
    }

    @Override
    public double variance(String town, String strng) {
        double mean = mean(town, strng);
        if (mean == -1.0) return -1.0;

        return parseTemp(town, strng).stream()
                .collect(averagingDouble(n -> (n - mean) * (n - mean)));
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        List<String> games = Arrays.stream(resultSheet.split(",")).filter(x -> x.contains(toFind + " ")).collect(Collectors.toList());
        if (toFind.isEmpty()) {
            return "";
        }
        if (games.isEmpty()) {
            return toFind + ":This team didn't play!";
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
                boolean draw = scores.get(i)[0] == scores.get(i)[1];
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
            if (scores.get(i)[0] == scores.get(i)[1]) {
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
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";

        int sum = 0;
        String res = "";

        for (String i : lstOf1stLetter) {
            sum = 0;
            for (String j : lstOfArt) {
                sum += j.substring(0, 1).equals(i) ? Integer.parseInt(j.replaceAll("[^0-9]", "")) : 0;
            }
            res += " - (" + i + " : " + sum + ")";
        }

        return res.substring(3);
    }
}
