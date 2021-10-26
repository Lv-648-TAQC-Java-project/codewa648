package com.org.ita.kata.implementation.vy1989;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    
    /*function: mean(town, strng) should return the average of rainfall for the city town and the strng data or data1.
      function: variance(town, strng) should return the variance of rainfall for the city town and the strng data or data1.*/
    private String getRow(String town, String[] dataRows, StringBuilder dataRow) {
		Pattern pattern = Pattern.compile("[\\d.,]");
	    Matcher matcher;
	     
	    for(int i = 0; i < dataRows.length;i++) 
	    	if(dataRows[i].contains(town)) {
	    		String[] tmp  = dataRows[i].split(":");
	    		if(!tmp[0].equals(town))continue;
	    
	    		matcher = pattern.matcher(dataRows[i]);
	    		while(matcher.find()) 
	    			dataRow.append(dataRows[i].substring(matcher.start(), matcher.end()));
	    		dataRow.append(",");
	    	}
		
	    return dataRow.toString();	
	}
    @Override
    public double mean(String town, String strng) {
    	double valuesSum = 0;
		String[] dataRows = strng.split("\n");
		StringBuilder dataRow = new StringBuilder();
		dataRows = getRow(town,dataRows,dataRow).split(",");
		
		for(String node : dataRows) {
			if(node.isEmpty()) return -1;
	    	valuesSum += Double.parseDouble(node);
	    }
		
		return dataRows.length % 12!=0 ? -1 :valuesSum / dataRows.length;
    }

    @Override
    public double variance(String town, String strng) {
    	double varianceSum = 0;
    	String[] dataRows = strng.split("\n");
    	StringBuilder dataRow = new StringBuilder();
		dataRows = getRow(town,dataRows,dataRow).split(",");
		
		double mean = mean(town, strng);
		
		for(String node : dataRows) {
			if(node.isEmpty()) return -1;
			varianceSum += Math.pow(Double.parseDouble(node) - mean,2);
		}
		
		return dataRows.length%12!=0 ? -1 : varianceSum / dataRows.length;
    }
    
    //----------------------------------------------------------------------------------------------------------------------
    
    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
