package com.org.ita.kata.implementation.vy1989;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Six implements com.org.ita.kata.Six {

    /*Your task is to construct a building which will be a pile of n cubes.
     * The cube at the bottom will have a volume of n^3,
     * the cube above will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.
     */
    @Override
    public long findNb(long m) {
        long countOfCubes = 0;
        long sumOfVolumesOfCubes = 0;

        for (long i = m; i >= 1; i -= (long) Math.pow(countOfCubes, 3))
            countOfCubes++;

        for (long i = 1; i <= countOfCubes; i++)
            sumOfVolumesOfCubes += (long) Math.pow(i, 3);

        return sumOfVolumesOfCubes == m ? countOfCubes : -1;
    }


    /*You are given a (small) check book as a - sometimes - cluttered (by non-alphanumeric characters) string
	The first line shows the original balance. Each other line (when not blank) gives information: check number, category, check amount. 
	(Input form may change depending on the language).
	First you have to clean the lines keeping only letters, digits, dots and spaces.
	Then return a report as a string (underscores show spaces -- don't put them in your solution. 
	They are there so you can see them and how many of them you need to have):
	On each line of the report you have to add the new balance and then in the last two lines the total expense and the average expense. 
	So as not to have a too long result string we don't ask for a properly formatted result.*/
    @Override
    public String balance(String book) {
        StringBuilder bookBuilder = new StringBuilder();
        double totalBalance = 0;
        double totalExpense = 0;
        int avgCounter = 0;

        Pattern pattern = Pattern.compile("[\\w.\n ]");
        Matcher matcher = pattern.matcher(book);

        while (matcher.find()) {
            bookBuilder.append(book, matcher.start(), matcher.end());

        }
        book = bookBuilder.toString().replace("\n", " ");
        bookBuilder = new StringBuilder();
        String[] nodes = book.split(" ");
        if (nodes[0].matches("([0-9]*)\\.([0-9]*)")) totalBalance = Double.parseDouble(nodes[0]);
        bookBuilder.append("Original Balance: " + String.format("%.2f", totalBalance).replace(",", ".") + "\\r\\n");
        for (int i = 1; i < nodes.length; i++) {
            //bookBuilder.append(!nodes[i].isBlank() ? nodes[i] + " " : nodes[i]);// for Java 11
            bookBuilder.append(!nodes[i].matches("\\p{IsWhite_Space}*") ? nodes[i] + " " : nodes[i]);
            if (nodes[i].matches("([0-9]*)\\.([0-9]*)")) {
                double moneyAmount = Double.parseDouble(nodes[i]);
                totalBalance -= moneyAmount;
                totalExpense += moneyAmount;
                bookBuilder.append("Balance " + String.format("%.2f", totalBalance).replace(",", ".") + "\\r\\n");
                avgCounter++;
            }
        }
        bookBuilder.append("Total expense  " + String.format("%.2f", totalExpense).replace(",", "."));
        bookBuilder.append("\\r\\nAverage expense  " + String.format("%.2f", totalExpense / avgCounter).replace(",", "."));

        return bookBuilder.toString();
    }

    @Override
    public double f(double x) {
        return x / (Math.sqrt(1 + x) + 1);
    }


    /*function: mean(town, strng) should return the average of rainfall for the city town and the strng data or data1.
      function: variance(town, strng) should return the variance of rainfall for the city town and the strng data or data1.*/
    private String getRow(String town, String[] dataRows, StringBuilder dataRow) {
        Pattern pattern = Pattern.compile("[\\d.,]");
        Matcher matcher;

        for (int i = 0; i < dataRows.length; i++)
            if (dataRows[i].contains(town)) {
                String[] tmp = dataRows[i].split(":");
                if (!tmp[0].equals(town)) continue;

                matcher = pattern.matcher(dataRows[i]);
                while (matcher.find())
                    dataRow.append(dataRows[i], matcher.start(), matcher.end());
                dataRow.append(",");
            }

        return dataRow.toString();
    }

    @Override
    public double mean(String town, String strng) {
        double valuesSum = 0;
        String[] dataRows = strng.split("\n");
        StringBuilder dataRow = new StringBuilder();
        dataRows = getRow(town, dataRows, dataRow).split(",");

        for (String node : dataRows) {
            if (node.isEmpty()) return -1;
            valuesSum += Double.parseDouble(node);
        }

        return dataRows.length % 12 != 0 ? -1 : valuesSum / dataRows.length;
    }

    @Override
    public double variance(String town, String strng) {
        double varianceSum = 0;
        String[] dataRows = strng.split("\n");
        StringBuilder dataRow = new StringBuilder();
        dataRows = getRow(town, dataRows, dataRow).split(",");

        double mean = mean(town, strng);

        for (String node : dataRows) {
            if (node.isEmpty()) return -1;
            varianceSum += Math.pow(Double.parseDouble(node) - mean, 2);
        }

        return dataRows.length % 12 != 0 ? -1 : varianceSum / dataRows.length;
    }

    /*Given a string of results and the name of a team (parameter : to_find) your function nbaCup will return as a string*/
    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind.isEmpty()) return "";
        int wins = 0;
        int draws = 0;
        int loses = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;
        boolean teamExist = false;
        boolean changeParsedArea = false;
        boolean changeParsedScore = true;
        String teams = "Los Angeles Clippers,Dallas Mavericks,New York Knicks,NYK,Atlanta Hawks,Indiana Pacers,Memphis Grizzlies,"
                + "Los Angeles Lakers,Minnesota Timberwolves,Phoenix Suns,Portland Trail Blazers,New Orleans Pelicans,"
                + "Sacramento Kings,Los Angeles Clippers,Houston Rockets,Denver Nuggets,Cleveland Cavaliers,Milwaukee Bucks,"
                + "Oklahoma City Thunder,San Antonio Spurs,Boston Celtics,Philadelphia 76ers,Brooklyn Nets,Chicago Bulls,"
                + "Detroit Pistons,Utah Jazz,Miami Heat,Charlotte Hornets,Toronto Raptors,Orlando Magic,Washington Wizards,"
                + "Golden State Warriors,Dallas Maver,";
        String[] teamNames = teams.split(",");
        for (String team : teamNames) {
            if (team.equals(toFind)) {
                teamExist = !teamExist;
                break;
            }
        }

        if (!teamExist) return toFind + ":This team didn't play!";

        String[] allGames = resultSheet.split(",");

        for (String currentGame : allGames) {
            int start = 0;
            int end = 0;
            int one = 1;
            int index = currentGame.indexOf(toFind);
            String[] parse = currentGame.split(" ");

            if (index > -1 && index < currentGame.length() / 2 - toFind.length() + 3) {
                start = 0;
                end = parse.length;
                changeParsedArea = !changeParsedArea;
            } else if (index > -1 && index > currentGame.length() / 2 - toFind.length() + 3) {
                start = parse.length - 1;
                end = 0;
                changeParsedArea = !changeParsedArea;
                one = -1;
            }
            int[] twoTeamsScores = new int[2];

            if (changeParsedArea) {
                changeParsedArea = !changeParsedArea;
                for (int i = start; i != end; i += one) {
                    if (parse[i].matches("([0-9]*)\\.([0-9]*)")) {
                        return "Error(float number):" + currentGame;
                    }
                    if (parse[i].matches("^[0-9]*[1-9][0-9]*$") && changeParsedScore) {
                        changeParsedScore = !changeParsedScore;
                        int score = Integer.parseInt(parse[i]);
                        scored += score;
                        conceded += score;
                        twoTeamsScores[0] = score;
                        continue;
                    }
                    if (parse[i].matches("^[0-9]*[1-9][0-9]*$") && !changeParsedScore) {
                        changeParsedScore = !changeParsedScore;
                        int score = Integer.parseInt(parse[i]);
                        conceded += score - twoTeamsScores[0];
                        twoTeamsScores[1] = score;
                    }
                }
                if (twoTeamsScores[0] > twoTeamsScores[1]) {
                    wins++;
                    points += 3;
                } else if (twoTeamsScores[0] < twoTeamsScores[1]) {
                    loses++;
                } else {
                    draws++;
                    points++;
                }

            }
        }
        if (scored == 0) return toFind + ":This team didn't play!";
        return toFind + ":W=" + wins + ";D=" + draws + ";L=" + loses + ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + points;

    }

    /*A bookseller has lots of books classified in 26 categories labeled A, B, ... Z.
     * Each book has a code c of 3, 4, 5 or more characters.
     * The 1st character of a code is a capital letter which defines the book category.*/
    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        String result = "";
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) return result;
        int bookCount = 0;
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            for (String book : lstOfArt) {
                if (book.charAt(0) == lstOf1stLetter[i].charAt(0)) {
                    bookCount += Integer.parseInt(book.split(" ")[1]);
                }
            }
            result += "(" + lstOf1stLetter[i] + " : " + bookCount + ")";
            if (i < lstOf1stLetter.length - 1) result += " - ";
            bookCount = 0;
        }
        return result;
    }
}
