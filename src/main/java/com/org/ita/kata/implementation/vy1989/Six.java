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
    /*A bookseller has lots of books classified in 26 categories labeled A, B, ... Z. 
     * Each book has a code c of 3, 4, 5 or more characters. 
     * The 1st character of a code is a capital letter which defines the book category.*/
    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
    	String result = "";
		if(lstOfArt.length == 0 || lstOf1stLetter.length == 0)return result;
		int bookCount = 0;
		for(int i = 0; i < lstOf1stLetter.length;i++) {
			for(String book : lstOfArt) {
				if(book.charAt(0)==lstOf1stLetter[i].charAt(0)) {
					bookCount+=Integer.parseInt(book.split(" ")[1]);
				}
			}
			result += "("+lstOf1stLetter[i]+" : "+bookCount+")";
			if(i<lstOf1stLetter.length-1)result+=" - ";
			bookCount = 0;
		}
		return result;
    }
}
