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
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        int win = 0;
        int draw = 0;
        int lose = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;
        String[] parsingOneMatch;
        boolean firstTeamParsed;

        if (!resultSheet.contains(toFind)) {
            return toFind + ":This team didn't play!";
        }

        String[] allGames = resultSheet.split(",");
        for (String game : allGames) {
            if (game.matches(".*[0-9]+[.][0-9]+.*")) {
                return "Error(float number):" + game;
            }
        }

        String[] firstTeam = new String[allGames.length];
        int[] scoresFistTeam = new int[allGames.length];
        String[] secondTeam = new String[allGames.length];
        int[] scoresSecondTeam = new int[allGames.length];

        for (int i = 0; i < allGames.length; i++) {
            parsingOneMatch = allGames[i].split(" ");
            firstTeam[i] = "";
            secondTeam[i] = "";
            firstTeamParsed = false;
            for (int j = 0; j < parsingOneMatch.length; j++) {
                if (!parsingOneMatch[j].matches("^[0-9]+$")) {
                    if (firstTeamParsed) {
                        secondTeam[i] += parsingOneMatch[j] + " ";
                    } else {
                        firstTeam[i] += parsingOneMatch[j] + " ";
                    }
                } else {
                    if (!firstTeamParsed) {
                        scoresFistTeam[i] = Integer.parseInt(parsingOneMatch[j]);
                        firstTeamParsed = true;
                    } else {
                        scoresSecondTeam[i] = Integer.parseInt(parsingOneMatch[j]);
                    }
                }
            }
        }
        for (int i = 0; i < allGames.length; i++) {
            if ((toFind + " ").equals(firstTeam[i])) {
                if (scoresFistTeam[i] > scoresSecondTeam[i]) {
                    win++;
                    points += 3;
                }
                if (scoresFistTeam[i] == scoresSecondTeam[i]) {
                    draw++;
                    points += 1;
                }
                if (scoresFistTeam[i] < scoresSecondTeam[i]) {
                    lose++;
                }
                scored += scoresFistTeam[i];
                conceded += scoresSecondTeam[i];
            }
            if ((toFind + " ").equals(secondTeam[i])) {
                if (scoresFistTeam[i] < scoresSecondTeam[i]) {
                    win++;
                    points += 3;
                }
                if (scoresFistTeam[i] == scoresSecondTeam[i]) {
                    draw++;
                    points += 1;
                }
                if (scoresFistTeam[i] > scoresSecondTeam[i]) {
                    lose++;
                }
                scored += scoresSecondTeam[i];
                conceded += scoresFistTeam[i];
            }
        }
        if (scored == 0) {
            return toFind + ":This team didn't play!";
        } else {
            return toFind + ":" + "W=" + win + ";D=" + draw + ";L=" + lose + ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + points;
        }
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        String result="";
        if(lstOfArt.length != 0 && lstOf1stLetter.length != 0)
        {
            for(int i = 0; i < lstOf1stLetter.length; i++)
            {
                String currentLetter= lstOf1stLetter[i];
                int count =0;
                for(int q = 0; q < lstOfArt.length; q++)
                {
                    String currentArt = lstOfArt[q];
                    if( currentArt.substring(0,1).equals(currentLetter) )
                    {
                        String[] artValues = currentArt.split(" ");
                        count += Integer.parseInt(artValues[1]);
                    }
                }
                String stock = "(" + currentLetter + " : " + count + ")";
                if(i != lstOf1stLetter.length - 1)
                {
                    result += stock + " - ";
                }
                else
                {
                    result += stock;
                }
            }
        }
        return result;
    }
}
