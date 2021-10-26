package com.org.ita.kata.implementation.Mykhailo5;

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
