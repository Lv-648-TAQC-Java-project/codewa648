package com.org.ita.kata.implementation.MakKeywa;

public class Six implements com.org.ita.kata.Six {
    private static String findCity(String town, String strng) {
        String[] townsMeasures = strng.split("\n");
        int indexTheTown = -1;
        for (int i = 0; i < townsMeasures.length; i++) {
            if (townsMeasures[i].contains(town + ":")) {
                indexTheTown = i;
                break;
            }
        }
        if (indexTheTown == -1) {
            return "";
        }
        return townsMeasures[indexTheTown];
    }

    private static double[] getMeasures(String town, String strng) {
        if (findCity(town, strng).equals("")) {
            return null;
        }
        String[] monthMeasures = findCity(town, strng).substring(town.length() + 1).split(",");
        String[] oneRecord;
        double[] measures = new double[monthMeasures.length];
        for (int i = 0; i < monthMeasures.length; i++) {
            oneRecord = monthMeasures[i].split(" ");
            measures[i] = Double.parseDouble(oneRecord[1]);
        }
        return measures;
    }

    private static double avgMeasures(double[] measures) {
        double sum = 0;
        for (int i = 0; i < measures.length; i++) {
            sum += measures[i];
        }
        return sum / measures.length;
    }

    @Override
    public long findNb(long m) {
        long currentVolume = 0;
        long n = 0;
        while (currentVolume < m) {
            n++;
            currentVolume += n * n * n;
        }
        return currentVolume == m ? n : -1;
    }

    @Override
    public String balance(String book) {
        if (book.length() == 0) {
            return "";
        }
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
        return x / 2.0 - Math.pow(x, 2) / 8.0 + Math.pow(x, 3) / 16.0 - 5.0 * Math.pow(x, 4) / 128.0 + 7.0 * Math.pow(x, 5) / 256.0;
    }

    @Override
    public double mean(String town, String strng) {
        double[] measures = getMeasures(town, strng);
        if (measures == null) {
            return -1;
        }
        return avgMeasures(measures);
    }

    @Override
    public double variance(String town, String strng) {
        double[] measures = getMeasures(town, strng);
        if (measures == null) {
            return -1;
        }
        double avg = avgMeasures(measures);
        double diff, diffSquareSum = 0;
        for (int i = 0; i < measures.length; i++) {
            diff = (measures[i] - avg);
            diffSquareSum += diff * diff;
        }
        return (diffSquareSum / measures.length);
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
        int[] amount = new int[lstOf1stLetter.length];
        String letters = "";
        String res = "";
        int indexLetter;
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            letters += lstOf1stLetter[i];
        }
        for (int i = 0; i < lstOfArt.length; i++) {
            indexLetter = letters.indexOf(lstOfArt[i].charAt(0));
            if (indexLetter != -1) {
                amount[indexLetter] += Integer.parseInt(
                        lstOfArt[i].substring(lstOfArt[i].indexOf(" ") + 1)
                );
            }
        }
        for (int i = 0; i < amount.length; i++) {
            if (i == amount.length - 1) {
                res += "(" + lstOf1stLetter[i] + " : " + amount[i] + ")";
                break;
            }
            res += "(" + lstOf1stLetter[i] + " : " + amount[i] + ") - ";
        }
        return res;
    }
}
