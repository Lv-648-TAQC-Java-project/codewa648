package com.org.ita.kata.implementation.MakKeywa;

public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        return null;
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
        String res = "";
        if (toFind.equals("")) {
            return res;
        }
        String[] allMatches = resultSheet.split(",");
        for (int i = 0; i < allMatches.length; i++) {
            if (allMatches[i].matches(".*[0-9]+[.][0-9]+.*")) {
                res = "Error(float number):" + allMatches[i];
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
            for (int j = 0; j < parsingOneMatch.length; j++) {
                if (!parsingOneMatch[j].matches("^[0-9]+$")) {
                    if (!firstTeamParsed) {
                        team1[i] += parsingOneMatch[j] + " ";
                    } else {
                        team2[i] += parsingOneMatch[j] + " ";
                    }
                } else {
                    if (!firstTeamParsed) {
                        scores1[i] = Integer.parseInt(parsingOneMatch[j]);
                        firstTeamParsed = true;
                    } else {
                        scores2[i] = Integer.parseInt(parsingOneMatch[j]);
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
        return null;
    }
}
