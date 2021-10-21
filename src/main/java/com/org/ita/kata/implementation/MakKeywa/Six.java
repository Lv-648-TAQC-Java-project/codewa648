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
        return null;
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
        for (int i = 0; i < amount.length ; i++) {
            if (i == amount.length - 1) {
                res += "(" + lstOf1stLetter[i] + " : " + amount[i] + ")";
                break;
            }
            res += "(" + lstOf1stLetter[i] + " : " + amount[i] + ") - ";
        }
        return res;
    }
}
