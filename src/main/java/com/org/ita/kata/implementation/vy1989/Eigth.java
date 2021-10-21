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

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
    }

    //We need a function that can transform a string into a number
    @Override
    public int stringToNumber(String str) throws NumberFormatException {
    	int numberFromString = 0;
  	   	try {
  	   		numberFromString = Integer.parseInt(str);
  	   	}
  	    catch(NumberFormatException e) {
  	       System.out.println(e.getMessage());
  	    }
  	    return numberFromString;
    }
    
    //---------------------------------------------------------------------------------------------------------------------------------------------


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
