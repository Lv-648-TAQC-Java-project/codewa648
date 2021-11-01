package com.org.ita.kata.implementation.Mykhailo5;

public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        long sum = 0;
        int counter = 0;

        while(sum<m){
            counter++;
            sum+=(long)counter*counter*counter;
        }
        if(sum==m){
            return counter;
        }
        else{
            return -1;
        }
    }

    @Override
    public String balance(String book) {
        StringBuilder result = new StringBuilder();
        String[] split = book.replaceAll("[^a-zA-Z0-9 \\n.]","").replaceAll("  ", " ").split("\n");
        double cash = Double.parseDouble(split[0]);
        double expense = 0;
        result.append("Original Balance: ").append(String.format("%.2f", cash)).append("\\r\\n");
        for(int i = 1; i < split.length; i++) {
            String[] splitItem = split[i].split(" ");
            double itemExpense = Double.parseDouble(splitItem[splitItem.length - 1]);
            cash -= itemExpense;
            expense += itemExpense;
            result.append(split[i].trim()).append(" Balance ").append(String.format("%.2f", cash)).append("\\r\\n");
        }
        result.append("Total expense  ").append(String.format("%.2f", expense)).append("\\r\\n");
        result.append("Average expense  ").append(String.format("%.2f", expense / (split.length - 1)));

        return result.toString();
    }

    @Override
    public double f(double x) {
        return x/(1+Math.sqrt(x+1));
    }

    @Override
    public double mean(String town, String strng) {
        if (town == null || town.length() == 0 || strng == null || strng.length() == 0) {
            return -1;
        }

        final String[] a = strng.split("\n");
        String[] recs = null;
        double sum = 0;

        for (String str : a) {
            if (str.startsWith(town + ":")) {
                recs = str.split(":")[1].split(",");
                break;
            }
        }
        if (recs == null || recs.length == 0) {
            return -1;
        }

        for (int i = 0; i < recs.length; i++) {
            sum += Double.parseDouble(recs[i].split(" ")[1]);
        }
        return sum / 12.0;
    }

    @Override
    public double variance(String town, String strng) {
        if (town == null || town.length() == 0 || strng == null || strng.length() == 0) {
            return -1;
        }
        final String[] a = strng.split("\n");
        String[] recs = null;
        double sum = 0;

        for (String str : a) {
            if (str.startsWith(town + ":")) {
                recs = str.split(":")[1].split(",");
                break;
            }
        }
        if (recs == null || recs.length == 0) {
            return -1;
        }

        for (int i = 0; i < recs.length; i++) {

            sum += Math.pow((Double.parseDouble(recs[i].split(" ")[1]) - mean(town, strng)), 2);
        }
        return sum/12.0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if(lstOfArt.length==0 || lstOf1stLetter.length==0){
            return "";
        }
        String answer = "";
        for (int i = 0; i < lstOf1stLetter.length ; i++) {
            String bigLetter = lstOf1stLetter[i];
            int count = 0;
            for (int x = 0; x < lstOfArt.length; x++) {
                String art = lstOfArt[x];
                if (art.substring(0, 1).equals(bigLetter)) {
                    String[] artValues = art.split(" ");
                    count += Integer.parseInt(artValues[1]);
                }
            }
            String res = "(" + bigLetter + " : " + count + ")";
            if (i != lstOf1stLetter.length - 1) {
                answer += res + " - ";
            } else {
                answer += res;
            }
        }
        return answer;
    }
}
