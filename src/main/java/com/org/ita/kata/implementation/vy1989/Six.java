package com.org.ita.kata.implementation.vy1989;

public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        return null;
    }
    
    /*modify f(x) to give a good approximation of f(x) in the neighborhood of 0*/
    @Override
    public double f(double x) {
    	return x/(Math.sqrt(1 + x) + 1);
    }
    
    //---------------------------------------------------------------------------
    
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
        return null;
    }
}
