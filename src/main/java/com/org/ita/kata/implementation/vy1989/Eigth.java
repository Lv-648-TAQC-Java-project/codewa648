package com.org.ita.kata.implementation.vy1989;

import java.util.ArrayList;
import java.util.List;

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

    //Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor.
  	@Override
      public int[] divisibleBy(int[] numbers, int divider) {
      	 List<Integer> list = new ArrayList<Integer>();
  		 int[] dividedArr = null;
  		 int dividedArrSize = 0;
  		 try {
  		     for(int el : numbers) 
  			 if(el % divider == 0) 
  				 list.add(el);
  		     
  		     dividedArrSize = list.size();
  			 dividedArr = new int[dividedArrSize];
  			 
  			 for(int i = 0; i < dividedArrSize; i++) 
  				dividedArr[i] = list.get(i);
  		 }
  		 catch(NullPointerException e) {
  			 System.out.println(e);
  		 }
  		 catch(ArithmeticException e) {
  			 System.out.println(e);
  		 }
  		 
  		 return dividedArr;
      }
}
