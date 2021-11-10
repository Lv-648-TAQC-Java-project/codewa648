package com.org.ita.kata.implementation.AndriyBarskyi;

public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        long n = 0;
        long sum = 0;
        while (sum < m) {
            n++;
            sum += n * n * n;
        }
        return sum == m ? n : -1;
    }

    @Override
    public String balance(String book) {
        book = book.replaceAll("[^0-9A-z\\\\.\\n ]", "");
        book = book.replaceAll("  ", " ");
        book = book.replaceAll(" \n", "\n");
        book = book.trim();
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
        for (String i : towns) {
            if (i.split(":")[0].equals(town)) {
                townInfo = i;
            }
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
        for (String i : towns) {
            if (i.split(":")[0].equals(town)) {
                townInfo = i;
            }
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
        String res = "";
        if (toFind.equals("")) {
            return res;
        }
        String[] allMatches = resultSheet.split(",");
        for (String allMatch : allMatches) {
            if (allMatch.matches(".*[0-9]+[.][0-9]+.*")) {
                res = "Error(float number):" + allMatch;
                return res;
            }
        }
        int n = allMatches.length;
        String[] team1 = new String[n];
        int[] scores1 = new int[n];
        String[] team2 = new String[n];
        int[] scores2 = new int[n];
        String[] parsingOneMatch;
        boolean firstTeamParsed;
        for (int i = 0; i < n; i++) {
            parsingOneMatch = allMatches[i].split(" ");
            team1[i] = "";
            team2[i] = "";
            firstTeamParsed = false;
            for (String oneMatch : parsingOneMatch) {
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
        int wins = 0;
        int draws = 0;
        int loses = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;
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
            res = toFind + ":This team didn't play!";
        } else {
            res = toFind + ":" + "W=" + wins + ";D=" + draws + ";L=" + loses + ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + points;
        }
        return res;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        int[] sum = new int[lstOf1stLetter.length];
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            for (String j : lstOfArt) {
                if (j.startsWith(lstOf1stLetter[i])) {
                    sum[i] += Integer.parseInt(j.split(" ")[1]);
                }
            }
        }
        String result = "(" + lstOf1stLetter[0] + " : " + sum[0] + ")";
        for (int i = 1; i < lstOf1stLetter.length; i++) {
            result += " - (" + lstOf1stLetter[i] + " : " + sum[i] + ")";
        }
        return result;
    }
}
