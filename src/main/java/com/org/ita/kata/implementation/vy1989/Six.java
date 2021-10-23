package com.org.ita.kata.implementation.vy1989;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Six implements com.org.ita.kata.Six {
    @Override
    public long findNb(long m) {
        return 0;
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
	    
	    while(matcher.find()) {
	    	bookBuilder.append(book.substring(matcher.start(), matcher.end()));
	    	
	    }
	    book = bookBuilder.toString().replace("\n"," ");
	    bookBuilder = new StringBuilder();
	    String nodes[] = book.split(" ");
	    if(nodes[0].matches("([0-9]*)\\.([0-9]*)"))totalBalance = Double.parseDouble(nodes[0]);
	    bookBuilder.append("Original Balance: "+String.format("%.2f",totalBalance).replace(",", ".")+"\\r\\n");
	    for(int i = 1;i < nodes.length;i++) {
	    	//bookBuilder.append(!nodes[i].isBlank() ? nodes[i] + " " : nodes[i]);// for Java 11
	    	bookBuilder.append(!nodes[i].matches("\\p{IsWhite_Space}*") ? nodes[i] + " " : nodes[i]); 
	    	if(nodes[i].matches("([0-9]*)\\.([0-9]*)")) {
	    		double moneyAmount = Double.parseDouble(nodes[i]);
	    		totalBalance -= moneyAmount;
	    		totalExpense += moneyAmount;
	    		bookBuilder.append("Balance " + String.format("%.2f",totalBalance).replace(",", ".") + "\\r\\n");
	    		avgCounter++;
	    	}
	    }
	    bookBuilder.append("Total expense  " + String.format("%.2f",totalExpense).replace(",", "."));
	    bookBuilder.append("\\r\\nAverage expense  " + String.format("%.2f",totalExpense / avgCounter).replace(",", "."));
	    
	    return bookBuilder.toString();
    }
    
    //------------------------------------------------------------------------------------------------------------------------------------------
    
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
        return null;
    }
}
