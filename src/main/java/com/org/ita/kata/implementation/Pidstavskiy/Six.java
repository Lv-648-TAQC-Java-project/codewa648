package com.org.ita.kata.implementation.Pidstavskiy;

public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        long actualVolume = 0;
        long count = 0;
        while (actualVolume < m) {
            count++;
            actualVolume += count * count * count;
        }
        if (actualVolume == m) {
            return count;
        } else {
            return -1;
        }
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
        return x / (1 + Math.sqrt(1 + x));
    }

    public static double avgRainfall(double[] records) {
        double sum = 0;
        for (double measure : records) {
            sum += measure;
        }
        return sum / records.length;
    }

    @Override
    public double mean(String town, String strng) {
        double[] records = getRainfall(town, strng);
        if (records == null) {
            return -1;
        }
        return avgRainfall(records);
    }

    public static double[] getRainfall(String town, String strng) {
        if (findCity(town, strng).equals("")) {
            return null;
        }
        String[] oneRecord;
        String[] months = findCity(town, strng).substring(town.length() + 1).split(",");
        double[] rainfall = new double[months.length];
        for (int i = 0; i < months.length; i++) {
            oneRecord = months[i].split(" ");
            rainfall[i] = Double.parseDouble(oneRecord[1]);
        }
        return rainfall;
    }

    @Override
    public double variance(String town, String strng) {
        double[] records = getRainfall(town, strng);
        if (records == null) {
            return -1;
        }
        double avg = avgRainfall(records);
        double diff;
        double diffSquareSum = 0;
        for (double record : records) {
            diff = (record - avg);
            diffSquareSum += diff * diff;
        }
        return (diffSquareSum / records.length);
    }

    public static String findCity(String town, String strng) {
        String[] cities = strng.split("\n");
        int ind = -1;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].contains(town + ":")) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            return "";
        }
        return cities[ind];
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        String result = "";
        int wins = 0;
        int draws = 0;
        int loses = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;
        if (toFind.equals("")) {
            return result;
        }
        String[] allMatches = resultSheet.split(",");
        for (String allMatch : allMatches) {
            if (allMatch.matches(".*[0-9]+[.][0-9]+.*")) {
                result = "Error(float number):" + allMatch;
                return result;
            }
        }
        int n = allMatches.length;
        String[] team1 = new String[n];
        int[] scores1 = new int[n];
        String[] team2 = new String[n];
        int[] scores2 = new int[n];
        String[] parsOneMatch;
        boolean firstTeamParsed;
        for (int i = 0; i < n; i++) {
            parsOneMatch = allMatches[i].split(" ");
            team1[i] = "";
            team2[i] = "";
            firstTeamParsed = false;
            for (String oneMatch : parsOneMatch) {
                if (!oneMatch.matches("^[0-9]+$")) {
                    if (!firstTeamParsed) {
                        team1[i] += oneMatch + " ";
                    } else {
                        team2[i] += oneMatch + " ";
                    }
                } else {
                    if (!firstTeamParsed) {
                        scores1[i] = Integer.parseInt(oneMatch);
                        firstTeamParsed = true;
                    } else {
                        scores2[i] = Integer.parseInt(oneMatch);
                    }
                }
            }
        }
        boolean teamIsFound = false;
        String criteria = toFind + " ";
        for (int i = 0; i < n; i++) {
            if (criteria.equals(team1[i])) {
                if (scores1[i] > scores2[i]) {
                    wins++;
                    points += 3;
                }
                if (scores1[i] == scores2[i]) {
                    draws++;
                    points += 1;
                }
                if (scores1[i] < scores2[i]) {
                    loses++;
                }
                scored += scores1[i];
                conceded += scores2[i];
                teamIsFound = true;
            }
            if (criteria.equals(team2[i])) {
                if (scores1[i] < scores2[i]) {
                    wins++;
                    points += 3;
                }
                if (scores1[i] == scores2[i]) {
                    draws++;
                    points += 1;
                }
                if (scores1[i] > scores2[i]) {
                    loses++;
                }
                scored += scores2[i];
                conceded += scores1[i];
                teamIsFound = true;
            }
        }
        if (!teamIsFound) {
            result = toFind + ":This team didn't play!";
        } else {
            result = toFind + ":" + "W=" + wins + ";D=" + draws + ";L=" + loses + ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + points;
        }
        return result;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
