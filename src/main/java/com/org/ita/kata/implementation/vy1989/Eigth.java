package com.org.ita.kata.implementation.vy1989;

import com.org.ita.kata.Eight;

public class Eigth implements Eight {
    @Override
    public int liters(double time) {
        return 0;
    }

    //Bob needs a fast way to calculate the volume of a cuboid with three values: 
  	//length, width and the height of the cuboid. Write a function to help Bob with this calculation.
  	@Override
      public double getVolumeOfCuboid(double length, double width, double height) {
          return length < 0 || width < 0 || height < 0 ? 0 : length * width * height;
      }
  	
  	//---------------------------------------------------------------------------------------------------------------------------------------------


    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }

    //Write a method, that will get an integer array as parameter and will process every number from this array.
  	@Override
     public int[] squareOrSquareRoot(int[] array) throws NullPointerException {
        int arrayLength = 0;
  	    int [] copyArr = null;
  	    try {
  			arrayLength = array.length;
  			copyArr = new int [arrayLength];
  		    for(int i = 0; i < arrayLength; i++) {
  		    	double take = Math.sqrt(array[i]);
  		    	copyArr[i] = (int) (take % 1 == 0 ? take : Math.pow(array[i],2));
  		    }
  		}
  		catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  		}
  	    
  	    return copyArr;
    }
  	
  	//---------------------------------------------------------------------------------------------------------------------------------------------


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
