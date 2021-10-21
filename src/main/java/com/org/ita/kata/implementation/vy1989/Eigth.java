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

    //Create an application that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).
  	@Override
      public float mpgToKPM(float mpg) {
          return Float.parseFloat(String.format("%.2f",mpg * 1.609344f / 4.54609188f)); //kilometers divided into liters
      }
  	
  	//---------------------------------------------------------------------------------------------------------------------------------------------


    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
    }

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
