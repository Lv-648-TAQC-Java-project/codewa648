package com.org.ita.kata.implementation.vy1989;

import com.org.ita.kata.Eight;

public class Eigth implements Eight {
    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    //Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
  	@Override
      public int[] countPositivesSumNegatives(int[] input) throws NullPointerException {
      	int[] countOfPositivesAndSumOfNegatives = new int [0];
  		try {
  		    if(input.length > 0) countOfPositivesAndSumOfNegatives = new int [2];
  			
  			for(int el : input) {
  			    if(el > 0) 
  			        countOfPositivesAndSumOfNegatives[0]++;
  				else if(el < 0) 
  			        countOfPositivesAndSumOfNegatives[1] += el;
  			 } 
  		}
  		catch(NullPointerException e) {
  			 System.out.println(e.getMessage());
  		}
  		 
  		return countOfPositivesAndSumOfNegatives;
      }
  	
  	//---------------------------------------------------------------------------------------------------------------------------------------------


    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
